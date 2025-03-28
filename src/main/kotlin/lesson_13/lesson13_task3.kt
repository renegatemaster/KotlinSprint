package org.example.lesson_13

class Person(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    init {
        printData()
    }

    fun printData() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val noteBook: List<Person> = listOf(
        Person("Борис", 2_12_85_06, company = null),
        Person("Юрий", 777_777_77, company = null),
        Person("Аркадий", 666_666_66, company = "null"),
        Person("Владимир", 444_444_44),
        Person("Оксана", 333_333_33),
    )

    val companies = noteBook.mapNotNull { person -> person.company }
    println(companies)
}