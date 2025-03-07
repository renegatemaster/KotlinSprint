package org.example.lesson_5

const val KM_PER_100KM = 100

fun main() {
    println("Добро пожаловать в приложение расчёта топлива!")

    println("Укажите расстояние поездки в километрах:")
    val tripDistanceKm = readln().toFloat()

    println("Укажите расход топлива на 100 км в литрах:")
    val fuelConsumptionPer100Km = readln().toFloat()

    println("Укажите текущую цену за литр топлива:")
    val fuelPricePerLiter = readln().toFloat()

    val fuelRequiredLiters = (tripDistanceKm * fuelConsumptionPer100Km) / KM_PER_100KM
    val fuelCost = fuelRequiredLiters * fuelPricePerLiter

    println("""
        Общее количество необходимого топлива: $fuelRequiredLiters л.
        Итоговая стоимость поездки: ${String.format("%.2f", fuelCost)}
        """.trimIndent()
    )
}
