package br.com.bytebank.models

import br.com.bytebank.models.Account

class CheckingAccount(
    holder: Client,
    number: Int
) : Account(
    holder,
    number
) {
    override fun withDraw(value: Double) {
        val valueWithTax = value + 0.1
        if (this.balance >= valueWithTax) {
            this.balance -= valueWithTax
        }
    }
}