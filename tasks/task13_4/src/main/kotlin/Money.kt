// Task 13.4: Money class

data class Money(val euros: Int, val cents: Int) {
    init {
        require(euros >= 0) { "Euros cannot be negative" }
        require(cents in 0..99) { "Cents must be in the range 0-99" }
    }

    operator fun plus(other: Money) = Money(euros + other.euros, cents + other.cents)
}
