package org.example.lesson_10

import java.lang.Thread

fun rollTheDice() : Int {
    Thread.sleep(1000)
    return (1..6).random()
}

fun main() {
    println("Ход игрока...")
    val userResult = rollTheDice()
    println("Результат игрока: $userResult")

    Thread.sleep(1000)

    println("Ход компьютера...")
    val machineResult = rollTheDice()
    println("Результат компьютера: $machineResult")

    Thread.sleep(1000)

    if (userResult > machineResult) {
        println("Победило человечество")
    } else if (userResult == machineResult) {
        println("Победила дружба")
    } else {
        println("Победила машина")
    }
}