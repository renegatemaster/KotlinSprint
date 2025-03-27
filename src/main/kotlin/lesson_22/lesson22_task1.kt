package org.example.lesson_22

const val TITLE = "Маленький принц"
const val AUTHOR = "Антуан де Сент-Экзюпери"

class RegularBook(
    val title: String,
    val author: String,
)

data class DataBook(
    val title: String,
    val author: String,
)

fun main() {
    val theRegularPrince1 = RegularBook(TITLE, AUTHOR)
    val theRegularPrince2 = RegularBook(TITLE, AUTHOR)
    val theDataPrince1 = DataBook(TITLE, AUTHOR)
    val theDataPrince2 = DataBook(TITLE, AUTHOR)

    println("Сравниваем идентичные обычные книги: ${theRegularPrince1 == theRegularPrince2}")
    // Получаем false, так как сравниваются не объекты, а ссылки на ячейки памяти
    // equals() унаследован от Any и представляет собой сравнение типа '==='

    println("Сравниваем идентичные дата-книги: ${theDataPrince1 == theDataPrince2}")
    // Получаем true, так как equals() в дата-классах переопределён,
    // и сравниваются значения свойств объектов, а не ссылки

    println("Сравниваем обычную и дата-книгу: ${theRegularPrince1 == theDataPrince1}")
    // Получаем false, так как это объекты разных типов и они не связаны
    // Все возможные оставшиеся сравнения вернут false по той же причине
}