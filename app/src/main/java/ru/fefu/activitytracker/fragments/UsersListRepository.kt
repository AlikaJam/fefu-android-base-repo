package ru.fefu.activitytracker.fragments

import ru.fefu.activitytracker.ListItem

class UsersListRepository {
    private val usersListItem = listOf(
        ListItem.Date(
            date = "Вчера",
        ),
        ListItem.Item(
            distance = "9.43 км",
            time = "2 часа 3 минуты",
            activity = "Бег",
            date = "12 часов назад",
            startTime = "11:40",
            endTime = "13:43",
            user = "@coolfire",
        ),
        ListItem.Item(
            distance = "2 км",
            time = "40 минут",
            activity = "Велосипед",
            date = "18 часов назад",
            startTime = "12:03",
            endTime = "12:43",
            user = "@hawk",
        ),
        ListItem.Item(
            distance = "5 км",
            time = "1 час",
            activity = "Бег",
            date = "14 часов назад",
            startTime = "20:35",
            endTime = "21:35",
            user = "@snowflake",
        ),
    )

    fun getItem() : List<ListItem> = usersListItem
}
