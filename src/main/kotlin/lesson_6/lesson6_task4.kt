package org.example.lesson_6

import kotlin.random.Random

private const val NUMBER_OF_ATTEMPTS = 5
private const val MIN_NUMBER = 1
private const val MAX_NUMBER = 9

fun main() {
    val winningNumber = Random.nextInt(MIN_NUMBER, MAX_NUMBER + 1)
    var attempts = NUMBER_OF_ATTEMPTS
    var enteredNumber: Int
    println("Я загадал число от 1 до 9, попробуй угадать")

    while (attempts > 0) {
        println("Введи свой вариант:")
        enteredNumber = readln().toInt()

        if (enteredNumber == winningNumber) {
            println("Это была великолепная игра!")
            return
        } else {
            attempts--
            if (attempts == 0) break
            println("Неверно. Осталось попыток: $attempts")
        }
    }
    println("Было загадано число $winningNumber")
}