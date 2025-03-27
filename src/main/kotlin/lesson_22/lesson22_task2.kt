package org.example.lesson_22

private const val TITLE = "Маленький принц"
private const val AUTHOR = "Антуан де Сент-Экзюпери"

class RegularBook1(
    val title: String,
    val author: String,
)

data class DataBook1(
    val title: String,
    val author: String,
)

fun main() {
    val theRegularPrince = RegularBook1(TITLE, AUTHOR)
    val theDataPrince = DataBook1(TITLE, AUTHOR)

    println("Печатаем обычную книгу: $theRegularPrince")
    // Получаем: пакет.класс@хэш-код
    // Реализация toString() унаследована от класса Any

    println("Печатаем дата-книгу: $theDataPrince")
    // Получаем: класс(свойство1=значение, свойство2=значение)
    // Реализация toString() переопределена в дата-классе
}