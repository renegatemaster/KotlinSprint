package org.example.lesson_15

abstract class WeatherStationStats(val value: Double)

class Temperature(value: Double) : WeatherStationStats(value) {
    override fun toString(): String {
        return "Температура: $value°C"
    }
}

class PrecipitationAmount(value: Double) : WeatherStationStats(value) {
    override fun toString(): String {
        return "Количество осадков: $value мм"
    }
}

class WeatherServer {
    fun sendMessage(forecast: WeatherStationStats) {
        when (forecast) {
            is Temperature -> println(forecast)
            is PrecipitationAmount -> println(forecast)
            else -> return
        }
    }
}

fun main() {
    WeatherServer().let {
        it.sendMessage(Temperature(value = 15.0))
        it.sendMessage(PrecipitationAmount(value = 0.3))
    }
}