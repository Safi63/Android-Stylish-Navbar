package com.example.bottom_navbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottom_navbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)


    }
}