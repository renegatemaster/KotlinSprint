package org.example.lesson_7

const val PASSWORD_LENGTH = 6

fun main() {
    var password = ""
    val letterRange = 'a'..'z'
    val numberRange = 0..9
    for (i in 1..PASSWORD_LENGTH) {
        if (i % 2 != 0) {
            password += letterRange.random()
        } else {
            password += numberRange.random()
        }
    }
    println(password)
}