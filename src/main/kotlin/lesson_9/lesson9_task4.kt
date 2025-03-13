package org.example.lesson_9

fun main() {
    var ingredientList: List<String>

    while (true) {
        println("Введите 5 ингредиентов через запятую (с пробелом):")
        val ingredientsString = readln()

        ingredientList = ingredientsString.split(", ")
        if (ingredientList.size == 5) break else println("Неверное количество ингредиентов")
    }

    val sortedIngredientList = ingredientList.sorted()
    println(sortedIngredientList.joinToString(", "))
}