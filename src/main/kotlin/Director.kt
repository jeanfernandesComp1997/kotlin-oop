class Director(
    name: String,
    cpf: String,
    salary: Double,
    val password: Int,
    val plr: Double
) : Employe(
    name = name,
    cpf = cpf,
    salary = salary
) {

    override fun bonus(): Double = super.bonus() + salary + plr

    fun login(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}