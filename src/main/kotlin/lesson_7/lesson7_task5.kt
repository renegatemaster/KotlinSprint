package org.example.lesson_7

const val MIN_PASSWORD_LENGTH = 6

fun main() {

    var passwordLength: Int

    while (true) {
        println("Введите длину пароля (от 6 символов):")
        passwordLength = readln().toInt()

        if (passwordLength >= MIN_PASSWORD_LENGTH) {
            break
        } else {
            println("Пароль должен содержать минимум 6 символов!")
        }
    }

    var password = ""
    for (i in 1..passwordLength) {
        val randomizer = (1..3).random()
        when (randomizer) {
            1 -> password += (0..9).random()
            2 -> password += ('a'..'z').random()
            3 -> password += ('A'..'Z').random()
        }
    }

    println(password)
}