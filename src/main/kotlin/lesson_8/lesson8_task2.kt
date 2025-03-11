package org.example.lesson_8

fun main() {
    val recipe: Array<String> = arrayOf("соль", "сахар", "мука", "яйца", "молоко")

    println("Введите название ингредиента:")
    val enteredIngredient = readln()

    for (ingredient in recipe) {
        if (ingredient == enteredIngredient) {
            println("Ингредиент $ingredient в рецепте есть")
            return
        } else {
            continue
        }
    }
    println("Такого ингредиента в рецепте нет")
}