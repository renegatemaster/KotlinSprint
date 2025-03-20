package org.example.lesson_16

class Player(
    val name: String,
    private var damage: Int,
) {
    private var health: Int = 10
    private var isDead: Boolean = false

    private fun death() {
        health = 0
        damage = 0
        isDead = true
        println("Игрок $name умер")
    }

    fun getDamage(value: Int) {
        if (isDead) return
        if (health - value <= 0) {
            death()
        } else {
            health -= value
            println("$name получает $value ед. урона, здоровье: $health")
        }
    }

    fun restoreHealth(value: Int) {
        if (isDead) return
        if (health + value > 10) {
            health = 10
            println("$name полность восстановлен, здоровье: $health")
        } else {
            health += value
            println("$name восстанавлиает здоровье на $value ед., здоровье: $health")
        }
    }
}

fun main() {
    val player = Player(name = "Player1", damage = 3)
    with(player) {
        getDamage(3)
        getDamage(5)
        restoreHealth(4)
        getDamage(3)
        getDamage(3)
    }
}