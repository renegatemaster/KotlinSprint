package org.example.lesson_9

fun main() {
    println("Введите 5 ингредиентов через запятую (с пробелом):")
    val ingredientsString = readln().split(", ").sorted()

    println(ingredientsString.joinToString(", "))
}