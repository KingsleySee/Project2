package com.example.project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import com.example.project2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = setContentView(this, R.layout.activity_main)

        var student = Student("Ali", "RIT", 20)

        binding.btnSetValue.setOnClickListener(){
            student.age = 28

            binding.apply{
                invalidateAll()
            }
        }

        binding.btnSetValue.setOnClickListener(){
            binding.myData = student
        }


    }
}