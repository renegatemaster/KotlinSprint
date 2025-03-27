package org.example.lesson_21

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
)

fun Player.isHealthy() : Boolean {
    return currentHealth == maxHealth
}

fun main() {
    val player = Player("Buzz", 7, 10)
    println(player.isHealthy())

    player.currentHealth = player.maxHealth
    println(player.isHealthy())
}