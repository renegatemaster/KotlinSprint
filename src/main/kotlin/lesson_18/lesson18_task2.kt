package org.example.lesson_18

open class Dice() {
    protected open val value = 0

    open fun rollTheDice() = value
}

class TetrahedralDice() : Dice() {
    override val value = (1..4).random()
}

class HexagonalDice() : Dice() {
    override val value = (1..6).random()
}

class OctahedralDice() : Dice() {
    override val value = (1..8).random()
}

fun main() {
    listOf<Dice>(TetrahedralDice(), HexagonalDice(), OctahedralDice())
        .let {
            it.forEach { dice ->
                println("Результат броска: ${dice.rollTheDice()}")
            }
        }
}