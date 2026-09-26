// Task 7.3.1: list element access

fun main() {
    val numbers = listOf(9, 3, 6, 2, 8, 5)
    println(numbers)

    println(numbers[0])
    println(numbers.slice(2..4))   // numbers[10] throws IndexOutOfBoundsException
    println(numbers.first())
    println(numbers.last())

    // Neither of these compile, because a List is immutable:
    // numbers[0] = 1
    // numbers.add(1)
}
