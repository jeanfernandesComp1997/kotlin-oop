package br.com.bytebank.exceptions

class AuthenticationFailedException(
    errorMessage: String = "Authentication Failed"
) : Exception(errorMessage) {
}