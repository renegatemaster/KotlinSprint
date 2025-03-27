package org.example.lesson_21

fun List<Int>.evenNumbersSum() : Int {
    return filter { it % 2 == 0 }.sum()
}

fun main() {
    println(listOf<Int>(7, 1, 2, 5, 4, 10).evenNumbersSum())
}