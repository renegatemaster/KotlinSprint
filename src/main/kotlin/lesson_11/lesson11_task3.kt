package org.example.lesson_11

enum class Status {
    SPEAKING,
    MIC_TURNED_OFF,
    MUTED
}

class Member(
    val nickname: String,
    var avatar: String = "",
    var status: Status = Status.MIC_TURNED_OFF
) {
    fun getStatus() = when(this.status) {
        Status.SPEAKING -> "разговаривает"
        Status.MIC_TURNED_OFF -> "микрофон выключен"
        Status.MUTED -> "пользователь заглушен"
    }

    fun printInfo() {
        println("Ник: ${this.nickname}, статус: ${this.getStatus()}")
    }
}

class Room(
    val name: String,
    val cover: String = "",
    val members: MutableList<Member> = mutableListOf(),
) {
    fun addMember(member: Member) {
        this.members.add(member)
    }

    fun setMemberStatus(nickname: String, newStatus: Status) {
        val member = this.members.firstOrNull { it.nickname == nickname }

        if (member != null) {
            member.status = newStatus
        } else {
            println("Участник с никнеймом $nickname не найден")
        }
    }
}

fun main() {
    val member1 = Member(nickname = "Neo")

    val member2 = Member(nickname = "Morpheus")

    val room = Room(name = "Matrix")

    room.addMember(member1)
    room.addMember(member2)
    room.setMemberStatus("Neo", Status.SPEAKING)

    for (member in room.members) {
        member.printInfo()
    }
}