open class Employe(
    val name: String,
    val cpf: String,
    val salary: Double
) {

    open fun bonus(): Double = salary * 0.1
}