package com.example.task3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isNotEmpty
import com.example.task3.databinding.ActivityLoginBinding

class login : AppCompatActivity() {
    private lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            if (binding.inpFullNameLayout.isNotEmpty() && binding.inppossworldlayout.isNotEmpty()){
            var intent = Intent(this,Resturent::class.java)
            startActivity(intent)
            finish()
        }else{
                binding.textView.text=" input is empty"
            }
        }
        binding.tvRegstretion.setOnClickListener{
            var  intent =Intent(this,Registretion::class.java)
            startActivity(intent)
            finish()
        }
        binding.textView3.setOnClickListener{
            var intent = Intent( this,forgitPosswrold::class.java)
            finish()
        }
    }
}