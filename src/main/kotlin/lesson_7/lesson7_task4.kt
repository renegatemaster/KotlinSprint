package org.example.lesson_7

import java.lang.Thread

fun main() {
    println("Введите количество секунд, которые нужно засечь:")
    val seconds = readln().toInt()

    for (i in seconds downTo 1) {
        println("До конца осталось: $i")
        Thread.sleep(1000)
    }
    println("Время вышло")
}