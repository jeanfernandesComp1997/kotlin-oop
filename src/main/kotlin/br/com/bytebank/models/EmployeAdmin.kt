package br.com.bytebank.models

import br.com.bytebank.models.Authenticable
import br.com.bytebank.models.Employe

abstract class EmployeAdmin(
    name: String,
    cpf: String,
    salary: Double,
    protected val password: Int
) : Employe(
    name,
    cpf,
    salary
), Authenticable {

    override fun login(password: Int): Boolean {
        if (this.password == password) {
            return true
        }

        return false
    }
}