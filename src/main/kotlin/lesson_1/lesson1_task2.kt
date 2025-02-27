package org.example.lesson_1

fun main() {
    val ordersCount: Byte = 75
    val thankYouMessage: String = "Thanks for your purchase!"

    println("Number of orders: $ordersCount")
    println(thankYouMessage)

    var employeesCount: Short = 2_000
//    println("Number of employees: $employeesCount")

    employeesCount--
    println("Number of employees: $employeesCount")
}