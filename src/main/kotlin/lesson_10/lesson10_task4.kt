package org.example.lesson_10

import java.lang.Thread

const val POSITIVE_ANSWER = "Да"

fun rollTheDice() : Int {
    Thread.sleep(1000)
    return (1..6).random()
}

fun checkResult(userResult: Int, machineResult: Int) : Boolean {
    if (userResult > machineResult) {
        println("Победило человечество")
        return true
    } else if (userResult == machineResult) {
        println("Победила дружба")
        return false
    } else {
        println("Победила машина")
        return false
    }
}

fun playTheGame() : Boolean {
    println("Ход игрока...")
    val userResult = rollTheDice()
    println("Результат игрока: $userResult")

    Thread.sleep(1000)

    println("Ход компьютера...")
    val machineResult = rollTheDice()
    println("Результат компьютера: $machineResult")

    Thread.sleep(1000)

    return checkResult(userResult, machineResult)
}

fun main() {
    var victoryCounter = 0
    var playAgain: String

    do {
        val result = playTheGame()
        if (result) victoryCounter++

        println("Хотите бросить кости еще раз? Введите Да или Нет")
        playAgain = readln()
    } while (playAgain.equals(POSITIVE_ANSWER, ignoreCase = true))

    println("Количество выигрышных партий: $victoryCounter")
}