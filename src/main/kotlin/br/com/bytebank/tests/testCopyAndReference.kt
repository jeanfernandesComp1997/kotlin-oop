package br.com.bytebank.tests

import br.com.bytebank.models.CheckingAccount
import br.com.bytebank.models.Client

fun testCopyAndReference() {
    val numberX = 10
    var numberY = numberX
    numberY++

    println("Number X: $numberX")
    println("Number Y: $numberY")

    val clientJohn = Client("John", "111", 3)
    val clientMary = Client("Mary", "222", 4)

    val accountJohn = CheckingAccount(clientJohn, 1003)
    var accountMary = accountJohn
    accountMary.holder = clientMary

    println("Holder account john: ${accountJohn.holder}")
    println("Holder account mary: ${accountMary.holder}")
}