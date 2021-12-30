package ru.fefu.activitytracker.lists

class ListActivityTypes {
    private val listTypes = listOf(
        ActivityType(
            activity = "Велосипед"
        ),
        ActivityType(
            activity = "Бег"
        ),
        ActivityType(
            activity = "Шаг"
        ),
    )

    fun getItem(): List<ActivityType> = listTypes
}
