package com.example.hngi8x14gstage2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.hngi8x14gstage2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //Calling upon the binding class
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //the binding class will now provide us with the views
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnOne.setOnClickListener {
                val userContent = etOne.text.toString()
                tvOne.text=userContent
            }
        }
    }
}