package br.com.bytebank.models

class Address(
    var street: String = "",
    var number: Int = 0,
    var neighborhood: String = "",
    var city: String = "",
    var state: String = "",
    var cep: String = "",
    var complement: String = ""
) {
    override fun toString(): String {
        return """
            Address(street='$street', 
            number=$number, 
            neighborhood='$neighborhood', 
            city='$city', 
            state='$state', 
            cep='$cep', 
            complement='$complement')
        """.trimIndent()
    }
}