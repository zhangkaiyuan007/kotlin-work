// Task 5.3.2: rollDice() function

import kotlin.random.Random

fun rollDice(sides: Int = 6, number: Int = 1) {
    if (sides !in setOf(4, 6, 8, 10, 12, 20)) {
        println("Error: cannot have a $sides-sided die")
    }
    else if (number < 1) {
        println("Error: must roll at least one die")
    }
    else {
        println("Rolling ${number}d$sides...")
        var total = 0
        repeat(number) {
            total += Random.nextInt(1, sides + 1)
        }
        println("You rolled $total")
    }
}
