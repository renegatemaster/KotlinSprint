package org.example.lesson_4

const val TOTAL_NUMBER_OF_TABLES = 13

fun main() {
    val tablesBookedToday = 13
    val tablesBookedTomorrow = 9

    val bookStatusToday = "[Доступность столиков на сегодня: ${tablesBookedToday < TOTAL_NUMBER_OF_TABLES}]"
    val bookStatusTomorrow = "[Доступность столиков на завтра: ${tablesBookedTomorrow < TOTAL_NUMBER_OF_TABLES}]"

    println("$bookStatusToday,\n$bookStatusTomorrow.")
}