package ru.fefu.activitytracker.fragments

import ru.fefu.activitytracker.ListItem

class MyListRepository {
    private val listItem = listOf(
        ListItem.Date(
            date = "Вчера"
        ),

        ListItem.Item(
            distance = "9.43 км",
            time = "2 часа 3 минуты",
            date = "12 часов назад",
            startTime = "11:40",
            endTime = "13:43",
            activity = "Бег \uD83C\uDFC4",
        ),

        ListItem.Date(
            date = "Апрель 2021 года"
        ),

        ListItem.Item(
            distance = "2 км",
            time = "40 минут",
            date = "29.04.2021",
            startTime = "12:03",
            endTime = "12:43",
            activity = "Велосипед  \uD83D\uDEB2",
        )
    )

    fun getItem() : List<ListItem> = listItem
}
