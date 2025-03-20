package org.example.lesson_16

class User(val login: String) {
    private val password = "qwerty"

    fun isPasswordCorrect(enteredPassword: String) : Boolean { return enteredPassword == password }
}

fun main() {
    val user = User("Anon")

    println("Введите пароль:")
    val enteredPassword = readln()

    println("Введенный пароль пользователя ${user.login} корректен: ${user.isPasswordCorrect(enteredPassword)}")
}