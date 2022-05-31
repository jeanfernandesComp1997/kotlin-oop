class CheckingAccount(
    holder: String,
    number: Int
) : Account(
    holder,
    number
) {
    override fun withDraw(value: Double) {
        val valueWithTax = value + 0.1
        super.withDraw(valueWithTax)
    }
}