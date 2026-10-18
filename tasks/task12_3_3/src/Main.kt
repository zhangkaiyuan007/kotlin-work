// Task 12.3.3: demo of Person class with an initializer block

fun main() {
    // A name consisting only of spaces is now rejected by the
    // initializer block, so this fails with IllegalArgumentException
    val person = Person("   ", "1997-08-23")

    println("Name:    '${person.name}'")
    println("Born:    ${person.birth}")
    println("Married: ${person.isMarried}")
}
