package com.github.kaiqkt.stackoverflow

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import java.io.IOException
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.util.zip.GZIPInputStream

class HttpRequest {
    private val mapper: ObjectMapper = ObjectMapper()
    private val stackoverflowApiUrl: String = "https://api.stackexchange.com/2.2"

    fun search(query: String?, tag: String?, limit: Int, sort: String?): ApiResponse<Question> {
        val client = HttpClient.newHttpClient()

        val uri = URI("$stackoverflowApiUrl/search?site=stackoverflow&intitle=$query&tagged=$tag&pagesize=$limit&sort=$sort")

        val request = HttpRequest.newBuilder()
            .GET()
            .uri(uri)
            .build()

        try {
            val response =  client.send(request, HttpResponse.BodyHandlers.ofInputStream())
            val input = if (response.headers().firstValue("Content-Encoding").orElse("") == "gzip") GZIPInputStream(
                response.body()
            ) else response.body()

            return mapper.readValue(input, object : TypeReference<ApiResponse<Question>>() {})
        } catch (e: IOException) {
            throw RuntimeException(e)
        } catch (e: InterruptedException) {
            throw RuntimeException(e)
        }
    }
}