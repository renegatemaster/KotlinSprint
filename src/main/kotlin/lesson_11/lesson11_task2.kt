package org.example.lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = ""
) {
    fun printData() {
        println("ID: ${this.id}, Login: ${this.login}, Password: ${this.password}, Email: ${this.email}")
    }

    fun editBio() {
        println("Введите ниже информацию о себе:")
        val bio = readln()
        this.bio = bio
    }

    fun changePassword() {
        println("Для смены пароля сначала введите свой старый пароль:")
        val oldPassword = readln()

        if (oldPassword != this.password) {
            println("Неверный пароль")
            return
        }

        println("Введите новый пароль:")
        val newPassword = readln()

        this.password = newPassword
        println("Пароль успешно изменён")
    }
}

fun main() {
    val user = User2(
        id = 1,
        login = "Blur",
        password = "Song 2",
        email = "parklife@gmail.com"
    )

    user.editBio()

    user.changePassword()

    user.printData()
}