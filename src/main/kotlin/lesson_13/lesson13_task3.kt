package org.example.lesson_13

class Person(
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
    val noteBook: List<Person> = listOf(
        Person("Борис", 2_12_85_06, company = null),
        Person("Юрий", 777_777_77, company = null),
        Person("Аркадий", 666_666_66, company = "null"),
        Person("Владимир", 444_444_44),
        Person("Оксана", 333_333_33),
    )

    val companies: Set<String?> = (noteBook.map { person -> person.company }).toSet()
    println(companies)
}