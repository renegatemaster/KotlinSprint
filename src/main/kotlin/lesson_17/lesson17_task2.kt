package org.example.lesson_17

class Ship(
    name: String,
    val averageSpeed: Double,
    val homePort: String,
) {
    var name = name
        set(value) {
            println("Имя корабля менять нельзя")
        }
}

fun main() {
    val ship = Ship(
        name = "Иван Фёдорович Крузенштерн",
        averageSpeed = 80.0,
        homePort = "Мурманск",
    )

    ship.name = "И.Ф.Крузенштерн"
    println(ship.name)
}