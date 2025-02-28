package org.example.lesson_1

const val SECONDS_IN_MINUTE: Byte = 60    // Кол-во секунд в одной минуте
const val SECONDS_IN_HOUR: Short = 3_600  // Кол-во секунд в одном часе

fun main() {
    val secondsInSpace: Short = 6_480

    val hours = secondsInSpace / SECONDS_IN_HOUR
    val timeLeft = secondsInSpace % SECONDS_IN_HOUR
    val minutes = timeLeft / SECONDS_IN_MINUTE
    val seconds = timeLeft % SECONDS_IN_MINUTE

    println("0$hours:$minutes:0$seconds")
}