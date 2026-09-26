// Task 5.4.2: main program

fun main() {
    val examples = listOf(
        "",
        "Short",
        "Exactly twenty chars",
        "Twenty-one characters",
        "This string is definitely far too long",
    )

    for (text in examples) {
        println("\"$text\" (length ${text.length}): isTooLong = ${text.isTooLong}")
    }
}
