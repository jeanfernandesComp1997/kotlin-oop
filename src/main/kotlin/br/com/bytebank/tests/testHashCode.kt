package br.com.bytebank.tests

import br.com.bytebank.models.Address

fun testHashCode() {
    val address = Address(cep = "37757-000")
    val newAddress = Address(cep = "37757-000")

    println(address.equals(newAddress))

    println(address.hashCode())
    println(newAddress.hashCode())

    println(address.toString())
    println(newAddress.toString())

    println("${address.javaClass}@${Integer.toHexString(address.hashCode())}")
}