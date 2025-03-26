package org.example.lesson_22

data class Account(
    val id: Int,
    val name: String,
    val isAdmin: Boolean,
)

fun main() {
    val (id, name, isAdmin) = Account(1, "Neo", false)
    println("ID: $id, name: $name, is admin: $isAdmin")
    // У дата-классов автоматически создаются методы componentN() для каждого свойства
    // Они вызываются при деструктуризации объекта
}