package br.com.bytebank

import br.com.bytebank.models.Address

fun main() {
    var address: Address? = null
    println(address?.street?.length)

    address?.let { address: Address ->
        println(address.street.length)
    }
}