package org.example.lesson_17

class Folder(
    name: String,
    numberOfFiles: Int,
    var isSecret: Boolean = false
) {
    val name = name
        get() {
            return if (isSecret) {
                "скрытая папка"
            } else field
        }

    val numberOfFiles = numberOfFiles
        get() {
            return if (isSecret) {
                0
            } else field
        }
}

fun main() {
    val folder = Folder(name = "Фото_Анапа_2006", numberOfFiles = 200)
    println(folder.name)
    println(folder.numberOfFiles)

    folder.isSecret = true

    println(folder.name)
    println(folder.numberOfFiles)
}