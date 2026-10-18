// Task 12.3.3: demo of Person class with an initializer block

fun main() {
    // Nothing currently stops a Person being given a blank name
    val person = Person("   ", "1997-08-23")

    println("Name:    '${person.name}'")
    println("Born:    ${person.birth}")
    println("Married: ${person.isMarried}")
}
