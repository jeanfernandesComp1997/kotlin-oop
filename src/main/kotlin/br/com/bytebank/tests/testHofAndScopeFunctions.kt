package br.com.bytebank.tests

import br.com.bytebank.models.Address
import br.com.bytebank.models.Authenticable
import br.com.bytebank.models.InternSystem

fun testHofAndScopeFunctions() {
//    val address = Address(street = "Baker street", number = 221)
//    val upperAddress = "${address.street}, ${address.number}".uppercase()
//    println(upperAddress)

    Address(street = "Baker street", number = 221)
        .let { address ->
            "${address.street}, ${address.number}".uppercase()
        }.let(::println)

    listOf(
        Address(complement = "House"),
        Address(),
        Address(complement = "Apartment")
    ).filter { address ->
        address.complement.isNotEmpty()
    }.let(::println)

    val authenticate = object : Authenticable {
        val pass = 1234
        override fun login(password: Int): Boolean = this.pass == pass
    }

    InternSystem().enter(authenticate, 123, authenticated = {
        println("Realize payment")
    })

    sumReceiver(5, 5, result = {
        println(this)
    })
}

fun sum(a: Int, b: Int, result: (Int) -> Unit) {
    println("Sum is running")
    result(a + b)
}

fun sumReceiver(a: Int, b: Int, result: Int.() -> Unit) {
    println("Sum is running")
    val total = a + b
    total.result()
    result(a + b)
}