package org.example.lesson_19

enum class Ammo(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank {
    private var ammo: Ammo? = null

    fun loadAmmo(newAmmo: Ammo) {
        ammo = newAmmo
    }

    fun shoot() {
        if (ammo == null) {
            println("Нет патронов")
            return
        }
        println(ammo!!.damage)
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