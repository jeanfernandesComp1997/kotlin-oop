abstract class Account(
    var holder: String,
    val number: Int
) {

    var balance = 0.0
        protected set

    fun deposit(value: Double) {
        if (value > 0) {
            balance += value
        }
    }

    abstract fun withDraw(value: Double)

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