package br.com.bytebank

fun main() {
    testTypeFunctionReference()

    val myLambdaFunction: () -> Unit = {
        println("Execute with lambda")
    }
    println(myLambdaFunction())

    val myAnonymousFunction: () -> Unit = fun() {
        println("Execute anonymous")
    }
    println(myAnonymousFunction())
}

fun testTypeFunctionReference() {
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