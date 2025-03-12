package org.example.lesson_9

fun main() {
    val recipe = listOf("соль", "сахар", "мука", "яйца", "молоко")

    println("В рецепте есть следующие ингредиенты:")
    recipe.forEach { ingredient: String ->
        println(ingredient)
    }
}