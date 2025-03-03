package org.example.lesson_3

fun main() {
    val turnData = "D2-D4;0"

    val turns = turnData.substringBefore(';').split("-")
    val from = turns[0]
    val to = turns[1]
    val turnNumber = turnData.substringAfter(';').toInt()

    println("From: $from")
    println("To: $to")
    println("Turn number: $turnNumber")
}