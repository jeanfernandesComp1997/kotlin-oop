package br.com.bytebank

import br.com.bytebank.models.Address

fun main() {
    println("Init main")

    try {
        10 / 0
    } catch (ex: Exception) {
        println("Error: $ex")
    }

    function1()
    println("End main")
}

fun function1() {
    println("Init function1")

    try {
        function2()
    } catch (ex: Exception) {
        println("Error: $ex")
        println("Instance of: ${ex.javaClass}")
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
