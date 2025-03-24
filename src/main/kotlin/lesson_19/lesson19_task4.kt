package org.example.lesson_19

enum class Ammo(val title: String, val damage: Int) {
    BLUE("Синие", 5),
    GREEN("Зелёные", 10),
    RED("Красные", 20),
    NO_AMMO("Нет патронов", 0)
}

class Tank() {
    private var ammo: Ammo = Ammo.NO_AMMO

    fun loadAmmo(newAmmo: Ammo) {
        ammo = newAmmo
    }

    fun shoot() {
        if (ammo == Ammo.NO_AMMO) {
            println(ammo.title)
            return
        }
        println(ammo.damage)
    }
}

fun main() {
    val tank = Tank()
    tank.shoot()

    tank.loadAmmo(Ammo.BLUE)
    tank.shoot()

    tank.loadAmmo(Ammo.GREEN)
    tank.shoot()

    tank.loadAmmo(Ammo.RED)
    tank.shoot()
}