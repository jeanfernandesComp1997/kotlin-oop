package br.com.bytebank.models

import br.com.bytebank.models.Authenticable

class InternSystem {

    fun enter(admin: Authenticable, password: Int) {
        if (admin.login(password)) {
            println("Welcome to ByteBank")
        } else {
            println("Authentication Failed")
        }
    }
}