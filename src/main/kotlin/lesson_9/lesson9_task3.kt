package org.example.lesson_9

const val EGGS_PER_PORTION = 2
const val MILK_PER_PORTION = 50
const val BUTTER_PER_PORTION = 15

fun main() {
    val recipe = listOf(EGGS_PER_PORTION, MILK_PER_PORTION, BUTTER_PER_PORTION)

    println("Укажите количество порций:")
    val portions = readln().toInt()

    val recipeForPortions = recipe.map { it * portions }
    println(
        """
        На $portions порций вам понадобится:
        Яиц – ${recipeForPortions[0]}, молока – ${recipeForPortions[1]}, сливочного масла – ${recipeForPortions[2]}
        """.trimIndent()
    )
}