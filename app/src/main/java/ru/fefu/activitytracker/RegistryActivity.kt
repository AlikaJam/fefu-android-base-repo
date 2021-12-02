package ru.fefu.activitytracker
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RegistryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registry)
    }
    fun back(view: View) {
        onBackPressed()
    }
}

