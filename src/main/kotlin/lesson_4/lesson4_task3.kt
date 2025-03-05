package org.example.lesson_4

const val FINE_HUMIDITY = 20
const val BAD_SEASON = "зима"

fun main() {
    val isSunny = true
    val isAwningOpen = true
    val humidity = 20
    val season = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${
        isSunny && isAwningOpen && (humidity == FINE_HUMIDITY) && (season != BAD_SEASON)
    }")
}