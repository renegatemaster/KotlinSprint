package org.example.lesson_10

const val USER_LOGIN = "Oasis"
const val USER_PASSWORD = "Supersonic"
const val TOKEN_LENGTH = 32

fun getAuthToken(login: String, password: String) : String? {
    if (login == USER_LOGIN && password == USER_PASSWORD) {
        val tokenList: MutableList<Char> = mutableListOf()
        val randomizerRange = 1..4
        val numberRange = '0'..'9'
        val upperLetters = 'A'..'Z'
        val lowerLetters = 'a'..'z'
        val specialChars = "-_."

        for (i in 0 until TOKEN_LENGTH) {
            val randomizer = randomizerRange.random()
            when (randomizer) {
                1 -> tokenList.add(numberRange.random())
                2 -> tokenList.add(upperLetters.random())
                3 -> tokenList.add(lowerLetters.random())
                4 -> tokenList.add(specialChars.random())
            }
        }
        tokenList.shuffle()
        return tokenList.joinToString("")
    } else {
        return null
    }
}

fun getCart(token: String?) : String {
    return if (token != null) "Хлеб, сыр, колбаса" else "Неудачная авторизация"
}

fun main() {
    println("Введите логин:")
    val enteredLogin = readln()

    println("Введите пароль:")
    val enteredPassword = readln()

    val token: String? = getAuthToken(login = enteredLogin, password = enteredPassword)
    val result = getCart(token = token)

    println(result)
}