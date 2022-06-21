package br.com.bytebank

fun main() {
    testTypeFunctionReference()
    testClassFunction()

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
    val myFunction: (Int, Int) -> Int = ::sum
    println(myFunction(5, 10))
}

fun testClassFunction() {
    val myFunctionClass: (Int, Int) -> Int = Sum()
    println(myFunctionClass(10, 10))
}

fun test() {
    println("Execute test")
}

fun sum(a: Int, b: Int): Int = a + b

class Sum : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int {
        return a + b
    }

}