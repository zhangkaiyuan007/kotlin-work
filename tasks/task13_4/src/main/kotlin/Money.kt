// Task 13.4: Money class

data class Money(val euros: Int, val cents: Int) {
    init {
        require(euros >= 0) { "Euros cannot be negative" }
    }
}
