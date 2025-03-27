package org.example.lesson_22

import java.time.LocalDateTime

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: LocalDateTime,
    val distanceToEarth: Double,
)

fun main() {
    val alphaCentauri = GalacticGuide(
        name = "Alpha Centauri",
        description = "Ближайшая звёздная система к Солнцу, состоящая из трёх звёзд: Alpha Centauri A, Alpha Centauri B и Proxima Centauri.",
        dateTime = LocalDateTime.now(),
        distanceToEarth = 4.37
    )

    println(
        """
        Название места: ${alphaCentauri.component1()}
        Описание: ${alphaCentauri.component2()}
        Дата и время события: ${alphaCentauri.component3()}
        Расстояние до Земли в световых годах: ${alphaCentauri.component4()}
        """.trimIndent()
    )
}