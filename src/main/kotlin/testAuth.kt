fun testAuth() {
    val manager = Manager(
        "Jean",
        "111.111.111-11",
        1000.0,
        1234
    )

    val director = Director(
        name = "Carol",
        cpf = "222.222.222-22",
        salary = 2000.0,
        password = 123456789,
        plr = 200.0
    )

    val client = Client(
        name = "Gabriel",
        cpf = "333.333.333-33",
        password = 123454
    )

    val system = InternSystem()
    system.enter(manager, 1234)
    system.enter(director, 123456789)
    system.enter(client, 123454)
}