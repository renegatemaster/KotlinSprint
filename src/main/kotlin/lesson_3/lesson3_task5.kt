package org.example.lesson_3

fun main() {
    val turnData = "D2-D4;0"

    val turns = turnData.split("-", ";")
    val from = turns[0]
    val to = turns[1]
    val turnNumber = turns[2]

    println("From: $from")
    println("To: $to")
    println("Turn number: $turnNumber")
}