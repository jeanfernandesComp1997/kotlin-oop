fun main() {
    println("Init main")
    function1()
    println("End main")
}

fun function1() {
    println("Init function1")
    function2()
    println("End function1")
}

fun function2() {
    println("Init function2")
    for (i in 1..5) {
        println(i)
    }
    println("End function2")
}
