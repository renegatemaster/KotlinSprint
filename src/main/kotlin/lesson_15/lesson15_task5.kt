package org.example.lesson_15

interface Transport {
    fun transport()
}

interface PassengerCarrier {
    fun boardPassengers(newPassengers: Int)
    fun unboardPassengers(leavingPassengers: Int)
}

interface CargoCarrier {
    fun loadCargo(newCargo: Int)
    fun unloadCargo(leavingCargo: Int)
}

open class PassengerCar() : Transport, PassengerCarrier {
    protected open var passengersBoarded: Int = 0
    protected open val passengersCapacity: Int = 3

    override fun transport() {
        println("Машина перевозит $passengersBoarded пассажиров")
    }

    override fun boardPassengers(newPassengers: Int) {
        if (passengersBoarded + newPassengers <= passengersCapacity) {
            passengersBoarded += newPassengers
            println("Посадка пассажиров, всего пассажиров: $passengersBoarded чел")
        } else println("Мест нет")
    }

    override fun unboardPassengers(leavingPassengers: Int) {
        if (passengersBoarded - leavingPassengers >= 0) {
            passengersBoarded -= leavingPassengers
            println("Высадка пассажиров, всего пассажиров: $passengersBoarded чел")
        } else println("Некого высаживать")
    }
}

class Lorry() : PassengerCar(), CargoCarrier {
    override val passengersCapacity: Int = 1
    private var cargoLoaded: Int = 0
    private val cargoCapacity: Int = 2

    override fun transport() {
        println("Машина перевозит $passengersBoarded пассажиров и $cargoLoaded тонн груза")
    }

    override fun loadCargo(newCargo: Int) {
        if (cargoLoaded + newCargo <= cargoCapacity) {
            cargoLoaded += newCargo
            println("Погрузка груза, всего погружено: $cargoLoaded т")
        } else println("Полная загрузка")
    }

    override fun unloadCargo(leavingCargo: Int) {
        if (cargoLoaded - leavingCargo >= 0) {
            cargoLoaded -= leavingCargo
            println("Выгрузка груза, всего погружено: $cargoLoaded т")
        } else println("Нечего выгружать")
    }
}

fun main() {
    val passengerCar1 = PassengerCar().also {
        it.boardPassengers(newPassengers = 3)
    }
    val passengerCar2 = PassengerCar().also {
        it.boardPassengers(newPassengers = 3)
    }
    val lorry = Lorry().also {
        it.loadCargo(newCargo = 2)
    }

    passengerCar1.transport()
    passengerCar2.transport()
    lorry.transport()
}