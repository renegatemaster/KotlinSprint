package org.example.lesson_1

fun main() {
    val secondsInSpace: Short = 6_480

    val secondsInHour: Short = 3_600
    val secondsInMinute: Byte = 60

    val hours = secondsInSpace / secondsInHour
    val timeLeft = secondsInSpace - hours * secondsInHour
    val minutes = timeLeft / secondsInMinute
    val seconds = timeLeft - minutes * secondsInMinute

    print('0')
    print(hours)
    print(":")
    print(minutes)
    print(":")
    print('0')
    print(seconds)
}