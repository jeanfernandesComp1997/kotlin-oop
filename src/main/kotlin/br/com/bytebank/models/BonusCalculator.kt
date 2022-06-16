package br.com.bytebank.models

class BonusCalculator {

    var total: Double = 0.0
        private set

    fun register(employe: Employee) {
        this.total += employe.bonus()
    }
}