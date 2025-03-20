package org.example.lesson_16

class User(
    val login: String,
    private val password: String,
) {
    fun isPasswordCorrect(enteredPassword: String) : Boolean { return enteredPassword == password }
}

fun main() {
    val user = User(login = "Anon", password = "qwerty")

    println("Введите пароль:")
    val enteredPassword = readln()

    println("Введенный пароль пользователя ${user.login} корректен: ${user.isPasswordCorrect(enteredPassword)}")
}