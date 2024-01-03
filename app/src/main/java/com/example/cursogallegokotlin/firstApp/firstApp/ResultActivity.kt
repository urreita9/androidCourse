package com.example.cursogallegokotlin.firstApp.firstApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.cursogallegokotlin.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val nameTextView = findViewById<TextView>(R.id.result_name_text_view)
        val intentText = intent.extras?.getString("FIRST_NAME").orEmpty()
        nameTextView.text= "Hola $intentText"
    }
}