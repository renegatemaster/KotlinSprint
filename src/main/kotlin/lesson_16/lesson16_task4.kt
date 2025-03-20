package org.example.lesson_16

enum class Status {
    PLACED,
    SHIPPED,
    DELIVERED,
}

class Order(val number: Int) {
    private var status: Status = Status.PLACED

    fun changeStatus(newStatus: Status) { status = newStatus }
}

fun requestStatusChange(order: Order, newStatus: Status) { order.changeStatus(newStatus) }

fun main() {
    val newOrder = Order(number = 1)
    requestStatusChange(newOrder, Status.SHIPPED)
}