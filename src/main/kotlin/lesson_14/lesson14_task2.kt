package org.example.lesson_14

enum class ShipType2 {
    LINER,
    CARGO_SHIP,
    ICEBREAKER,
}

open class Liner2(
    val type: ShipType2 = ShipType2.LINER,
    val speed: Int = 100,
    val passengerCapacity: Int = 300,
    val cargoCapacity: Int = 200,
    val isIcebreaker: Boolean = false
) {
    fun getType() = when (type) {
        ShipType2.LINER -> "Лайнер"
        ShipType2.CARGO_SHIP -> "Грузовое судно"
        ShipType2.ICEBREAKER -> "Ледокол"
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

    open fun loading() {
        println("Выдвижение горизонтального трапа со шкафута")
    }
}

class CargoShip2(
    speed: Int = 70,
    passengerCapacity: Int = 80,
    cargoCapacity: Int = 1000,
) : Liner2(type = ShipType2.CARGO_SHIP, speed, passengerCapacity, cargoCapacity) {
    override fun loading() {
        println("Активирование погрузочного крана")
    }
}

class Icebreaker2(
    speed: Int = 40,
    passengerCapacity: Int = 35,
    cargoCapacity: Int = 100,
) : Liner2(type = ShipType2.ICEBREAKER, speed, passengerCapacity, cargoCapacity, isIcebreaker = true) {
    override fun loading() {
        println("Открытие ворот со стороны кормы")
    }
}

fun main() {
    val liner = Liner2()
    val cargoShip = CargoShip2()
    val iceBreaker = Icebreaker2()

    println(liner)
    liner.loading()
    println()
    println(cargoShip)
    cargoShip.loading()
    println()
    println(iceBreaker)
    iceBreaker.loading()
}