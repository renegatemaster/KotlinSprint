package org.example.lesson_18

enum class Figure(val title: String) {
    CIRCLE("Круг"),
    SQUARE("Квадрат"),
    DOT("Точка");
}

class Screen() {
    private fun drawCommon(x: Number, y: Number, figure: Figure): String {
        return "${figure.title} нарисован(-а) в координатах x: $x, y: $y"
    }

    fun draw(x: Int, y: Int, figure: Figure) = drawCommon(x, y, figure)
    fun draw(x: Float, y: Int, figure: Figure) = drawCommon(x, y, figure)
    fun draw(x: Int, y: Float, figure: Figure) = drawCommon(x, y, figure)
    fun draw(x: Float, y: Float, figure: Figure) = drawCommon(x, y, figure)
}

fun main() {
    Screen().run {
        println(draw(1, 2, Figure.CIRCLE))
        println(draw(3, 4f, Figure.SQUARE))
        println(draw(5f, 6, Figure.DOT))
        println(draw(7f, 8f, Figure.CIRCLE))
    }
}