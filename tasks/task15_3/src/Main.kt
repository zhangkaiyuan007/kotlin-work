// Task 15.3: program demonstrating dynamic binding

fun main() {
    val p = Person()
    p.speak()

    val s = Student("Computer Science")
    s.speak()

    // Student's speak() is called here, because what matters is the
    // type of the object, not the declared type of the variable
    val p2: Person = Student("Maths")
    p2.speak()
}
