package org.example.lesson_5

fun main() {
    val firstWinningNumber = 0
    val secondWinningNumber = 42
    val winningSet = setOf(firstWinningNumber, secondWinningNumber)

    println("Испытайте удачу, угадав два числа от 0 до 42")
    println("Введите первое число:")
    val firstInput = readln().toInt()
    println("Введите второе число:")
    val secondInput = readln().toInt()

    if (setOf(firstInput, secondInput) == winningSet) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((firstInput in winningSet) || (secondInput in winningSet)) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
    println("Необходимыми для победы числа были $firstWinningNumber и $secondWinningNumber")
}