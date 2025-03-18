package org.example.lesson_14

enum class ShipType {
    LINER,
    CARGO_SHIP,
    ICEBREAKER,
}

open class Liner(
    val type: ShipType = ShipType.LINER,
    val speed: Int = 100,
    val passengerCapacity: Int = 300,
    val cargoCapacity: Int = 200,
    val isIcebreaker: Boolean = false
) {
    fun getType() = when (type) {
        ShipType.LINER -> "Лайнер"
        ShipType.CARGO_SHIP -> "Грузовое судно"
        ShipType.ICEBREAKER -> "Ледокол"
    }

    override fun toString(): String {
        return """
            ${getType()}:
            скорость - $speed миль/ч,
            пассажировместимость - $passengerCapacity,
            грузовместимость - $cargoCapacity,
            может колоть лёд - $isIcebreaker
            """.trimIndent()
    }
}

class CargoShip(
    speed: Int = 70,
    passengerCapacity: Int = 80,
    cargoCapacity: Int = 1000,
) : Liner(type = ShipType.CARGO_SHIP, speed, passengerCapacity, cargoCapacity)

class Icebreaker(
    speed: Int = 40,
    passengerCapacity: Int = 35,
    cargoCapacity: Int = 100,
) : Liner(type = ShipType.ICEBREAKER, speed, passengerCapacity, cargoCapacity, isIcebreaker = true)

fun main() {
    val liner = Liner()
    val cargoShip = CargoShip()
    val iceBreaker = Icebreaker()

    println(liner)
    println()
    println(cargoShip)
    println()
    println(iceBreaker)
}