package org.example.lesson_4

fun main() {
    val dayCounter = 5

    val isOdd = dayCounter % 2 != 0
    val output = """
        Упражнения для рук:    $isOdd
        Упражнения для ног:    ${!isOdd}
        Упражнения для спины:  ${!isOdd}
        Упражнения для пресса: $isOdd
    """.trimIndent()

    println(output)
}