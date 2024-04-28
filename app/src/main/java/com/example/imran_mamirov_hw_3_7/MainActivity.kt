package com.example.imran_mamirov_hw_3_7

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().add(R.id.container1, FirstFragment()).commit()
            supportFragmentManager.beginTransaction().add(R.id.container2, SecondFragment())
                .commit()
        }
    }
}