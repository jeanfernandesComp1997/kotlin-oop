package br.com.bytebank.tests

import br.com.bytebank.models.Authenticable

fun testObjects() {
    val jean = object : Authenticable {
        val name: String = "Jean"
        val cpf: String = "111.111.111-11"
        val password: Int = 1000

        override fun login(password: Int) = this.password == password
    }

    testDiffAccounts()
}