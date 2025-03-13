package org.example.lesson_8

fun printRecipe(recipe: Array<String>) {
    for (ingredient in recipe) {
        println(ingredient)
    }
}

fun main() {
    val recipe: Array<String> = arrayOf("соль", "сахар", "мука", "яйца", "молоко")
    printRecipe(recipe)

    var index: Int

    while (true) {
        println("Введите название ингредиента, который хотите заменить:")
        val ingredientToChange = readln()
        index = recipe.indexOf(ingredientToChange)

        if (index != -1) {
            break
        } else {
            println("Пожалуйста, введите существующий ингредиент")
        }
    }

    println("Введите название ингредиента, который хотите добавить:")
    val newIngredient = readln()

    recipe[index] = newIngredient

    printRecipe(recipe)
}