package org.example.lesson_11

class ForumMember private constructor(
    val userId: Int,
    val userName: String,
) {
    companion object {
        fun builder() = Builder()
    }

    class Builder {
        private var userId: Int = 0
        private var userName: String = ""

        fun setUserId(userId: Int) = apply { this.userId = userId }
        fun setUserName(userName: String) = apply { this.userName = userName }
        fun build() = ForumMember(userId, userName)
    }
}

class ForumMessage private constructor(
    val authorId: Int,
    val message: String,
) {
    companion object {
        fun builder() = Builder()
    }

    class Builder {
        private var authorId: Int = 0
        private var message: String = ""

        fun setAuthorId(authorId: Int) = apply { this.authorId = authorId }
        fun setMessage(message: String) = apply { this.message = message }
        fun build() = ForumMessage(authorId, message)
    }
}

class Forum {
    private var userIdCounter = 1
    private var forumMembers: MutableList<ForumMember> = mutableListOf()
    private var forumMessages: MutableList<ForumMessage> = mutableListOf()

    fun createNewUser(name: String) : ForumMember {
        val forumMember = ForumMember.builder()
            .setUserId(userIdCounter++)
            .setUserName(name)
            .build()
        forumMembers.add(forumMember)
        return forumMember
    }

    fun createNewMessage(authorId: Int, message: String) {
        val member = this.forumMembers.firstOrNull { it.userId == authorId }

        if (member != null) {
            val forumMessage = ForumMessage.builder()
                .setAuthorId(authorId)
                .setMessage(message)
                .build()
            forumMessages.add(forumMessage)
        } else return
    }

    fun printThread() {
        forumMessages.forEach { message ->
            val authorName: String = forumMembers.first() { member -> member.userId == message.authorId}.userName
            println("$authorName: ${message.message}")
        }
    }
}

fun main() {
    val forum = Forum()

    val neo = forum.createNewUser("Neo")
    val morpheus = forum.createNewUser("Morpheus")

    forum.createNewMessage(morpheus.userId, "Ты веришь в судьбу, Нео?")
    forum.createNewMessage(neo.userId, "Нет.")
    forum.createNewMessage(morpheus.userId, "Почему?")
    forum.createNewMessage(neo.userId, "Неприятно думать, что ты не контролируешь свою жизнь.")

    forum.printThread()
}