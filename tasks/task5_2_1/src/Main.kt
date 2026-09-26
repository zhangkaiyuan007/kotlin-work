// Task 5.2.1: main program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: circle radius required on command line")
        exitProcess(1)
    }

    val radius = args[0].toDouble()

    println("Area = %.4f".format(circleArea(radius)))
    println("Perimeter = %.4f".format(circlePerimeter(radius)))
}
