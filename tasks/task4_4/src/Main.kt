// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: initial temp, max temp & increment required on command line")
        exitProcess(1)
    }

    val initial = args[0].toDouble()
    val maximum = args[1].toDouble()
    val increment = args[2].toDouble()

    if (increment <= 0.0) {
        println("Error: increment must be greater than zero")
        exitProcess(1)
    }

    val conversionTable = table {
        align = TextAlign.RIGHT
        borderStyle = brightBlue
        header {
            style = brightYellow
            row("°C", "°F")
        }
        body {
            rowStyles(white, brightWhite)
            var steps = 0
            var celsius = initial
            while (celsius <= maximum) {
                val fahrenheit = celsius * 9.0 / 5.0 + 32.0
                row("%.1f".format(celsius), "%.1f".format(fahrenheit))
                // Computing each temperature from the step count stops
                // rounding errors accumulating from repeated additions
                steps += 1
                celsius = initial + steps * increment
            }
        }
    }

    Terminal().println(conversionTable)
}
