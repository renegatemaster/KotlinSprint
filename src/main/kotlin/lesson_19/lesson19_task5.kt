package org.example.lesson_19

const val CARD_INDEX_SIZE = 5
const val WELCOME_MESSAGE = """
    Добро пожаловать в приложение "Картотека"
    Количество допустимых записей: $CARD_INDEX_SIZE 
    Для каждого человека введите сначала имя, а затем литеру пола
    м — если ваш пол мужской
    ж — если ваш пол женский
    н — если вы предпочтёте не указывать свой пол
"""

enum class Gender(val short: String, val title: String) {
    MALE("м", "мужской"),
    FEMALE("ж", "женский"),
    NOT_STATED("н", "не указан"),
}

class Person(
    val name: String,
    val gender: Gender,
) {
    override fun toString(): String {
        return "$name, пол: ${gender.title}"
    }
}

fun createPerson(): Person {
    var name: String

    while (true) {
        println("Введите имя:")
        name = readln()
        if (name.isNotBlank()) break
        println("Имя не должно быть пустым")
    }

    var genderShort: String
    val genderShortList = listOf("м", "ж", "н")

    while (true) {
        println("Введите литеру пола (\"м\", \"ж\" или \"н\")")
        genderShort = readln()
        if (genderShort in genderShortList) break
        println("Неверная литера пола")
    }

    val gender = when (genderShort) {
        Gender.MALE.short -> Gender.MALE
        Gender.FEMALE.short -> Gender.FEMALE
        Gender.NOT_STATED.short -> Gender.NOT_STATED
        else -> Gender.NOT_STATED
    }

    return Person(name = name, gender = gender)
}

fun main() {
    val persons = mutableListOf<Person>()

    println(WELCOME_MESSAGE.trimIndent())
    for (i in 1..CARD_INDEX_SIZE) {
        persons.add(createPerson())
        println("Запись добавлена")
    }

    persons.forEach { println(it) }
}