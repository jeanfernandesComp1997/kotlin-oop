fun main(args: Array<String>) {
    println("Welcome to Bytebank")

    val accountJean = Account(holder = "Jean Fernandes", number = 1000)
    accountJean.deposit(200.0)
    println("Holder: ${accountJean.holder}")
    println("Account number: ${accountJean.number}")
    println("Balance: ${accountJean.balance}")

    val accountCarol = Account("Ana Caroline", 1001)
    accountCarol.deposit(300.0)
    println("Holder: ${accountCarol.holder}")
    println("Account number: ${accountCarol.number}")
    println("Balance: ${accountCarol.balance}")

    println("Depositing in the Jean's Account")
    accountJean.deposit(50.0)
    println(accountJean.balance)

    println("Depositing in the Carol's Account")
    accountCarol.deposit(100.0)
    println(accountCarol.balance)

    println("Withdraw in the Jean's Account")
    accountJean.withDraw(50.0)
    println(accountJean.balance)

    println("Withdraw in the Carol's Account")
    accountCarol.withDraw(25.0)
    println(accountCarol.balance)

    println("Withdraw invalid value in the Carol's Account")
    accountCarol.withDraw(1000.0)
    println(accountCarol.balance)

    println("Transfering value from Carol's Account to Jean's Account")
    if (accountCarol.transfer(100.0, accountJean)) {
        println("Successfully transfer")
    } else {
        println("Failed transfer")
    }

    println("Jean balance ${accountJean.balance}")
    println("Carol balance ${accountCarol.balance}")
}

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
}

fun testCopyAndReference() {
    val numberX = 10
    var numberY = numberX
    numberY++

    println("Number X: $numberX")
    println("Number Y: $numberY")

    val accountJohn = Account("John", 1003)
    var accountMary = accountJohn
    accountMary.holder = "Mary"

    println("Holder account john: ${accountJohn.holder}")
    println("Holder account mary: ${accountMary.holder}")
}

fun testIterators() {
    for (i in 1..5) {
        val holder = "Customer $i"
        val accountNumber = 1000 + i
        var balance = i + 10.0

        println("Holder: $holder")
        println("Account Number: $accountNumber")
        println("Balance: $balance")
        println()
    }

    var i = 0
    while (i < 5) {

        val holder = "Customer $i"
        val accountNumber = 1000 + i
        var balance = i + 10.0

        println("Holder: $holder")
        println("Account Number: $accountNumber")
        println("Balance: $balance")
        println()

        i++
    }

    for (i in 5 downTo 1) {
        if (i == 4)
            continue

        val holder = "Customer $i"
        val accountNumber = 1000 + i
        var balance = i + 10.0

        println("Holder: $holder")
        println("Account Number: $accountNumber")
        println("Balance: $balance")
        println()
    }
}

fun testConditions(balance: Double) {
    when {
        balance > 0.0 -> println("Account is positive")
        balance == 0.0 -> println("Account is neutral")
        else -> println("Account is negative")
    }
}