package org.example.lesson_11

data class Category(
    val name: String,
    val description: String,
    var image: String = "",
)

data class Ingredient(
    val name: String,
    val amount: Int,
    val measurementUnit: String,
) {
    fun formatToString(): String {
        return "${this.name}: $amount $measurementUnit"
    }
}

data class Recipe(
    val name: String,
    val ingredients: MutableList<Ingredient>,
    val category: Category,
    var portions: Int = 1,
    var inFavorites: Boolean = false,
    val image: String = ""
) {
    fun getRecipe(portions: Int): String {
        var recipe = "${this.name}, рецепт на $portions порций:\n"
        this.ingredients.forEach {
            val ingredient = it.copy(amount = (it.amount / this.portions) * portions)
            recipe += "${ingredient.formatToString()},\n"
        }
        return recipe
    }

    fun changeFavoriteStatus() {
        this.inFavorites = !this.inFavorites
    }
}

fun main() {
    val snacks = Category(
        name = "Закуски",
        description = "Быстро перекусить",
    )

    val bread = Ingredient(
        name = "хлеб",
        amount = 1,
        measurementUnit = "ломтик"
    )

    val butter = Ingredient(
        name = "масло",
        amount = 20,
        measurementUnit = "гр."
    )

    val caviar = Ingredient(
        name = "икра",
        amount = 2,
        measurementUnit = "чайные ложки"
    )

    val caviarSandwich = Recipe(
        name = "Бутер с икрой",
        ingredients = mutableListOf(bread, butter, caviar),
        category = snacks
    )

    println("Введите количество порций:")
    val portions = readln().toInt()
    println(caviarSandwich.getRecipe(portions))

    caviarSandwich.changeFavoriteStatus()
    println("${caviarSandwich.name} в избранном: ${caviarSandwich.inFavorites}")
}