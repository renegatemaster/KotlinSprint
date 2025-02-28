package org.example.lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeInMinutes = 457

    val departureTimeInMinutes = departureHour * MINUTES_IN_HOUR + departureMinute
    val arrivalTimeInMinutes = departureTimeInMinutes + travelTimeInMinutes
    val arrivalHour = arrivalTimeInMinutes / MINUTES_IN_HOUR
    val arrivalMinute = arrivalTimeInMinutes % MINUTES_IN_HOUR

    println("Estimated time of arrival: $arrivalHour:$arrivalMinute")
}