package br.com.bytebank.tests

fun testConditions(balance: Double) {
    when {
        balance > 0.0 -> println("models.Account is positive")
        balance == 0.0 -> println("models.Account is neutral")
        else -> println("models.Account is negative")
    }
}