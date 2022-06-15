package br.com.bytebank.models

abstract class Employe(
    val name: String,
    val cpf: String,
    val salary: Double
) {

    abstract fun bonus(): Double
}