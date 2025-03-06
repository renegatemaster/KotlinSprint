package org.example.lesson_5

import kotlin.random.Random
const val FROM = 0
const val TO = 42
const val UNTIL = TO + 1  // Хотим включить верхнюю границу

fun main() {
    val firstWinningNumber = Random.nextInt(FROM, UNTIL)
    val secondWinningNumber = Random.nextInt(FROM, UNTIL)
    val thirdWinningNumber = Random.nextInt(FROM, UNTIL)
    val winningList = listOf(firstWinningNumber, secondWinningNumber, thirdWinningNumber)

    println("Испытайте удачу, угадав три числа от 0 до 42")
    println("Введите первое число:")
    val firstInput = readln().toInt()

    println("Введите второе число:")
    val secondInput = readln().toInt()

    println("Введите третье число:")
    val thirdInput = readln().toInt()

    val inputList = listOf(firstInput, secondInput, thirdInput)

    val numberOfMatches = winningList.intersect(inputList).size

    when (numberOfMatches) {
        3 -> println("Поздравляем! Вы угадали все числа и выиграли джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число и получаете утешительный приз!")
        0 -> println("Вы не угадали ни одного числа.")
        else -> println("Непредвиденная ошибка")
    }
    println("Необходимыми для победы числа были $firstWinningNumber, $secondWinningNumber и $thirdWinningNumber")
}