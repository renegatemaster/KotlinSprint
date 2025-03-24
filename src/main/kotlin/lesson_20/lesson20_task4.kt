package org.example.lesson_20

val button: (String) -> () -> Unit = { s: String -> { println("Нажат элемент [$s]") } }

fun main() {
    val someList = listOf("нулевой", "первый", "второй", "третий", "четвёртый")
    val lmbdList: List<() -> Unit> = someList.map { button(it) }
    for (i in lmbdList.indices) {
        if (i % 2 == 0) lmbdList[i]()
    }
}