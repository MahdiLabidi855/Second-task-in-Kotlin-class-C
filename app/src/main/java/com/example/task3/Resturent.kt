package com.example.task3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.task3.databinding.ActivityResturentBinding

class Resturent : AppCompatActivity() {
    private lateinit var binding: ActivityResturentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResturentBinding.inflate(layoutInflater)

        setContentView(binding.root)
        var bt1 =0
        var S:Int
        var S1 =0
        var S2 =0
        var S3 =0
        var bt2=0
        var t1=0
        binding.imageView16.setOnClickListener{
            bt1++
            t1=bt1-bt2
            S1=t1 *3
            S=S1+S2+S3
            binding.textView14.text ="$t1"
            binding.textView7.text="Total : " + "$S"
            binding.order.text="Total : " + "$S"
        }
        binding.imageView17.setOnClickListener{
            if(t1>0) {
                bt2++
                t1 = bt1 - bt2
                S1 = t1 * 3
                S=S1+S2+S3
                binding.textView14.text = "$t1"
                binding.textView7.text = "Total : " + "$S"
                binding.order.text="Total : " + "$S"
            }
        }
        var bt3 =0
        var bt4=0
        var t2=0
        binding.imageView13.setOnClickListener{
            bt3++
            t2=bt3-bt4
            S2=t2*5
            S=S1+S2+S3
            binding.textView12.text ="$t2"
            binding.textView7.text="Total : " + "$S"
            binding.order.text="Total : " + "$S"
        }
        binding.imageView14.setOnClickListener{
            if(t2>0) {
                bt4++
                t2 = bt3 - bt4
                S2 = t2 * 5
                S=S1+S2+S3
                binding.textView12.text = "$t2"
                binding.textView7.text = "Total : " + "$S"
                binding.order.text="Total : " + "$S"
            }
        }
        var bt5=0
        var bt6=0
        var t3=0
        binding.imageView7.setOnClickListener{
            bt5++
            t3=bt5-bt6
            S3=t3*1
            S=S1+S2+S3
            binding.textView8.text ="$t3"
            binding.textView7.text="Total : " + "$S"
            binding.order.text="Total : " + "$S"
        }
        binding.imageView8.setOnClickListener{
            if(t3>0) {
                bt6++
                t3 = bt5 - bt6
                S3 = t3 * 1
                S=S1+S2+S3
                binding.textView8.text = "$t3"
                binding.textView7.text = "Total : " + "$S"
                binding.order.text="Total : " + "$S"
            }
        }
        binding.border.setOnClickListener{


            binding.tvorder.text="your order is \n" +
                    ( if (t1!=0){
                        "$t1 Burger \n"
                    }else {""})+
                    (if(t2!=0){
                        "$t2 Pizza \n"
                    }else{""})+
                    ( if (t3!=0){
                        "$t3 Cola \n"
                    }else {""})

        }
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