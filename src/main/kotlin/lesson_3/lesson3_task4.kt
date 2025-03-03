package org.example.lesson_3

fun printFormattedTurn(from: String, to: String, turnNumber: Int) {
    println("$from-$to;$turnNumber")
}

fun main() {
    var from = "E2"
    var to = "E4"
    var turnNumber = 1

    printFormattedTurn(from, to, turnNumber)

    from = "D2"
    to = "D3"
    turnNumber++

    printFormattedTurn(from, to, turnNumber)
}