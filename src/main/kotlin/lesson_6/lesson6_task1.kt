package org.example.lesson_6

fun main() {
    println("Регистрация аккаунта")
    println("Укажите логин:")
    val login = readln()

    println("Укажите пароль:")
    val password = readln()
    println("Данные сохранены")

    println("Введите логин для авторизации:")
    var enteredLogin = readln()

    println("Введите пароль для авторизации:")
    var enteredPassword = readln()

    while (enteredLogin != login || enteredPassword != password) {
        println("Неверные данные")
        println("Введите логин заново:")
        enteredLogin = readln()

        println("Введите пароль заново:")
        enteredPassword = readln()
    }

    println("Авторизация прошла успешно")
}