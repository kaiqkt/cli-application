package com.github.kaiqkt.stackoverflow

import picocli.CommandLine
import picocli.CommandLine.Help.Ansi
import kotlin.system.exitProcess

@CommandLine.Command(
    name = "search",
    description = ["Search questions matching criteria."],
    mixinStandardHelpOptions = true
)
class SearchCommand : Runnable {
    @CommandLine.Option(names = ["-q", "--query"], description = ["Search phrase."])
    var query = ""

    @CommandLine.Option(names = ["-t", "--tag"], description = ["Search inside specific tag."])
    var tag = ""

    @CommandLine.Option(names = ["-n", "--limit"], description = ["Limit results. Default: 10"])
    var limit = 10

    @CommandLine.Option(
        names = ["-s", "--sort-by"],
        description = ["Available values: relevance, votes, creation, activity. Default: relevance."]
    )
    var sort = "relevance"

    @CommandLine.Option(names = ["--verbose"], description = ["Print verbose output."])
    var verbose = false

    var client: HttpRequest = HttpRequest()

    override fun run() {
        val response = client.search(query, tag, limit, sort)
        //var response = request.execute(query, tag, limit, sort);
        response.items.stream()
            .map { question: Question -> formatQuestion(question) }
            .forEach(System.out::println)
        if (verbose) {
            System.out.printf(
                "\nItems size: %d | Quota max: %d | Quota remaining: %d | Has more: %s\n",
                response.items.size,
                response.quotaMax,
                response.quotaRemaining,
                response.hasMore
            )
        }
    }

    companion object {
        private fun formatQuestion(question: Question): String {
            return Ansi.AUTO.string(
                java.lang.String.format(
                    "@|bold,fg(green) %s|@ %d|%d @|bold,fg(yellow) %s|@\n      %s",
                    if (question.accepted) "✔" else "",
                    question.score,
                    question.answers,
                    question.title,
                    question.link
                )
            )
        }

        @JvmStatic
        fun main(args: Array<String>): Unit = exitProcess(CommandLine(SearchCommand()).execute(*args))
    }
}