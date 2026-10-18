// Task 12.4.1: main program

fun main() {
    val circle = Circle(Point(1.0, 2.0), 3.0)
    println("Circle with centre (1.0, 2.0) and radius 3.0")

    println("Area      = %.3f".format(circle.area()))
    println("Perimeter = %.3f".format(circle.perimeter()))

    val points = listOf(Point(2.0, 3.0), Point(4.0, 2.0), Point(5.0, 5.0))
    for (point in points) {
        println("Contains (${point.x}, ${point.y})? ${circle contains point}")
    }
}
