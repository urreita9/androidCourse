package com.example.cursogallegokotlin.firstApp.firstApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.example.cursogallegokotlin.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)

        val mainBtn = findViewById<AppCompatButton>(R.id.main_btn)
        val firstName = findViewById<AppCompatEditText>(R.id.edit_text_name)

        mainBtn.setOnClickListener {
            val firstNameText=firstName.text.toString()

            if(firstNameText.isNotEmpty()){
               val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("FIRST_NAME", firstNameText)
                startActivity(intent)
            }

        }
    }
}