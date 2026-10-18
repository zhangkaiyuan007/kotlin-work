// Task 12.5.4: demo program for class with a computed property

import kotlinx.datetime.LocalDate

fun main() {
    val person = Person("Joe Bloggs", LocalDate(1992, 8, 23))
    println("${person.name} was born on ${person.birth}")
    println("Today is ${today()}, so ${person.name} is ${person.age} years old")
}
