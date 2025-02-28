package org.example.lesson_2

const val EMPLOYEE_SALARY: Int = 30_000
const val TRAINEE_SALARY: Int = 20_000

fun main() {
    val employeeCount = 50
    val traineeCount = 30

    val employeeSalaryExpanses = employeeCount * EMPLOYEE_SALARY
    val totalSalaryExpanses = employeeSalaryExpanses + traineeCount * TRAINEE_SALARY
    val averageSalary = totalSalaryExpanses / (employeeCount + traineeCount)

    println("Employee salary expanses — $employeeSalaryExpanses rubles")
    println("Total salary expanses — $totalSalaryExpanses rubles")
    println("Average salary — $averageSalary rubles")
}