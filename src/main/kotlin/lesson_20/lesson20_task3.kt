package org.example.lesson_20

class Player2() {
    var gotTheKey = false
}

val checkTheKey: (Player2) -> String =
    { player: Player2 -> if (player.gotTheKey) "Игрок открыл дверь" else "Дверь заперта" }

fun main() {
    val player = Player2()
    println(checkTheKey(player))

    player.gotTheKey = true
    println(checkTheKey(player))
}