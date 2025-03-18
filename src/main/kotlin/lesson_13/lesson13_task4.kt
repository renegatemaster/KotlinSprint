package org.example.lesson_13

class ContactInfo(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    private val notStated = "<не указано>"

    fun printData() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: notStated}")
    }
}

fun addContact(phoneBook: MutableList<ContactInfo>) {

    println("Введите имя:")
    val name = readln()
    if (name == "") {
        println("Имя обязательно для заполнения")
        return
    }

    println("Введите номер телефона:")
    val phoneNumber = readln().toLongOrNull()
    if (phoneNumber == null) {
        println("Вы не ввели номер телефона, запись не будет добавлена в телефонную книгу")
        return
    }

    println("Введите название компании:")
    val company = readlnOrNull()

    phoneBook.add(
        ContactInfo(
            name = name,
            phoneNumber = phoneNumber,
            company = company?.takeIf { it.isNotBlank() }
        )
    )
}

fun main() {
    val phoneBook: MutableList<ContactInfo> = mutableListOf()

    addContact(phoneBook)

    phoneBook.forEach { it.printData() }
}