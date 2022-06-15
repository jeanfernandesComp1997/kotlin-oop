package models

interface Authenticable {

    fun login(password: Int): Boolean
}