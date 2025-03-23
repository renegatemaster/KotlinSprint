package org.example.lesson_19

class SpaceShip() {
    fun takeoff() {
        TODO("Нужна информация о дополнительной логике")
    }
    fun landing() {
        TODO("Нужна информация о дополнительной логике")
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