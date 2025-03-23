package org.example.lesson_18

import kotlin.math.pow

open class Box(val length: Double) {
    open fun getSurfaceArea(): Double {
        return 0 * length
    }
}

class CubeBox(length: Double) : Box(length) {
    override fun getSurfaceArea(): Double {
        return 6 * length.pow(2)
    }
}

class RectangularBox(
    length: Double,
    val width: Double,
    val height: Double,
) : Box(length) {
    override fun getSurfaceArea(): Double {
        return 2 * (length * width + width * height + height * length)
    }
}

fun main() {
    listOf<Box>(CubeBox(3.0), RectangularBox(3.0, 2.0, 1.0))
        .let{
            it.forEach { box -> println("Площадь поверхности: ${box.getSurfaceArea()}") }
        }
}