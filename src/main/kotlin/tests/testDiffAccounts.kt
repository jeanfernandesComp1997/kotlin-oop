import models.CheckingAccount
import models.SavingsAccount

fun testDiifAccounts() {
    val checkingAccount = CheckingAccount(
        holder = "Jean",
        number = 1000
    )

    val savingsAccount = SavingsAccount(
        holder = "Carol",
        number = 1001
    )

    checkingAccount.deposit(1000.0)
    savingsAccount.deposit(1000.0)

    println("Balance checking: ${checkingAccount.balance}")
    println("Balance savings: ${savingsAccount.balance}")

    checkingAccount.withDraw(100.0)
    savingsAccount.withDraw(100.0)

    println("Balance checking after withdraw: ${checkingAccount.balance}")
    println("Balance savings after withdraw: ${savingsAccount.balance}")

    checkingAccount.transfer(100.0, savingsAccount)

    println("Balance checking after transfer to savings: ${checkingAccount.balance}")
    println("Balance savings after receive transfer: ${savingsAccount.balance}")

    savingsAccount.transfer(100.0, checkingAccount)

    println("Balance savings after transfer to checking: ${savingsAccount.balance}")
    println("Balance checking after receive transfer: ${checkingAccount.balance}")
}