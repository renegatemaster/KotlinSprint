package org.example.lesson_5

import kotlin.Float.Companion.POSITIVE_INFINITY
import kotlin.Float.Companion.NEGATIVE_INFINITY
import kotlin.math.pow

const val CENTIMETERS_IN_METER = 100
const val UNDERWEIGHT_BORDER = 18.5f
const val NORMAL_WEIGHT_BORDER = 25f
const val OVERWEIGHT_BORDER = 30f

fun main() {
    val underweight = NEGATIVE_INFINITY..<UNDERWEIGHT_BORDER
    val normalBodyWeight = UNDERWEIGHT_BORDER..<NORMAL_WEIGHT_BORDER
    val overweight = NORMAL_WEIGHT_BORDER..<OVERWEIGHT_BORDER
    val obesity = OVERWEIGHT_BORDER..POSITIVE_INFINITY

    println("Добро пожаловать в приложения расчёта индекса массы тела!")

    println("Укажите вашу массу в килограммах:")
    val massInKilograms = readln().toFloat()

    println("Укажите ваш рост в сантиметрах:")
    val heightInCentimeters = readln().toFloat()

    val userHeightInMeters = heightInCentimeters / CENTIMETERS_IN_METER
    val bodyMassIndex = massInKilograms / userHeightInMeters.pow(2)

    when (bodyMassIndex) {
        in underweight -> println("Недостаточная масса тела")
        in normalBodyWeight -> println("Нормальная масса тела")
        in overweight -> println("Избыточная масса тела")
        in obesity -> println("Ожирение")
        else -> println("Непредвиденная ошибка")
    }
    println("Индекс массы тела: ${String.format("%.2f", bodyMassIndex)}")
}