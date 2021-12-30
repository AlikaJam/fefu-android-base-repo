package ru.fefu.activitytracker.lists

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime

class UsersListRepository {
    @RequiresApi(Build.VERSION_CODES.O)
    private val usersListItem = listOf(
        ListItem.Date(
            date = "Вчера",
        ),
        ListItem.Item(
            id = 125,
            distance = "9.43 км",
            time = "2 часа 3 минуты",
            activity = "Бег",
            date = "12 часов назад",
            startTime = LocalDateTime.now(),
            endTime = LocalDateTime.now(),
            user = "@coolfire",
        ),
        ListItem.Item(
            id = 133,
            distance = "2 км",
            time = "40 минут",
            activity = "Велосипед",
            date = "18 часов назад",
            startTime = LocalDateTime.now(),
            endTime = LocalDateTime.now(),
            user = "@hawk",
        ),
        ListItem.Item(
            id = 15,
            distance = "5 км",
            time = "1 час",
            activity = "Бег",
            date = "14 часов назад",
            startTime = LocalDateTime.now(),
            endTime = LocalDateTime.now(),
            user = "@snowflake",
        ),
    )

    fun getItem() : List<ListItem> = usersListItem
}
