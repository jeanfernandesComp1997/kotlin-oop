import br.com.bytebank.models.Address

fun main(args: Array<String>) {
    val address = Address()
    val newAddress = Address()

    println(address.equals(address))

    println(address.hashCode())
    println(newAddress.hashCode())

    println(address.toString())
    println(newAddress.toString())

    println("${address.javaClass}@${Integer.toHexString(address.hashCode())}")
}