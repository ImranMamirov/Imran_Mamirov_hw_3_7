package com.example.imran_mamirov_hw_3_7

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.imran_mamirov_hw_3_7.databinding.SecondActivityBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: SecondActivityBinding
    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        binding = SecondActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent.getStringExtra("key")
        binding.tvSecond.text = data
    }
}