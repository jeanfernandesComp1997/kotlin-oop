package br.com.bytebank

fun main() {
    val myFunction: () -> Unit = ::test
    println(myFunction())

    val myFunctionClass: () -> Unit = Test()
    println(myFunctionClass())
}

fun test() {
    println("Execute test")
}

// fun sum(a: Int, b: Int): Int = a + b

class Test : () -> Unit {
    override fun invoke() {
        println("Execute invoke")
    }
}