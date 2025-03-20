package org.example.lesson_16

import kotlin.math.pow

class Circle(private val radius: Double) {
    internal val pi = 3.14

    fun getLength(): Double {
        return 2 * pi * radius
    }

    fun getArea(): Double {
        return pi * radius.pow(2)
    }
}

fun main() {
    Circle(radius = 4.2).let {
        println("Длина окружности: ${String.format("%.3f", it.getLength())}")
        println("Площадь окружности: ${String.format("%.3f", it.getArea())}")
    }
}