package br.com.bytebank.models

import br.com.bytebank.models.Employe

class BonusCalculator {

    var total: Double = 0.0
        private set

    fun register(employe: Employe) {
        this.total += employe.bonus()
    }
}