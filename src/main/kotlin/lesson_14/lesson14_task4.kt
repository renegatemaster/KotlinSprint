package org.example.lesson_14

abstract class CelestialObject(
    val name: String,
    val hasAtmosphere: Boolean,
    val isSuitableForLanding: Boolean,
) {
    override fun toString(): String {
        return """
            $name:
            Имеет атмосферу: $hasAtmosphere
            Можно высадиться: $isSuitableForLanding
            """.trimIndent()
    }
}

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
) : CelestialObject(name, hasAtmosphere, isSuitableForLanding)

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
    val satellites: MutableList<Satellite> = mutableListOf()
) : CelestialObject(name, hasAtmosphere, isSuitableForLanding)

fun main() {
    val ganymede = Satellite(name = "Ганимед", hasAtmosphere = true, isSuitableForLanding = true)
    val europa = Satellite(name = "Европа", hasAtmosphere = true, isSuitableForLanding = true)

    val jupiter = Planet(
        name = "Юпитер",
        hasAtmosphere = true,
        isSuitableForLanding = false,
        satellites = mutableListOf(ganymede, europa)
    )

    with(jupiter) {
        println("Планета \"$name\", спутники: ${satellites.joinToString { "\"${it.name}\"" }}")
    }
}