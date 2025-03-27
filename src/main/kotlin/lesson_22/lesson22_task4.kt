package org.example.lesson_22

class MainScreenViewModel {
    data class MainScreenState(
        var data: String = "",
        var isLoading: Boolean = false,
    )
    private var state = MainScreenState()

    fun loadData() {
        println(state)
        Thread.sleep(1000)

        state = state.copy(isLoading = true)
        println(state)
        Thread.sleep(1000)

        state = state.copy(data = "Data", isLoading = false)
        println(state)
    }
}

fun main() {
    MainScreenViewModel().loadData()
}