package org.example.lesson_18

class Order(
    val number: Int,
    private val goods: List<String>
) {
    fun getInfo() = when {
        goods.isEmpty() -> println("Заказ пуст")
        goods.size == 1 -> getInfo(goods.first())
        else -> getInfo(goods)
    }

    private fun getInfo(goods: List<String>) {
        println("Заказаны следующие товары: ${goods.joinToString(", ") { "[$it]" }}")
    }

    private fun getInfo(goods: String) {
        println("Заказан товар: [$goods]")
    }
}

fun main() {
    Order(1, listOf("Шляпа", "Пальто", "Трубка")).getInfo()
    Order(2, listOf("Носки")).getInfo()
}

