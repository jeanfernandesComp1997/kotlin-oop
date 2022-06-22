package br.com.bytebank.models

import br.com.bytebank.models.Authenticable

class InternSystem {

    fun enter(admin: Authenticable, password: Int, authenticated: () -> Unit = {}) {
        if (admin.login(password)) {
            println("Welcome to ByteBank")
            authenticated()
        } else {
            println("Authentication Failed")
        }
    }
}