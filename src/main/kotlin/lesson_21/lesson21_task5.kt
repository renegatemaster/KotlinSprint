package org.example.lesson_21

fun Map<String, Int>.maxCategory() : String {
    return maxBy { it.value }.key
}

fun main() {
    val skills = mapOf<String, Int>(
        "Сила" to 10,
        "Ловкость" to 12,
        "Красноречие" to 17,
    )

    println(skills.maxCategory())
}