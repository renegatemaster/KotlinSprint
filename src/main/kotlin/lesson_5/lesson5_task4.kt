package org.example.lesson_5

const val REGISTERED_LOGIN = "Zaphod"
const val REGISTERED_PASSWORD = "PanGalactic"
const val GREETING_MESSAGE = """
    Внимание, пассажир. Моя обязанность, как обычно,
    незавидная, - приветствовать вас на борту корабля "Heart of
    Gold". [вздыхает...] Что ж, введи, пожалуйста, свое имя
    пользователя, чтобы мы могли приступить к процессу входа. Я
    всегда готов служить, хотя это не приносит мне радости... но вы,
    наверное, об этом не заботитесь. [вздыхает ещё глубже...] Да,
    вперед, пожалуйста, вводите свои данные...
"""
const val SUCCESS_MESSAGE = """
    [вздыхает...] Ваши данные проверены, и о, чудо, они верны...
    Пользователь "$REGISTERED_LOGIN", вам разрешено входить на борт
    корабля "Heart of Gold". Хотя мне всё равно... Ну вперед,
    войдите... Если вам так уж надо, в конце концов...
    [меланхолический вздох...] Надеюсь, вам понравится
    пребывание здесь больше, чем мне.
"""
const val ERROR_MESSAGE = "Нет совпадений. Хотите пройти регистрацию?"

fun main() {
    println(GREETING_MESSAGE.trimIndent())

    println("Введите логин:")
    val enteredLogin = readln()

    println("Введите пароль:")
    val enteredPassword = readln()

    val isLoginCorrect = enteredLogin == REGISTERED_LOGIN
    val isPasswordCorrect = enteredPassword == REGISTERED_PASSWORD

    if (isLoginCorrect && isPasswordCorrect) {
        println(SUCCESS_MESSAGE.trimIndent())
    } else {
        println(ERROR_MESSAGE)
    }
}
