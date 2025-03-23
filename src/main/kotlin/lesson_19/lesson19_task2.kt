package org.example.lesson_19

enum class ProductCategory {
    CLOTHES {
        override fun title(): String {
            return "одежда"
        }
    },
    STATIONERY {
        override fun title(): String {
            return "канцелярские товары"
        }
    },
    MISCELLANEOUS {
        override fun title(): String {
            return "разное"
        }
    };

    abstract fun title() : String
}

class Product(
    val name: String,
    val id: Int,
    val category: ProductCategory,
) {
    fun printInfo() {
        println("Товар \"$name\", ID: $id, категория: \"${category.title()}\"")
    }
}

fun main() {
    listOf(
        Product("Футболка", 1, ProductCategory.CLOTHES),
        Product("Карандаш", 2, ProductCategory.STATIONERY),
        Product("Путеводитель автостопщика по галактике", 3, ProductCategory.MISCELLANEOUS),
    ).let { it.forEach { product -> product.printInfo() } }
}