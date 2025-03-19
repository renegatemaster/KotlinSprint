package org.example.lesson_15

abstract class Account(
    val id: Int,
    val name: String,
    val email: String,
    val password: String,
    val isAdmin: Boolean = false,
) {
    fun readForum() { println("$name читает форум") }
    fun sendMessage(text: String) { println("$name отправил сообщение: $text") }
}

class User(
    id: Int,
    name: String,
    email: String,
    password: String,
) : Account(id, name, email, password)

class Admin(
    id: Int,
    name: String,
    email: String,
    password: String,
) : Account(id, name, email, password, isAdmin = true) {
    fun deleteMessage() { println("Сообщение было удалено") }
    fun deleteAccount(account: Account) { println("Пользователь ${account.name} был удален") }
}

fun main() {
    val user = User(
        id = 1,
        name = "Anon",
        email = "gorgeous@mail.com",
        password = "qwerty",
    )
    val admin = Admin(
        id = 0,
        name = "BigBrother",
        email = "big.brother@mail.com",
        password = "v3ry57r0n9P455w0rd!",
    )

    user.readForum()
    user.sendMessage(text = "Паша, верни стену")
    admin.deleteMessage()
    admin.deleteAccount(user)
}

