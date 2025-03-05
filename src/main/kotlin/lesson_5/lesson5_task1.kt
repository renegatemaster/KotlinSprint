package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val firstSummand = Random.nextInt(1, 10)
    val secondSummand = Random.nextInt(1, 10)

    val taskMessage = """
        Подтвердите, что вы не бот, решив простую задачу
        Сколько будет $firstSummand + $secondSummand? Введите ответ:
        """.trimIndent()

    println(taskMessage)

    val solution = readln().toInt()

    if (solution == firstSummand + secondSummand) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещён.")
    }
}
