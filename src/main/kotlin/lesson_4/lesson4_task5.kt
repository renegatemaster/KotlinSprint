package org.example.lesson_4

const val MIN_SUPPLY_AMOUNT = 50
const val MIN_CREW_SIZE = 55
const val MAX_CREW_SIZE = 70

fun main() {
    println("Укажите наличие повреждений (true/false):")
    val isDamaged = readln().toBoolean()
    println("Введите количество членов экипажа:")
    val crewMembersAmount = readln().toInt()
    println("Введите количество ящиков с провизией:")
    val supplyCratesAmount = readln().toInt()
    println("Погода благоприятна? (true/false):")
    val weatherIsFine = readln().toBoolean()

    val conditionOne = !isDamaged && crewMembersAmount in MIN_CREW_SIZE..MAX_CREW_SIZE && supplyCratesAmount > MIN_SUPPLY_AMOUNT
    val conditionTwo = crewMembersAmount == MAX_CREW_SIZE && weatherIsFine && supplyCratesAmount >= MIN_SUPPLY_AMOUNT

    val canShipSail = conditionOne || conditionTwo

    println("Условия для отплытия соблюдены: $canShipSail")
}