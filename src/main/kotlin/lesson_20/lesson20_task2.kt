package org.example.lesson_20

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
)

val healingPotion: (Player) -> Unit = { player: Player -> player.currentHealth = player.maxHealth }

fun main() {
    val player1 = Player("Lucius", 5, 10)

    println(player1.currentHealth)
    healingPotion(player1)
    println(player1.currentHealth)
}