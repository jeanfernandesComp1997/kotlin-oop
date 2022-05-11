class Manager(
    name: String,
    cpf: String,
    salary: Double,
    val password: Int
) : Employe(
    name = name,
    cpf = cpf,
    salary = salary
) {

    override fun bonus(): Double = super.bonus() + salary

    fun login(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}