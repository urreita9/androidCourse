package com.example.cursogallegokotlin.firstApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cursogallegokotlin.R
import com.example.cursogallegokotlin.firstApp.firstApp.FirstAppActivity
import com.example.cursogallegokotlin.firstApp.imccalculator.ImcCalculatorActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSaludAppBtn = findViewById<Button>(R.id.main_activity_button_saludapp)
        val btnIMCAppBtn = findViewById<Button>(R.id.main_activity_button_imcApp)

        val saludAppIntent = Intent(this, FirstAppActivity::class.java)
        val imcAppIntent = Intent(this, ImcCalculatorActivity::class.java)

        btnSaludAppBtn.setOnClickListener {
            navigateTo(saludAppIntent)
        }

        btnIMCAppBtn.setOnClickListener { navigateTo(imcAppIntent) }

    }

    private fun navigateTo(intent: Intent) {
        startActivity(intent)
    }
}