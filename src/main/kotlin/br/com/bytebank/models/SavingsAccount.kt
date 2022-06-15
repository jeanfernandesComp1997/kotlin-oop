package br.com.bytebank.models

import br.com.bytebank.models.Account

class SavingsAccount(
    holder: Client,
    number: Int
) : Account(
    holder,
    number
) {

    override fun withDraw(value: Double) {
        if (this.balance >= value) {
            this.balance -= value
        }
    }

}