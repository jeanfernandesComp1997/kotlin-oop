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

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Address

        if (street != other.street) return false
        if (number != other.number) return false
        if (neighborhood != other.neighborhood) return false
        if (city != other.city) return false
        if (state != other.state) return false
        if (cep != other.cep) return false
        if (complement != other.complement) return false

        return true
    }

    override fun hashCode(): Int {
        var result = street.hashCode()
        result = 31 * result + number
        result = 31 * result + neighborhood.hashCode()
        result = 31 * result + city.hashCode()
        result = 31 * result + state.hashCode()
        result = 31 * result + cep.hashCode()
        result = 31 * result + complement.hashCode()
        return result
    }

    fun completed(): String {
        return """$street - $number, $neighborhood, $city - $state
$cep
$complement
        """.trimIndent()
    }
}