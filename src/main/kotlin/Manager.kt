class Manager(
    name: String,
    cpf: String,
    salary: Double,
    password: Int
) : EmployeAdmin(
    name = name,
    cpf = cpf,
    salary = salary,
    password = password
) {

    override fun bonus(): Double = salary
}