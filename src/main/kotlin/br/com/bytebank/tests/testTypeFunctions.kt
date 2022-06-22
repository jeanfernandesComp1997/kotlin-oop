package br.com.bytebank.tests

fun testAnonymousFunction() {
    val myAnonymousFunction: (Int, Int) -> Int = fun(a: Int, b: Int): Int {
        return a + b
    }
    println(myAnonymousFunction(6, 4))

    val bonusCalculatorAnonymous: (wage: Double) -> Double = fun(wage): Double {
        if (wage > 1000.0) {
            return wage + 50
        }

        return wage + 100.0
    }
    println(bonusCalculatorAnonymous(1100.0))
}

fun testLambdaFunction() {
    val myLambdaFunction = { a: Int, b: Int ->
        a + b
    }
    println(myLambdaFunction(2, 3))

    val bonusCalculator: (wage: Double) -> Double = lambda@{ wage ->
        if (wage > 1000.0) {
            return@lambda wage + 50
        }

        wage + 100.0
    }
    println(bonusCalculator(1100.0))
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