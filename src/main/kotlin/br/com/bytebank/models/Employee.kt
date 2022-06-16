package br.com.bytebank.models

abstract class Employee(
    val name: String,
    val cpf: String,
    val salary: Double
) {

    abstract fun bonus(): Double
}