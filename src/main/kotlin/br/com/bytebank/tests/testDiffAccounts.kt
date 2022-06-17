package br.com.bytebank.tests

import br.com.bytebank.models.CheckingAccount
import br.com.bytebank.models.Client
import br.com.bytebank.models.SavingsAccount

fun testDiffAccounts() {
    val clientJean = Client("Jean", "111.111.111-11", 1)
    val checkingAccount = CheckingAccount(
        holder = clientJean,
        number = 1000
    )

    val clientCarol = Client("Carol", "222.222.222-22", 2)
    val savingsAccount = SavingsAccount(
        holder = clientCarol,
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

    checkingAccount.transfer(100.0, savingsAccount, 1)

    println("Balance checking after transfer to savings: ${checkingAccount.balance}")
    println("Balance savings after receive transfer: ${savingsAccount.balance}")

    savingsAccount.transfer(100.0, checkingAccount, 2)

    println("Balance savings after transfer to checking: ${savingsAccount.balance}")
    println("Balance checking after receive transfer: ${checkingAccount.balance}")
}