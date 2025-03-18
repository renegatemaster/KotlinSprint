package org.example.lesson_13

class UserContact(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    private val notStated = "<не указано>"

    fun printData() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: notStated}")
    }
}

fun addContact(phoneBook: MutableList<UserContact>) {

    println("Введите имя:")
    val name = readln()
    if (name == "") {
        println("Имя обязательно для заполнения")
        return
    }

    println("Введите номер телефона:")
    val enteredNumber = readln()
    val phoneNumber: Long

    try {
        phoneNumber = enteredNumber.toLong()
    } catch (exception: NumberFormatException) {
        println(exception::class.simpleName)
        return
    }


    println("Введите название компании:")
    val company = readlnOrNull()

    phoneBook.add(
        UserContact(
            name = name,
            phoneNumber = phoneNumber,
            company = company?.takeIf { it.isNotBlank() }
        )
    )
}

fun main() {
    val phoneBook: MutableList<UserContact> = mutableListOf()

    addContact(phoneBook)

    phoneBook.forEach { it.printData() }
}