package org.example.lesson_6

import java.lang.Thread

fun main() {
    println("Введите количество секунд, которые нужно засечь:")
    var seconds = readln().toInt()

    while (seconds > 0) {
        println("Осталось секунд: $seconds")
        Thread.sleep(1000)
        seconds--
    }
    println("Время вышло")
}