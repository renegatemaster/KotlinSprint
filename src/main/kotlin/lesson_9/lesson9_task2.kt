package org.example.lesson_9

const val POSITIVE_ANSWER = "ДА"

fun main() {
    val recipe = mutableListOf("хлеб", "колбаса", "сыр")
    println(
        """
        В рецепте есть базовые ингредиенты:
        ${recipe.joinToString(", ")}
        """.trimIndent()
    )

    println("Желаете добавить еще?")
    val answer = readln()

    if (!answer.equals(POSITIVE_ANSWER, ignoreCase = true)) return

    println("Какой ингредиент вы хотите добавить?")
    val newIngredient = readln()
    recipe.add(newIngredient)

    println(
        """
        Теперь в рецепте есть следующие ингредиенты:
        ${recipe.joinToString(", ")}
        """.trimIndent()
    )
}