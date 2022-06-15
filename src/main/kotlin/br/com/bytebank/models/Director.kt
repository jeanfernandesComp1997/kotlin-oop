package br.com.bytebank.models

class Director(
    name: String,
    cpf: String,
    salary: Double,
    password: Int,
    val plr: Double
) : EmployeAdmin(
    name = name,
    cpf = cpf,
    salary = salary,
    password = password
) {

    override fun bonus(): Double = salary + plr
}