package org.example.lesson_20

const val USERNAME = "Артур"

fun main() {
    val happyNewYear: () -> String = {"С наступающим Новым Годом, $USERNAME!"}
    println(happyNewYear())
}