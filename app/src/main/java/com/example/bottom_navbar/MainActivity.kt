package com.example.bottom_navbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val appBarConfiguration = AppBarConfiguration(setOf(R.id.frame))

    val homeFragment = HomeFragment()
    val profileFragment = ProfileFragment()
    val tasbihFragment = TasbihFragment()

        val navbar = findViewById<BottomNavigationView>(R.id.bottomNavbar)

        navbar.setOnNavigationItemSelectedListener {
            when(it.itemId){
            R.id.homeIcon -> makeCurrentFragment(homeFragment)
            R.id.profileIcon -> makeCurrentFragment(profileFragment)
            R.id.tasbihIcon -> makeCurrentFragment(tasbihFragment)
                else -> {}
            }
            true
        }

        makeCurrentFragment(homeFragment)

    }

    private fun makeCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frame,fragment)
            commit()
        }
    }
}