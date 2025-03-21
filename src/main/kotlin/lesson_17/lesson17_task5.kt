package org.example.lesson_17

class User(
    login: String,
    password: String,
) {
    var password = password
        get() = "*".repeat(field.length)
        set(value) { println("Вы не можете изменить пароль") }

    var login = login
        set(value) {
            field = value
            println("Логин успешно изменён")
        }
}

fun main() {
    val user = User(login = "Anon", password = "qwerty")

    user.password = "123"
    println(user.password)

    user.login = "New login"
    println(user.login)
}