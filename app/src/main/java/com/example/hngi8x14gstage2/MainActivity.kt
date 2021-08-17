package com.example.hngi8x14gstage2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.hngi8x14gstage2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editTextOne = findViewById<EditText>(R.id.etOne)
        val textViewOne = findViewById<TextView>(R.id.tvOne)
        val btnOne = findViewById<Button>(R.id.btnOne)
        btnOne.setOnClickListener {
            val userContent = editTextOne.text.toString()
            textViewOne.text=userContent
        }
    }
}