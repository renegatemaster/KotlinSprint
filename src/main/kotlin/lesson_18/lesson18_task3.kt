package org.example.lesson_18

open class Animal(val name: String) {
    protected open val food = "еду"

    open fun eat() {
        println("[$name] -> [ест $food]")
    }

    open fun sleep() {
        println("[$name] -> [спит]")
    }
}

class Fox(name: String) : Animal(name) {
    override val food: String = "ягоды"
}

class Dog(name: String) : Animal(name) {
    override val food: String = "кости"
}

class Cat(name: String) : Animal(name) {
    override val food: String = "рыбу"
}

fun main() {
    listOf<Animal>(
        Fox("Невероятный мистер Фокс"),
        Dog("Шарик"),
        Cat("Матроскин")
    ).let {
        it.forEach { animal -> animal.eat() }
    }
}