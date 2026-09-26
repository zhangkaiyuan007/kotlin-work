// Task 7.7.2: database-handling functions

import kotlin.io.path.Path
import kotlin.io.path.exists
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

typealias Database = MutableMap<String,String>

fun createDatabase() = mutableMapOf<String,String>()

fun Database.load(filename: String) {
    val path = Path(filename)
    if (path.exists()) {
        path.forEachLine { line ->
            if (line.isNotBlank()) {
                val (name, number) = line.split(",", limit = 2)
                this[name] = number
            }
        }
    }
}

fun Database.save(filename: String) {
    Path(filename).writer().use { output ->
        for ((name, number) in this) {
            output.write("$name,$number\n")
        }
    }
}
