package org.example.lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {
    fun printData() {
        println("ID: ${this.id}, Login: ${this.login}, Password: ${this.password}, Email: ${this.email}")
    }
}

fun main() {
    val user1 = User(
        id = 1,
        login = "first user",
        password = "qwerty",
        email = "first-user@gmail.com"
    )
    val user2 = User(
        id = 2,
        login = "second user",
        password = "123456",
        email = "second-user@gmail.com"
    )

    user1.printData()
    user2.printData()
}