package org.example.lesson_19

class SpaceShip() {
    fun takeoff() {
        // TODO("Implement takeoff logic")
    }
    fun landing() {
        // TODO("Implement landing logic")
    }

    fun asteroidShooting() {
        TODO()
    }
}

fun main() {
    try {
        SpaceShip().run { asteroidShooting() }
    } catch (e: NotImplementedError) {
        println(e::class.simpleName)
    }
}