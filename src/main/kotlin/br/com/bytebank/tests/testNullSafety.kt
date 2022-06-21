package br.com.bytebank.tests

import br.com.bytebank.models.Address

fun testNullSafety() {
    var address: Address? = null
    println(address?.street?.length)

    address?.let { addressLambda: Address ->
        println(addressLambda.street.length)
    }

    println(address?.street?.length ?: 0)

    test(1)
}

fun test(value: Any) {
    val number: Int? = value as? Int
    println(number)
}