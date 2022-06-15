import br.com.bytebank.models.CheckingAccount
import br.com.bytebank.models.SavingsAccount

fun testBehavior() {
    val accountJean = CheckingAccount(holder = "Jean Fernandes", number = 1000)
    accountJean.deposit(200.0)
    accountJean.printAccount()

    val accountCarol = SavingsAccount("Ana Caroline", 1001)
    accountCarol.deposit(300.0)
    accountCarol.printAccount()

    println("Depositing in the Jean's models.Account")
    accountJean.deposit(50.0)
    println(accountJean.balance)

    println("Depositing in the Carol's models.Account")
    accountCarol.deposit(100.0)
    println(accountCarol.balance)

    println("Withdraw in the Jean's models.Account")
    accountJean.withDraw(50.0)
    println(accountJean.balance)

    println("Withdraw in the Carol's models.Account")
    accountCarol.withDraw(25.0)
    println(accountCarol.balance)

    println("Withdraw invalid value in the Carol's models.Account")
    accountCarol.withDraw(1000.0)
    println(accountCarol.balance)

    println("Transfering value from Carol's models.Account to Jean's models.Account")
    if (accountCarol.transfer(100.0, accountJean)) {
        println("Successfully transfer")
    } else {
        println("Failed transfer")
    }

    println("Jean balance ${accountJean.balance}")
    println("Carol balance ${accountCarol.balance}")
}