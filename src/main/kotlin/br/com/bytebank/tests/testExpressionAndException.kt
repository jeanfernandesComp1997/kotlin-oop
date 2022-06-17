package br.com.bytebank.tests

fun testExpressionAndException() {
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

    if (valueWithTax !== null) {
        println("Value with tax: $valueWithTax")

    } else {
        println("Invalid value!")
    }
}