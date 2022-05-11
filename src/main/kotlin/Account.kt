class Account(
    var holder: String,
    val number: Int
) {

    var balance = 0.0
        private set

    fun deposit(value: Double) {
        if (value > 0) {
            balance += value
        }
    }

    fun withDraw(value: Double) {
        if (balance >= value)
            balance -= value
    }

    fun transfer(value: Double, accountToTransfer: Account): Boolean {
        if (balance >= value) {
            balance -= value
            accountToTransfer.deposit(value)
            return true
        }

        return false
    }

    fun printAccount() {
        println("Holder: $holder")
        println("Account number: $number")
        println("Balance: $balance")
        println()
    }
}