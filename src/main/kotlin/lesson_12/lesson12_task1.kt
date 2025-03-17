package org.example.lesson_12

class DailyWeather {
    var daytimeTemp: Float = 0.0f
    var nighttimeTemp: Float = 0.0f
    var hasPrecipitation: Boolean = false

    fun printData() {
        println(
            """
            Температура днём: $daytimeTemp
            Температура ночью: $nighttimeTemp
            Наличие осадков: $hasPrecipitation
            """.trimIndent()
        )
    }
}

fun main() {
    val dayOne = DailyWeather()
    dayOne.daytimeTemp = 27f
    dayOne.nighttimeTemp = 15.3f
    dayOne.hasPrecipitation = false
    dayOne.printData()

    val dayTwo = DailyWeather()
    dayTwo.daytimeTemp = 24.7f
    dayTwo.nighttimeTemp = 12f
    dayTwo.hasPrecipitation = true
    dayTwo.printData()
}