package br.com.bytebank.models

class Assitent(
    name: String,
    cpf: String,
    salary: Double
) : Employee(
    name = name,
    cpf = cpf,
    salary = salary
) {

    override fun bonus(): Double = salary * 0.5
}