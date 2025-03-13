package org.example.lesson_10

fun generatePassword(length: Int) : String {
    val passwordList: MutableList<Char> = mutableListOf()
    val numberRange = '0'..'9'
    val specialChars = "!\"#$%&'()*+,-./ "

    for (i in 0 until length) {
        if (i % 2 == 0) passwordList.add(numberRange.random()) else passwordList.add(specialChars.random())
    }

    return passwordList.joinToString("")
}

fun main() {
    println("Укажите длину пароля:")
    val length = readln().toInt()

    val password = generatePassword(length)
    println(password)
}