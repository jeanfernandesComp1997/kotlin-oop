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