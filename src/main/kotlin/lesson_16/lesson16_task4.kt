package org.example.lesson_16

enum class Status {
    PLACED,
    SHIPPED,
    DELIVERED,
}

class Order(val number: Int) {
    private var status: Status = Status.PLACED

    private fun changeStatus(newStatus: Status) { status = newStatus }
    fun requestStatusChange(newStatus: Status) { changeStatus(newStatus) }
}

fun main() {
    Order(number = 1).requestStatusChange(Status.SHIPPED)
}