package org.example.lesson_2

const val TOTAL_PERCENTS = 100

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buffInPercents = 20

    val bonusCrystalOre = crystalOre * buffInPercents / TOTAL_PERCENTS
    val bonusIronOre = ironOre * buffInPercents / TOTAL_PERCENTS

    println("Bonus crystal ore: $bonusCrystalOre")
    println("Bonus iron ore: $bonusIronOre")
}