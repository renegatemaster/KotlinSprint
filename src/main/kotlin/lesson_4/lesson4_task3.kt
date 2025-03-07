package org.example.lesson_4

const val SUNNY = true
const val AWNING_OPEN = true
const val FINE_HUMIDITY = 20
const val BAD_SEASON = "зима"

fun main() {
    val isSunny = true
    val isAwningOpen = true
    val humidity = 20
    val season = "зима"

    val isWeatherFine = isSunny == SUNNY
    val isAwningFine = isAwningOpen == AWNING_OPEN
    val isHumidityFine = humidity == FINE_HUMIDITY
    val isSeasonFine = season != BAD_SEASON

    val isFineForGrowth = isWeatherFine && isAwningFine && isHumidityFine && isSeasonFine

    println("Благоприятные ли условия сейчас для роста бобовых? $isFineForGrowth")
}