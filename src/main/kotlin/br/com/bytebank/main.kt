import br.com.bytebank.models.Authenticable
import br.com.bytebank.tests.testDiffAccounts

fun main(args: Array<String>) {
    val jean = object : Authenticable {
        val name: String = "Jean"
        val cpf: String = "111.111.111-11"
        val password: Int = 1000

        override fun login(password: Int) = this.password == password
    }

    testDiffAccounts()
}