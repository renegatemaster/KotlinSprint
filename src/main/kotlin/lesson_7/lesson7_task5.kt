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

    val passwordList = mutableListOf<Char>()
    val variants = 1..3
    val numberRange = '0'..'9'
    val lowerLetterRange = 'a'..'z'
    val upperLetterRange = 'A'..'Z'

    for (i in 1..passwordLength) {
        val randomizer = variants.random()
        when (randomizer) {
            1 -> passwordList.add(numberRange.random())
            2 -> passwordList.add(lowerLetterRange.random())
            3 -> passwordList.add(upperLetterRange.random())
        }
    }
    passwordList.shuffle()
    val password = passwordList.joinToString("")

    println(password)
}