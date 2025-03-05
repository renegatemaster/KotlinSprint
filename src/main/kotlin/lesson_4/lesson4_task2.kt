package org.example.lesson_4

const val MIN_AVG_MASS = 35
const val MAX_AVG_MASS = 100
const val MAX_AVG_VOLUME = 100

fun printIsAverage(mass: Int, volume: Int) {
    val isAverage = (mass > MIN_AVG_MASS) && (mass <= MAX_AVG_MASS) && (volume < MAX_AVG_VOLUME)
    println("Груз с весом $mass кг и объемом $volume л соответствует категории 'Average': $isAverage")
}

fun main() {
    var mass = 20
    var volume = 80

    printIsAverage(mass, volume)

    mass = 50
    volume = 100
    printIsAverage(mass, volume)
}