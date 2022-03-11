package com.github.kaiqkt.stackoverflow

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
class Question {
    var title: String? = null
    var link: String? = null
    var score = 0

    @JsonProperty("answer_count")
    var answers = 0

    @JsonProperty("is_answered")
    var accepted = false
    override fun toString(): String {
        return "Question{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", score=" + score +
                ", answers=" + answers +
                ", accepted=" + accepted +
                '}'
    }
}
