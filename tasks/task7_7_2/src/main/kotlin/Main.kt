// Task 7.7.2: phone book simulator

const val CSV_FILENAME = "phone.csv"

fun readInput(prompt: String): String? {
    print(prompt)
    return readlnOrNull()?.trim()
}

fun readPhoneNumber(name: String): String? {
    while (true) {
        val number = readInput("Enter phone number for $name: ") ?: return null
        if (number.isNotEmpty() && number.all { it.isDigit() }) {
            return number
        }
        println("Phone number must consist solely of digits")
    }
}

fun main() {
    val database = createDatabase()
    database.load(CSV_FILENAME)

    while (true) {
        val name = readInput("Enter name (or press Enter to quit): ")
        if (name.isNullOrEmpty()) {
            break
        }
        if (',' in name) {
            println("Name cannot contain a comma")
            continue
        }

        val number = database[name]
        if (number != null) {
            println("$name: $number")
        } else {
            val newNumber = readPhoneNumber(name) ?: break
            database[name] = newNumber
            database.save(CSV_FILENAME)
            println("Added $name to database")
        }
    }
}
