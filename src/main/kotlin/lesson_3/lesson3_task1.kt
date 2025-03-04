package org.example.lesson_3

fun greetUser(greeting: String, userName: String) {
    println("$greeting, $userName!")
}

fun main() {
    val userName = "Alf"

    var greeting = "Good afternoon"
    greetUser(greeting, userName)

    greeting = "Good evening"
    greetUser(greeting, userName)
}