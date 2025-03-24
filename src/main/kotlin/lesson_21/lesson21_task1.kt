package org.example.lesson_21

fun String.vowelCount() : Int {
    val vowels = "aeiouyаеёиоуыэюя"
    return lowercase().filter { it in vowels }.length
}

fun main() {
    println("Hello".vowelCount())
}