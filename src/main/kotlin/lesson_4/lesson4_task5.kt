package org.example.lesson_4

const val MIN_SUPPLY_AMOUNT = 50
const val MIN_CREW_SIZE = 55
const val MAX_CREW_SIZE = 70
const val RECOMMENDED_CREW_SIZE = 70
const val SUPPLY_AMOUNT_REQUIRED_IF_DAMAGED = 50

fun main() {
    println("Укажите наличие повреждений (true/false):")
    val isShipDamaged = readln().toBoolean()

    println("Введите количество членов экипажа:")
    val crewSize = readln().toInt()

    println("Введите количество ящиков с провизией:")
    val supplyCratesAmount = readln().toInt()

    println("Погода благоприятна? (true/false):")
    val isWeatherFine = readln().toBoolean()

    val conditionOne = !isShipDamaged && crewSize in MIN_CREW_SIZE..MAX_CREW_SIZE && supplyCratesAmount > MIN_SUPPLY_AMOUNT
    val conditionTwo = crewSize == RECOMMENDED_CREW_SIZE && isWeatherFine && supplyCratesAmount >= SUPPLY_AMOUNT_REQUIRED_IF_DAMAGED

    val canShipSail = conditionOne || conditionTwo

    println("Условия для отплытия соблюдены: $canShipSail")
}