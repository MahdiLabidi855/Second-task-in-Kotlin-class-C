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
            if (binding.inpFullNameRegestration.length()!=0 && binding.MailRegestretion.length()!=0
                && binding.phone.length()!=0 && binding.Possworld.length()!=0 &&
                binding.confPosswrold.length()!=0 && !binding.Possworld.equals(binding.confPosswrold)
                && binding.checkBox2.isChecked){
                var intent = Intent(this,Resturent::class.java)
                startActivity(intent)
                finish()
            }else{
                binding.textView4.text="One of input is empty"
            }

        }
        binding.textView5.setOnClickListener{
            var intent = Intent(this,login::class.java)
            startActivity(intent)
            finish()
        }
    }
}