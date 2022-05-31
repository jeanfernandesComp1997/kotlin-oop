fun testEmployee() {
    val employe = Employe(
        name = "Jean",
        cpf = "105.564.347.87",
        salary = 1000.0
    )

    println("Name: ${employe.name}")
    println("Cpf: ${employe.cpf}")
    println("Salary: ${employe.salary}")
    println("Bonus: ${employe.bonus()}")

    val manager = Manager(
        name = "Carol",
        cpf = "222.222.222-22",
        salary = 2000.0,
        password = 1234
    )
    println("name ${manager.name}")
    println("cpf ${manager.cpf}")
    println("salary ${manager.salary}")
    println("bonus ${manager.bonus()}")

    if (manager.login(1234)) {
        println("Sucessfuly authenticate")
    } else {
        println("Authentication failed")
    }

    val director = Director(
        name = "Gabriel",
        cpf = "333.333.333-33",
        salary = 4000.0,
        password = 4000,
        plr = 200.0
    )

    println("name ${director.name}")
    println("cpf ${director.cpf}")
    println("salary ${director.salary}")
    println("bonus ${director.bonus()}")
    println("plr ${director.plr}")

    if (director.login(4000)) {
        println("Sucessfuly authenticate")
    } else {
        println("Authentication failed")
    }

    val calculator = BonusCalculator()
    calculator.register(employe)
    calculator.register(manager)
    calculator.register(director)

    println("Total bonus: ${calculator.total}")
}