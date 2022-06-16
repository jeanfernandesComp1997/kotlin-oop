package br.com.bytebank.models

abstract class EmployeAdmin(
    name: String,
    cpf: String,
    salary: Double,
    protected val password: Int
) : Employee(
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