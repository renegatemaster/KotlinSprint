package org.example.lesson_19

enum class Fish(val title: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SEAMESE_FIGHTING_FISH("Петушок"),
}

fun main() {
    println("Рыбы, которых вы можете добавить в свой аквариум:")
    Fish.entries.forEach { println(it.title) }
}