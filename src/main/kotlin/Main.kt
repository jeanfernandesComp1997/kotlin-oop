fun main(args: Array<String>) {
    println("Welcome to Bytebank")

    val employe = Employe(
        name = "Jean",
        cpf = "105.564.347.87",
        salary = 1000.0
    )

    println("Name: ${employe.name}")
    println("Cpf: ${employe.cpf}")
    println("Salary: ${employe.salary}")
    println("Bonus: ${employe.bonus()}")
}