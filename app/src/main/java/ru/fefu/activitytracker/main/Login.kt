package ru.fefu.activitytracker.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ru.fefu.activitytracker.R

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    }

    fun back(view: View) {
        onBackPressed()
    }
}
