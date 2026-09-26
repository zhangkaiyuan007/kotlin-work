// Task 4.7: finding the longest line in a file

import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: filename required on command line")
        exitProcess(1)
    }

    var lineNumber = 0
    var longestLine = 0
    var longestLength = -1

    Path(args[0]).forEachLine { line ->
        lineNumber += 1
        if (line.length > longestLength) {
            longestLine = lineNumber
            longestLength = line.length
        }
    }

    if (lineNumber == 0) {
        println("File is empty")
    } else {
        println("Line $longestLine is the longest (length = $longestLength)")
    }
}
