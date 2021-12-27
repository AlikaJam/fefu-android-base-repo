package ru.fefu.activitytracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class WelcomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)

        val btnRegistration = findViewById<Button>(R.id.registrationButton)
        btnRegistration.setOnClickListener {
            startActivity(Intent(this, Registration::class.java))
        }

        val clickText = findViewById<TextView>(R.id.textQuestion)
        clickText.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
        }
    }
}
