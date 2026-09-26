// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: data filename required on command line")
        exitProcess(1)
    }

    val data = fetchData(args[0])
    if (data.isEmpty()) {
        println("Error: no data in ${args[0]}")
        exitProcess(1)
    }

    val coldest = data.minBy { it.second }
    val warmest = data.maxBy { it.second }
    println("Coldest: ${coldest.first} (${coldest.second} °C)")
    println("Warmest: ${warmest.first} (${warmest.second} °C)")

    val average = data.sumOf { it.second } / data.size
    println("Average: %.2f °C".format(average))
}
