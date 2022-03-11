package com.github.kaiqkt.stackoverflow

import com.fasterxml.jackson.annotation.JsonProperty

class ApiResponse<T> {
    var items = emptyList<T>()

    @JsonProperty("has_more")
    var hasMore = false

    @JsonProperty("quota_max")
    var quotaMax = 0

    @JsonProperty("quota_remaining")
    var quotaRemaining = 0
    override fun toString(): String {
        return "ApiResponse{" +
                "items=" + items +
                ", hasMore=" + hasMore +
                ", quotaMax=" + quotaMax +
                ", quotaRemaining=" + quotaRemaining +
                '}'
    }
}