// Task 9.6: application to compute dataset variance

import java.io.IOException
import java.nio.file.NoSuchFileException
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: data filename required on command line")
        exitProcess(1)
    }

    try {
        val data = readData(args[0])
        println("Dataset size = ${data.size}")
        println("Variance     = %.5f".format(variance(data)))
    }
    catch (error: NoSuchFileException) {
        println("Error: cannot find file ${error.file}")
        exitProcess(2)
    }
    catch (error: IOException) {
        println("Error: cannot read file ${args[0]} ($error)")
        exitProcess(2)
    }
    catch (error: NumberFormatException) {
        println("Error: file contains non-numeric data (${error.message})")
        exitProcess(3)
    }
    catch (error: IllegalArgumentException) {
        println("Error: cannot compute variance (${error.message})")
        exitProcess(4)
    }
}
