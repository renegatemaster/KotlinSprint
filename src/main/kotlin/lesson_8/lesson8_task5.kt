package org.example.lesson_8

fun main() {
    println("Введите количество ингредиентов в рецепте:")
    val recipeSize = readln().toInt()

    val recipe = Array(recipeSize) {""}

    for (i in 1..recipeSize) {
        println("Ингредиент номер $i:")
        val ingredient = readln()
        recipe[i - 1] = ingredient
    }

    println("Ингредиенты: ${recipe.joinToString(", ")}")
}