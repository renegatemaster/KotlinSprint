package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val initialAmount = 70_000
    val interestRateInPercents = 16.7
    val depositPeriodInYears = 20

    // Compound interest formula: A = P(1 + r/100)^t
    val totalAmount = initialAmount * (1 + interestRateInPercents/100).pow(depositPeriodInYears)

    println(String.format("%.3f", totalAmount))
}