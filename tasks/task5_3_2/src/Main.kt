// Task 5.3.2: main program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1 || 'd' !in args[0]) {
        println("Error: dice specification required on command line (e.g., 3d8)")
        exitProcess(1)
    }

    val number = args[0].substringBefore('d').toIntOrNull()
    val sides = args[0].substringAfter('d').toIntOrNull()

    if (number == null || sides == null) {
        println("Error: invalid dice specification '${args[0]}'")
        exitProcess(1)
    }

    rollDice(sides = sides, number = number)
}
