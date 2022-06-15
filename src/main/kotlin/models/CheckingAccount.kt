package models

import models.Account

class CheckingAccount(
    holder: String,
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