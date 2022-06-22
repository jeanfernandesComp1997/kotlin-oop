package br.com.bytebank.tests

import br.com.bytebank.models.Address
import br.com.bytebank.models.Client
import br.com.bytebank.models.SavingsAccount

fun testRun() {
    val anualTax = 0.05
    val monthTax = anualTax / 12

    Client(name = "Jean", cpf = "111.111.111-11", password = 1234)
        .let { newClient: Client ->
            SavingsAccount(newClient, 10000)
        }.run {
            deposit(1000.0)
            balance * monthTax
        }.let(::println)

    val savingsAccount = SavingsAccount(Client(name = "Jean", cpf = "111.111.111-11", password = 1234), 10000)
    savingsAccount.deposit(1000.0)

    val annualIncome = run {
        var balance = savingsAccount.balance
        repeat(12) {
            balance += balance * monthTax
        }
        balance
    }

    println(annualIncome)
}

fun testWith() {
    with(Address()) {
        street = "Baker street"
        number = 221
        city = "London"
        cep = "NW1"
        neighborhood = "6XE"
        state = "B"
        complement = "Apartment"

        completed()
    }.let { completedAddress: String ->
        println(completedAddress)
    }
}