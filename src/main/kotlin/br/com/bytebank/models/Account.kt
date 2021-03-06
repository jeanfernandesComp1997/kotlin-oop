package br.com.bytebank.models

import br.com.bytebank.exceptions.AuthenticationFailedException
import br.com.bytebank.exceptions.InsufficientBalanceException

abstract class Account(
    var holder: Client,
    val number: Int
) : Authenticable {

    var balance = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        total++
    }

    override fun login(password: Int): Boolean {
        return holder.login(password)
    }

    fun deposit(value: Double) {
        if (value > 0) {
            balance += value
        }
    }

    abstract fun withDraw(value: Double)

    fun transfer(value: Double, accountToTransfer: Account, password: Int) {
        if (balance < value) {
            throw InsufficientBalanceException()
        }

        if (!login(password)) {
            throw AuthenticationFailedException()
        }

        balance -= value
        accountToTransfer.deposit(value)
    }

    fun printAccount() {
        println("Holder: ${holder.name}")
        println("models.Account number: $number")
        println("Balance: $balance")
        println()
    }
}