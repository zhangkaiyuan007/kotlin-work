// COMP2850 Portfolio: Week 3
// Statistics functions (adapted from Task 7.7.1)

fun median(data: List<Float>): Float {
    require(data.isNotEmpty()) { "cannot compute median of an empty list" }
    val sorted = data.sorted()
    val middle = sorted.size / 2
    return if (sorted.size % 2 == 0) {
        (sorted[middle - 1] + sorted[middle]) / 2
    } else {
        sorted[middle]
    }
}

fun displayStats(data: List<Float>) {
    println("Minimum = %.3f".format(data.min()))
    println("Maximum = %.3f".format(data.max()))
    println("Mean    = %.3f".format(data.average()))
    println("Median  = %.3f".format(median(data)))
}
