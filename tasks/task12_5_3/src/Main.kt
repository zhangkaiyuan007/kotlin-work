// Task 12.5.3: demo program for class with custom setter

import kotlinx.datetime.LocalDate

fun main() {
    val person = Person("Joe Bloggs", LocalDate(1992, 8, 23))
    println(person.name)

    // The custom setter rejects this with an IllegalArgumentException
    person.name = ""
    println(person.name)
}
