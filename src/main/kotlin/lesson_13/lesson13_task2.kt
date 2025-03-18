package org.example.lesson_13

class PersonalData(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    init {
        this.printData()
    }
    private val notStated = "<не указано>"

    fun printData() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: notStated}")
    }
}

fun main() {
    PersonalData("Борис", 2_12_85_06)
}