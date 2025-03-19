package org.example.lesson_15

abstract class Product(
    val name: String,
    val amount: Int,
) {
    override fun toString(): String {
        return "$name: $amount шт на складе"
    }
}

interface Finder {
    fun search() { println("Выполняется поиск") }
}

class Component(name: String, amount: Int) : Product(name, amount)

class Instrument(name: String, amount: Int) : Product(name, amount), Finder

fun main() {
    println(Component(name = "Струны", amount = 30))
    Instrument(name = "Гитара", amount = 10).let {
        println(it)
        it.search()
    }
}