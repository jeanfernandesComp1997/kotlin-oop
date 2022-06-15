package models

import models.Employe

class BonusCalculator {

    var total: Double = 0.0
        private set

    fun register(employe: Employe) {
        this.total += employe.bonus()
    }
}