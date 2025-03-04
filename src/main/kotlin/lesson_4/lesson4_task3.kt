package org.example.lesson_4

const val FINE_HUMIDITY = 20
const val BAD_SEASON = "зима"

fun main() {
    val sunny = true
    val awningIsOpen = true
    val humidity = 20
    val season = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${
        sunny && awningIsOpen && (humidity == FINE_HUMIDITY) && (season != BAD_SEASON)
    }")
}