// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: upper limit required on command line")
        exitProcess(1)
    }

    val limit = args[0].toInt()

    // An Int sum overflows for large limits (e.g., 100000), so use Long
    var sum = 0L
    for (n in 1..limit step 2) {
        sum += n
    }

    println("Sum of odd integers from 1 to $limit = $sum")
}
