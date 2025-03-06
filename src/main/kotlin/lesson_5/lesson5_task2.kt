package org.example.lesson_5

import java.time.Year

const val AGE_OF_MAJORITY = 18

fun main() {
    println("Пожалуйста, введите год вашего рождения:")
    val yearOfBirth = readln().toInt()
    val currentYear: Int = Year.now().value

    // Если разница между годом рождения и текущим годом составляет N лет,
    // то это не гарантирует, что человеку уже исполнилось N лет,
    // поэтому на всякий случай отнимаем ещё единицу
    val userAge = currentYear - yearOfBirth - 1

    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Возвращение на главный экран")
    }
}