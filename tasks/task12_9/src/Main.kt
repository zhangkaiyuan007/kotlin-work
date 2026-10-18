// Task 12.9: demo program for class implementing Static Factory Method

import kotlinx.datetime.LocalDate

fun main() {
    // This doesn't compile, because the primary constructor is private:
    // val sarah = Person("Sarah", LocalDate(2005, 7, 16))

    val sarah = Person.create("Sarah", LocalDate(2005, 7, 16))
    println("Created ${sarah.name}, born ${sarah.birth}")

    // Name has already been used, so this fails at run time
    val anotherSarah = Person.create("Sarah", LocalDate(1999, 3, 2))
    println("Created ${anotherSarah.name}, born ${anotherSarah.birth}")
}
