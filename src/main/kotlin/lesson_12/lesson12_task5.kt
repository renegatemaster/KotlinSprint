package org.example.lesson_12

class WeatherReport(
    _daytimeTemp: Int,
    _nighttimeTemp: Int,
    _hasPrecipitation: Boolean,
) {
    private val kelvinOffset = 273

    val daytimeTemp = _daytimeTemp - kelvinOffset
    val nighttimeTemp = _nighttimeTemp - kelvinOffset
    val hasPrecipitation = _hasPrecipitation

    init {
        this.printData()
    }

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
    val monthWeatherReport: MutableList<WeatherReport> = mutableListOf()

    val daytimeRange = 290..305
    val nighttimeRange = 285..295
    val booleanRange = 0..1

    for (i in 1..30) {
        monthWeatherReport.add(
            WeatherReport(
                _daytimeTemp = daytimeRange.random(),
                _nighttimeTemp = nighttimeRange.random(),
                _hasPrecipitation = booleanRange.random() == 0,
            )
        )
    }

    val daytimeTemps: List<Int> = monthWeatherReport.map { day -> day.daytimeTemp }
    val averageDaytimeTemp = daytimeTemps.average().toInt()
    val nighttimeTemps: List<Int> = monthWeatherReport.map { day -> day.nighttimeTemp }
    val averageNighttimeTemp = nighttimeTemps.average().toInt()

    var precipitationDays = 0
    monthWeatherReport.forEach { day ->
        if (day.hasPrecipitation) precipitationDays++
    }

    println(
        """
        Отчёт за месяц
        Средняя температура днём: $averageDaytimeTemp °С
        Средняя температура ночью: $averageNighttimeTemp °С
        Количество дней с осадками: $precipitationDays
    """.trimIndent()
    )
}