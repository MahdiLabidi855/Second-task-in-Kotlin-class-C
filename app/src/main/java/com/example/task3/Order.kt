package com.example.task3

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.task3.databinding.ActivityOrderBinding
import com.example.task3.databinding.ActivityResturentBinding

class Order : AppCompatActivity() {
    private lateinit var binding:ActivityOrderBinding
    private  lateinit var binding2: ActivityResturentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityOrderBinding.inflate(layoutInflater)
        binding2 = ActivityResturentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val S= binding2.textView7.text
        var b=binding2.textView14.text
        var p=binding2.textView12.text
        var c=binding2.textView8.text
        binding.tvorder.text="your order is \n" +
                ( if (b!="0"){
                    "$b Burger \n"
                }else {""})+
                (if(p!="0"){
                    "$p Pizza \n"
                }else{""})+
                ( if (c!="0"){
                    "$c Cola \n"
                }else {""})
        binding.Addb.setOnClickListener{
            var intent =Intent(this,Resturent::class.java)
            startActivity(intent)
            finish()
        }
        binding.confb.setOnClickListener{
            binding.tvorder.text="Your Order well delivery in 2 hours"
        }
    }
}