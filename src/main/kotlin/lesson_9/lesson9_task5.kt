package org.example.lesson_9

const val AMOUNT_OF_INGREDIENTS = 5

fun main() {

    val recipe: MutableList<String> = mutableListOf()
    println("Введите $AMOUNT_OF_INGREDIENTS ингредиентов:")

    while (recipe.size < AMOUNT_OF_INGREDIENTS) {
        val ingredient = readln().trim().lowercase()

        if (recipe.indexOf(ingredient) == -1) {
            recipe.add(ingredient)
        } else {
            println("Ингредиент уже существует")
        }
    }

    val sortedRecipe = recipe.sorted().toMutableList()
    sortedRecipe[0] = sortedRecipe[0].replaceFirstChar { it.uppercase() }

    println(sortedRecipe.joinToString(", "))
}