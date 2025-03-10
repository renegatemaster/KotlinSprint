package org.example.lesson_6

import kotlin.random.Random

const val NUMBER_OF_ATTEMPTS = 3
const val MIN_NUMBER = 1
const val MAX_NUMBER = 9

fun main() {
    println("Подтвердите, что вы не бот, решив простую задачу")
    var attempts = NUMBER_OF_ATTEMPTS

    while (attempts > 0) {
        val firstSummand = Random.nextInt(MIN_NUMBER, MAX_NUMBER + 1)
        val secondSummand = Random.nextInt(MIN_NUMBER, MAX_NUMBER + 1)

        println("Сколько будет $firstSummand + $secondSummand? Введите ответ:")
        val solution = readln().toInt()

        if (solution == firstSummand + secondSummand) {
            println("Добро пожаловать!")
            return
        } else {
            attempts--
            if (attempts == 0) break
            println("Неверно. Осталось попыток: $attempts")
        }
    }
    println("Доступ запрещён.")
}