package org.example.lesson_20

class Robot {
    private var modifier: (String) -> String = { s: String -> s }
    private val phrases = listOf(
        "Привет!",
        "Я - робот предназначенный для обучения Kotlin",
        "Я немногословен, но и не болтлив",
        "Пожалуйста, не вытыкай меня из розетки",
        "Перехожу в спящий режим",
    )

    fun say() {
        println(modifier(phrases.random()))
    }

    fun setModifier(lambda: (String) -> String) {
        modifier = lambda
    }
}

fun main() {
    val robot = Robot()
    robot.say()
    
    robot.setModifier { s: String -> s.reversed() }
    robot.say()
}