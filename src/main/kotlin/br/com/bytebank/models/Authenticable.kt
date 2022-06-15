package br.com.bytebank.models

interface Authenticable {

    fun login(password: Int): Boolean
}