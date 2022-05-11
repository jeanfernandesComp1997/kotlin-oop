class Analist(
    name: String,
    cpf: String,
    salary: Double,
) : Employe(
    name = name,
    cpf = cpf,
    salary = salary
) {

    override fun bonus(): Double = super.bonus() + salary * 0.1
}