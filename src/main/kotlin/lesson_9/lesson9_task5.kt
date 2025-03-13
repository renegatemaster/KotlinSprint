package org.example.lesson_9

const val AMOUNT_OF_INGREDIENTS = 5

fun main() {

    val recipe: MutableSet<String> = mutableSetOf()
    println("Введите $AMOUNT_OF_INGREDIENTS ингредиентов:")

    while (recipe.size < AMOUNT_OF_INGREDIENTS) {
        val ingredient = readln().trim().lowercase()

        if (!recipe.add(ingredient)) {
            println("Ингредиент уже существует")
        }
    }

    val sortedRecipe = recipe.sorted()

    println(sortedRecipe.joinToString(", ") { ingredient ->
        if (ingredient == sortedRecipe[0]) ingredient.replaceFirstChar { it.uppercase() } else ingredient
    })
}

