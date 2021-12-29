package ru.fefu.activitytracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import ru.fefu.activitytracker.databinding.ActivityMainBinding
import ru.fefu.activitytracker.fragments.ActivityFragment
import ru.fefu.activitytracker.fragments.MyActivityFragment
import ru.fefu.activitytracker.fragments.ProfileFragment
import java.lang.reflect.Array.newInstance

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().apply {
                add(
                    R.id.fragmentContainerView,
                    ActivityFragment(),
                    "activityFragment"
                )
                commit()
            }
        }

        binding.bottomNav.setOnNavigationItemSelectedListener {
            val activityFragment = supportFragmentManager.findFragmentByTag("activityFragment")
            val profileFragment = supportFragmentManager.findFragmentByTag("profileFragment")
            when (it.itemId) {
                R.id.navigation_activity -> {
                    if (profileFragment !== null) {
                        supportFragmentManager.beginTransaction().hide(profileFragment).commit()
                    }
                    if (activityFragment !== null) {
                        supportFragmentManager.beginTransaction().show(activityFragment).commit()
                    }
                }

                R.id.navigation_profile -> {
                    if (activityFragment !== null) {
                        supportFragmentManager.beginTransaction().hide(activityFragment).commit()
                    }
                    if (profileFragment !== null) {
                        supportFragmentManager.beginTransaction().show(profileFragment).commit()
                    } else {
                        supportFragmentManager.beginTransaction().apply {
                            add(
                                R.id.fragmentContainerView,
                                ProfileFragment(),
                                "profileFragment"
                            )
                            commit()
                        }
                    }
                }
            }
            true
        }
    }
}
