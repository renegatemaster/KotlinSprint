package org.example.lesson_17

class QuizUnit(_question: String, _answer: String) {
    val question: String = _question
        get() = field
    var answer: String = _answer
        get() = field
        set(value) { field = value }
}

fun main() {
    val quizUnit = QuizUnit(_question = "Столица Португалии?", _answer = "Лиссабон")
    println(quizUnit.question)
    println(quizUnit.answer)
}