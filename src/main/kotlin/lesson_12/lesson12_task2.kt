package org.example.lesson_12

class DayWeatherData(
    val daytimeTemp: Float,
    val nighttimeTemp: Float,
    val hasPrecipitation: Boolean,
) {

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
    val dayOne = DayWeatherData(
        daytimeTemp = 27f,
        nighttimeTemp = 15.3f,
        hasPrecipitation = false,
    )
    dayOne.printData()
}