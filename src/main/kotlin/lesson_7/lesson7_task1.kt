package org.example.lesson_7

const val PASSWORD_LENGTH = 6

fun main() {
    var password = ""
    for (i in 1..PASSWORD_LENGTH) {
        if (i % 2 != 0) {
            password += ('a'..'z').random()
        } else {
            password += (0..9).random()
        }
    }
    println(password)
}