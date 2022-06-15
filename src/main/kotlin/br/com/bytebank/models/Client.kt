package br.com.bytebank.models

import br.com.bytebank.models.Authenticable

class Client(
    val name: String,
    val cpf: String,
    val password: Int
) : Authenticable {

    override fun login(password: Int): Boolean {
        if (this.password == password) {
            return true
        }

        return false
    }
}