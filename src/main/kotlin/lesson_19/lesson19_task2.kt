package org.example.lesson_19

enum class ProductCategory {
    CLOTHES,
    STATIONERY,
    MISCELLANEOUS;

    fun getCategoryName() = when (this) {
        CLOTHES -> "одежда"
        STATIONERY -> "канцелярские товары"
        MISCELLANEOUS -> "разное"
    }
}

class Product(
    val name: String,
    val id: Int,
    val category: ProductCategory,
) {
    fun printInfo() {
        println("Товар \"$name\", ID: $id, категория: \"${category.getCategoryName()}\"")
    }
}

fun main() {
    listOf(
        Product("Футболка", 1, ProductCategory.CLOTHES),
        Product("Карандаш", 2, ProductCategory.STATIONERY),
        Product("Путеводитель автостопщика по галактике", 3, ProductCategory.MISCELLANEOUS),
    ).let { it.forEach { product -> product.printInfo() } }
}