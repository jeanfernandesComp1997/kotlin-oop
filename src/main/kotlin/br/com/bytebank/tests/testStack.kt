package br.com.bytebank.tests

import br.com.bytebank.exceptions.InsufficientBalanceException

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
        throw InsufficientBalanceException() // address as Address
    }

    println("End function2")
}