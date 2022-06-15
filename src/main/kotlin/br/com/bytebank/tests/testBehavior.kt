package br.com.bytebank.tests

import br.com.bytebank.models.CheckingAccount
import br.com.bytebank.models.Client
import br.com.bytebank.models.SavingsAccount

fun testBehavior() {
    val clientJean = Client(name = "Jean Fernandes", cpf = "111-111-111-11", password = 1)
    val accountJean = CheckingAccount(clientJean, number = 1000)
    accountJean.deposit(200.0)
    accountJean.printAccount()

    val clientAna = Client(name = "Ana Caroline", cpf = "111-111-111-11", password = 1)
    val accountCarol = SavingsAccount(clientAna, 1001)
    accountCarol.deposit(300.0)
    accountCarol.printAccount()

    println("Depositing in the Jean's models.Account")
    accountJean.deposit(50.0)
    println(accountJean.balance)

    println("Depositing in the Carol's models.Account")
    accountCarol.deposit(100.0)
    println(accountCarol.balance)

    println("Withdraw in the Jean's models.Account")
    accountJean.withDraw(50.0)
    println(accountJean.balance)

    println("Withdraw in the Carol's models.Account")
    accountCarol.withDraw(25.0)
    println(accountCarol.balance)

    println("Withdraw invalid value in the Carol's models.Account")
    accountCarol.withDraw(1000.0)
    println(accountCarol.balance)

    println("Transfering value from Carol's models.Account to Jean's models.Account")
    if (accountCarol.transfer(100.0, accountJean)) {
        println("Successfully transfer")
    } else {
        println("Failed transfer")
    }

    println("Jean balance ${accountJean.balance}")
    println("Carol balance ${accountCarol.balance}")
}