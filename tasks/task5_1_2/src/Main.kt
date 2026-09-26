// Task 5.1.2: main program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Error: number of die sides required on command line")
        exitProcess(1)
    }

    val sides = args[0].toIntOrNull()
    if (sides == null) {
        println("Error: number of die sides must be an integer")
        exitProcess(1)
    }

    rollDie(sides)
}
