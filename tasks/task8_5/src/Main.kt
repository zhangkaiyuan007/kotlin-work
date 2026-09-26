// Task 8.5: example of using a higher-order function

fun isEnglishVowel(character: Char) = character.lowercaseChar() in "aeiou"

fun main() {
    val text = "The Quick Brown Fox Jumps Over The Lazy Dog, 42 times!"
    println(text)

    println("Vowels:      ${text.howMany(::isEnglishVowel)}")
    println("Upper case:  ${text.howMany { it.isUpperCase() }}")
    println("Digits:      ${text.howMany { it.isDigit() }}")
    println("Spaces:      ${text.howMany { it == ' ' }}")
    println("Punctuation: ${text.howMany { it in ",.!?" }}")

    // count() from the standard library should give the same results
    println("Vowels (using count): ${text.count(::isEnglishVowel)}")
    println("Digits (using count): ${text.count { it.isDigit() }}")
}
