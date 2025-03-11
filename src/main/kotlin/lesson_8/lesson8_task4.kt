package org.example.lesson_8

fun printRecipe(recipe: Array<String>) {
    for (ingredient in recipe) {
        println(ingredient)
    }
}

fun main() {
    val recipe: Array<String> = arrayOf("соль", "сахар", "мука", "яйца", "молоко")
    printRecipe(recipe)

    var ingredientToChange: String

    while (true) {
        println("Введите название ингредиента, который хотите заменить:")
        ingredientToChange = readln()

        if (ingredientToChange in recipe) {
            break
        } else {
            println("Пожалуйста, введите существующий ингредиент")
        }
    }

    println("Введите название ингредиента, который хотите добавить:")
    val newIngredient = readln()

    val index = recipe.indexOf(ingredientToChange)
    recipe[index] = newIngredient

    printRecipe(recipe)
}