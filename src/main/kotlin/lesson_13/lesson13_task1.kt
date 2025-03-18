package org.example.lesson_13

class Contact(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    init {
        this.printData()
    }

    fun printData() {
        println(
            """
            Имя: $name
            Номер: $phoneNumber
            Компания: $company
        """.trimIndent()
        )
    }
}

fun main() {
    Contact("Борис", 2_12_85_06, company = null)
}