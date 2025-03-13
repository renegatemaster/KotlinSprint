package org.example.lesson_10

const val MIN_LENGTH = 4

fun validateLength(value: String) : Boolean = value.length >= MIN_LENGTH

fun main() {
    println("Введите логин:")
    val userLogin = readln()

    println("Введите пароль:")
    val userPassword = readln()

    if (!validateLength(userLogin) || !validateLength(userPassword)) {
        println("Логин или пароль недостаточно длинные")
    } else {
        println("Добро пожаловать!")
    }
}