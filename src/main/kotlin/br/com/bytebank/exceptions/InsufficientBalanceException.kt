package br.com.bytebank.exceptions

class InsufficientBalanceException(
    errorMessage: String = "Insufficient Balance"
) : Exception(errorMessage) {

}