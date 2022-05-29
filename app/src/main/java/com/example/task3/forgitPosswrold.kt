package com.example.task3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isNotEmpty
import com.example.task3.databinding.ActivityForgitPosswroldBinding

class forgitPosswrold : AppCompatActivity() {
    private lateinit var binding:ActivityForgitPosswroldBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgitPosswroldBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.appCompatButton.setOnClickListener{
            if (binding.mailf.length()!=0 ){
                binding.Mailsended.text="Check your mail"
            }else {
                binding.Mailsended.text="your mail input empty"
            }
        }
        binding.Return.setOnClickListener{
         val intent = Intent(this,MainActivity::class.java)
         startActivity(intent)
         finish()
        }
    }
}