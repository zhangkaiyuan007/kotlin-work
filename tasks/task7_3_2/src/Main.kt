// Task 7.3.2: mutable lists

fun main() {
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
    println(numbers)

    numbers[0] = 1
    println("After numbers[0] = 1: $numbers")

    numbers.add(7)
    println("After add(7): $numbers")

    numbers.add(2, 4)
    println("After add(2, 4): $numbers")

    numbers.addAll(listOf(3, 3, 9))
    println("After addAll(listOf(3, 3, 9)): $numbers")

    numbers.remove(3)
    println("After remove(3): $numbers")

    numbers.removeAll(listOf(3, 9))
    println("After removeAll(listOf(3, 9)): $numbers")

    numbers.removeAll { it % 2 == 0 }
    println("After removeAll { it % 2 == 0 }: $numbers")

    numbers.removeAt(0)
    println("After removeAt(0): $numbers")

    numbers.clear()
    println("After clear(): $numbers")
}
