// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    val file = Path("test.txt")

    file.writeText("Hello, World!\n")
    file.appendText("This line was appended.\n")

    val contents = file.readText()
    print(contents)
}
