class Assitent(
    name: String,
    cpf: String,
    salary: Double
) : Employe(
    name = name,
    cpf = cpf,
    salary = salary
) {

    override fun bonus(): Double = salary * 0.5
}