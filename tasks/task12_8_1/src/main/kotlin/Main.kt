// Task 12.8.1: demo program for Day enum class

fun main() {
    print("Enter a day of the week: ")
    val input = readlnOrNull()?.trim() ?: ""

    try {
        val day = Day.valueOf(input)
        println("$day is day ${day.ordinal + 1} of the week")
    }
    catch (error: IllegalArgumentException) {
        println("Error: '$input' is not a valid day")
        println("Please enter one of: ${Day.entries.joinToString()}")
    }
}
