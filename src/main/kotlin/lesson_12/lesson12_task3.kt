package org.example.lesson_12

class DayWeather(
    _daytimeTemp: Int,
    _nighttimeTemp: Int,
    _hasPrecipitation: Boolean,
) {
    private val kelvinOffset = 273

    val daytimeTemp = _daytimeTemp - kelvinOffset
    val nighttimeTemp = _nighttimeTemp - kelvinOffset
    val hasPrecipitation = _hasPrecipitation

    fun printData() {
        println(
            """
            Температура днём: $daytimeTemp °С
            Температура ночью: $nighttimeTemp °С
            Наличие осадков: $hasPrecipitation
            """.trimIndent()
        )
    }
}

fun main() {
    val dayOne = DayWeather(
        _daytimeTemp = 300,
        _nighttimeTemp = 290,
        _hasPrecipitation = false,
    )
    dayOne.printData()
}