// Task 12.3.3: Person class, copied from Task 12.3.2

import kotlinx.datetime.LocalDate

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false

    constructor(name: String, birth: String) : this(name, LocalDate.parse(birth))
}
