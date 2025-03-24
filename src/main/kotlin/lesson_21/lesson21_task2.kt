package org.example.lesson_21

fun List<Int>.evenNumbersSum() : Int {
    var sum = 0
    forEach { if (it % 2 == 0) sum += it }
    return sum
}

fun main() {
    println(listOf<Int>(7, 1, 2, 5, 4, 10).evenNumbersSum())
}