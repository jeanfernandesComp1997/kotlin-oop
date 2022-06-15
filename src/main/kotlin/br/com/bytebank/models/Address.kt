package br.com.bytebank.models

class Address(
    var street: String = "",
    var number: Int = 0,
    var neighborhood: String = "",
    var city: String = "",
    var state: String = "",
    var cep: String = "",
    var complement: String = ""
)