package org.example.lesson_6

import java.lang.Thread

fun main() {
    println("Введите количество секунд, которые нужно засечь:")
    var seconds = readln().toInt()
    val totalTime = seconds

    while (seconds > 0) {
        Thread.sleep(1000)
        seconds--
    }
    println("Прошло $totalTime секунд")
}