package br.com.bytebank

import br.com.bytebank.models.Address

fun main() {
    println("Init main")
    val input = "2.0"

    val value = try {
        input.toDouble()
    } catch (ex: Exception) {
        println(ex.printStackTrace())
        null
    }

    val valueWithTax = if (value != null) {
        value + 0.1
    } else {
        null
    }

    if (valueWithTax !== null) println("Value with tax: $valueWithTax") else println("Invalid value!")

    // function1()
    println("End main")
}

fun function1() {
    println("Init function1")

    try {
        function2()
    } catch (ex: Exception) {
        println("Instance of: ${ex.javaClass}")
        println("Error message: ${ex.message}")
        println("StackTrace: ${ex.printStackTrace()}")
        println("Cause: ${ex.cause}")
    }

    println("End function1")
}

fun function2() {
    println("Init function2")

    for (i in 1..5) {
        println(i)
        val address = Any()
        address as Address
    }

    println("End function2")
}
