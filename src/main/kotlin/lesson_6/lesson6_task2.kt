package org.example.lesson_6

import java.lang.Thread

fun main() {
    println("Введите количество секунд, которые нужно засечь:")
    val seconds = readln().toLong()  // Приводим к Long для функции sleep

    Thread.sleep(seconds * 1000)

    println("Прошло $seconds секунд")
}