fun testCopyAndReference() {
    val numberX = 10
    var numberY = numberX
    numberY++

    println("Number X: $numberX")
    println("Number Y: $numberY")

    val accountJohn = CheckingAccount("John", 1003)
    var accountMary = accountJohn
    accountMary.holder = "Mary"

    println("Holder account john: ${accountJohn.holder}")
    println("Holder account mary: ${accountMary.holder}")
}