package org.example.lesson_15

interface Movable {
    fun move()
}

interface Flying : Movable {
    fun fly()
    override fun move() = fly()
}

interface Swimming : Movable {
    fun swim()
    override fun move() = swim()
}

class CrucianCarp() : Swimming {
    override fun swim() { println("Карась плывёт") }
}

class Seagull() : Flying {
    override fun fly() { println("Чайка летит") }
}

class Duck() : Flying, Swimming {
    override fun fly() { println("Утка летит") }

    override fun swim() { println("Утка плывёт") }

    override fun move() {
        fly()
        swim()
    }
}

fun main() {
    listOf<Movable>(CrucianCarp(), Seagull(), Duck()).forEach { it.move() }
}