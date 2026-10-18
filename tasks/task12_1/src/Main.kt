// Task 12.1: program that uses a Point object

fun main() {
    val p = Point(3.0, 4.0)
    println("x = ${p.x}")
    println("y = ${p.y}")
    println("Distance from origin = ${p.distance()}")

    val q = Point(4.5, 7.0)
    println("Distance from (${q.x}, ${q.y}) = ${p.distanceTo(q)}")
}
