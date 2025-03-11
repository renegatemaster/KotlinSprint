package org.example.lesson_7

fun main() {

    while (true) {
        val code = (1000..9999).random()
        println("Ваш код авторизации: $code")

        println("Введите ваш код:")
        val enteredCode = readln().toInt()

        if (enteredCode == code) {
            println("Добро пожаловать!")
            return
        } else {
            println("Неверный код, высылаем новый")
        }
    }
}