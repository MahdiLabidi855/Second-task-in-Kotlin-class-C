package com.example.task3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isNotEmpty
import com.example.task3.databinding.ActivityRegistretionBinding

class Registretion : AppCompatActivity() {
    private lateinit var binding: ActivityRegistretionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityRegistretionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener{
            if (binding.textInputLayout.isNotEmpty() && binding.textInputLayout2.isNotEmpty() && binding.textInputLayout4.isNotEmpty()
                && binding.textInputLayout5.isNotEmpty() &&binding.textInputLayout6.isNotEmpty() && binding.textInputLayout5.editText==binding.textInputLayout6.editText
                && binding.checkBox2.isChecked){
                var intent = Intent(this,Resturent::class.java)
                startActivity(intent)
                finish()
            }else{
                binding.textView4.text="One of input is empty"
            }

        }
    }
}