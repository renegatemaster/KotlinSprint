package org.example.lesson_14

open class Message(
    val id: Int,
    val author: String,
    val text: String,
) {
    override fun toString(): String {
        return "$author: $text"
    }
}

class ChildMessage(
    id: Int,
    author: String,
    text: String,
    val parentMessageId: Int,
) : Message(id, author, text)

class Chat {
    val messages = mutableListOf<Message>()
    val threadMessages = mutableListOf<ChildMessage>()
    private var messagesIdCounter = 1
    private var threadMessagesIdCounter = 1

    fun addMessage(text: String, author: String) {
        messages.add(
            Message(
                id = messagesIdCounter++,
                author = author,
                text = text,
            )
        )
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Int) {
        val parentMessage: Message? = messages.firstOrNull { it.id == parentMessageId }

        if (parentMessage == null) {
            println("Сообщения с таким ID не существует")
            return
        } else {
            threadMessages.add(
                ChildMessage(
                    id = threadMessagesIdCounter++,
                    author = author,
                    text = text,
                    parentMessageId = parentMessageId,
                )
            )
        }
    }

    fun printChat() {
        val groupedThreadMessages = threadMessages.groupBy { it.parentMessageId }
        messages.forEach { message ->
            println(message)
            if (groupedThreadMessages.contains(message.id)) {
                groupedThreadMessages[message.id]?.forEach { println("\t$it") }
            }
        }
    }
}

fun main() {
    val chat = Chat()

    chat.addMessage(
        text = "Окрошка на кефире или на квасе?",
        author = "форумный тролль",
    )
    chat.addThreadMessage(
        text = "Конечно на кефире, кто вообще делает на квасе?",
        author = "странный чел",
        parentMessageId = 1
    )
    chat.addThreadMessage(
        text = "На кефире не канон, квас one love",
        author = "олд",
        parentMessageId = 1
    )
    chat.addMessage(
        text = "Что значит 42?",
        author = "newbie",
    )

    chat.printChat()
}