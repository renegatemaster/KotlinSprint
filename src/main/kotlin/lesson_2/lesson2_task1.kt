package org.example.lesson_2

fun main() {
    val studentsMarks: IntArray = intArrayOf(3, 4, 3, 5)

    var total = 0.0f
    studentsMarks.forEach {
        total += it
    }
    println("${total / studentsMarks.size}")
}