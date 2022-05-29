package com.example.task3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.task3.databinding.ActivityMainBinding
import java.util.logging.Handler as Handler

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

       android.os.Handler().postDelayed({
            val intent = Intent(this,login::class.java)
           startActivity(intent)
           finish()
       },5000)
    }
}

