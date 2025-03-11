package org.example.lesson_8

fun main() {
    val recipe: Array<String> = arrayOf("соль", "сахар", "мука", "яйца", "молоко")

    println("Введите название ингредиента:")
    val enteredIngredient = readln()


    if (enteredIngredient in recipe) {
        println("Ингредиент $enteredIngredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}