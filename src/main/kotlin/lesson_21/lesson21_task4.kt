package org.example.lesson_21

import java.io.File

fun File.writeToFile(text: String) {
    createNewFile()
    writeText(text.lowercase())
}

fun main() {
    File("test.txt").writeToFile("Hello")
}