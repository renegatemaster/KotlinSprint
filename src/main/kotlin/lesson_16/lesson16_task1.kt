package org.example.lesson_16

class Dice {
    private val value: Int = (1..6).random()

    fun getResult() = println(value)
}

fun main() {
    Dice().getResult()
}