package br.com.bytebank.models

class Client(
    val name: String,
    val cpf: String,
    private val password: Int,
    var address: Address = Address(),
) : Authenticable {

    override fun login(password: Int): Boolean {
        if (this.password == password) {
            return true
        }

        return false
    }
}