package org.example.lesson_14

import kotlin.math.PI
import kotlin.math.pow

enum class ColorType {
    BLACK,
    WHITE,
}

abstract class Figure(
    val color: ColorType
) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(
    color: ColorType,
    val radius: Double,
) : Figure(color) {
    override fun calculateArea(): Double {
        return PI * radius.pow(2)
    }

    override fun calculatePerimeter(): Double {
        return 2 * PI * radius
    }
}

class Rectangle(
    color: ColorType,
    val width: Double,
    val height: Double,
) : Figure(color) {
    override fun calculateArea(): Double {
        return width * height
    }

    override fun calculatePerimeter(): Double {
        return (width + height) * 2
    }
}

fun main() {
    val figures = mutableListOf(
        Circle(color = ColorType.BLACK, radius = 3.1),
        Circle(color = ColorType.WHITE, radius = 9.2),
        Rectangle(color = ColorType.WHITE, width = 3.0, height = 5.0),
        Rectangle(color = ColorType.BLACK, width = 10.0, height = 1.5),
    )

    val blackFiguresPerimeter: Double = figures
        .filter { it.color == ColorType.BLACK }
        .sumOf { it.calculatePerimeter() }
        .also {
            println("Сумма периметров всех черных фигур: ${String.format("%.3f", it)}")
        }

    val whiteFiguresArea: Double = figures
        .filter { it.color == ColorType.WHITE }
        .sumOf { it.calculateArea() }
        .also {
            println("Сумма площадей всех белых фигур: ${String.format("%.3f", it)}")
        }
}