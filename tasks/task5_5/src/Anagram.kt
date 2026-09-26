// Task 5.5: anagramOf() infix extension function

infix fun String.anagramOf(other: String): Boolean {
    if (length != other.length) {
        return false
    }
    val firstChars = lowercase().toList().sorted()
    val secondChars = other.lowercase().toList().sorted()
    return firstChars == secondChars
}
