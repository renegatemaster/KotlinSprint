package org.example.lesson_8

const val VIEWS_MONDAY = 10
const val VIEWS_TUESDAY = 12
const val VIEWS_WEDNESDAY = 9
const val VIEWS_THURSDAY = 10
const val VIEWS_FRIDAY = 14
const val VIEWS_SATURDAY = 15
const val VIEWS_SUNDAY = 13

fun main() {
    val weekViewsArray = intArrayOf(
        VIEWS_MONDAY,
        VIEWS_TUESDAY,
        VIEWS_WEDNESDAY,
        VIEWS_THURSDAY,
        VIEWS_FRIDAY,
        VIEWS_SATURDAY,
        VIEWS_SUNDAY,
    )

    var totalViews = 0
    for (i in weekViewsArray) {
        totalViews += i
    }

    println(totalViews)
}