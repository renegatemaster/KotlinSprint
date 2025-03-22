package org.example.lesson_17

class Shipment(
    val number: Int,
    location: String,
) {
    private var movementCounter = 0

    var location = location
        set(value) {
            field = value
            movementCounter++
        }

    override fun toString(): String {
        return "Посылка №$number, положение: $location, число перемещений: $movementCounter"
    }
}

fun main() {
    val shipment = Shipment(number = 42, location = "Склад")
    println(shipment)

    shipment.location = "Пункт выдачи"
    println(shipment)
}