package com.example.cursogallegokotlin.firstApp.imccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.example.cursogallegokotlin.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import java.text.DecimalFormat

class ImcCalculatorActivity : AppCompatActivity() {

    private var isMaleSelected: Boolean = true
    private var isFemaleSelected: Boolean = false

    private lateinit var cardViewMale: CardView
    private lateinit var cardViewFemale: CardView
    private lateinit var textViewHeight: TextView
    private lateinit var rangeViewHeight: RangeSlider

    private lateinit var textViewWeight: TextView
    private lateinit var fabSubstractWeight: FloatingActionButton
    private lateinit var fabAddWeight: FloatingActionButton

    private lateinit var textViewAge: TextView
    private lateinit var fabSubstractAge: FloatingActionButton
    private lateinit var fabAddAge: FloatingActionButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_calculator)

        initComponents()
        initListeners()
        initUI()

    }

    private fun initComponents() {
        cardViewMale = findViewById(R.id.card_view_male)
        cardViewFemale = findViewById(R.id.card_view_female)
        textViewHeight = findViewById(R.id.text_view_height)
        rangeViewHeight = findViewById(R.id.range_slider_height)

        textViewWeight = findViewById(R.id.text_view_weight)
        fabSubstractWeight = findViewById(R.id.button_substract_weight)
        fabAddWeight = findViewById(R.id.button_add_weight)

        textViewAge = findViewById(R.id.text_view_age)
        fabSubstractAge = findViewById(R.id.button_substract_age)
        fabAddAge = findViewById(R.id.button_add_age)
    }

    private fun initListeners() {
        cardViewMale.setOnClickListener {
            changeGender()
            setGenderColor()
        }
        cardViewFemale.setOnClickListener {
            changeGender()
            setGenderColor()
        }
        rangeViewHeight.addOnChangeListener { _, value, _ ->
            val decimalFormat = DecimalFormat("#.##")
            val result = decimalFormat.format(value)
            textViewHeight.text = "$result cm"
        }
        fabSubstractWeight.setOnClickListener {

        }
        fabAddWeight.setOnClickListener { }

        fabSubstractAge.setOnClickListener { }
        fabAddAge.setOnClickListener { }
    }

    private fun changeGender() {
        isMaleSelected = !isMaleSelected
        isFemaleSelected = !isFemaleSelected
    }

    private fun setGenderColor() {
        cardViewMale.setCardBackgroundColor(getBackgroundColor((isMaleSelected)))
        cardViewFemale.setCardBackgroundColor(getBackgroundColor((isFemaleSelected)))
    }

    private fun getBackgroundColor(isSelectedComponent: Boolean): Int {
        val colorReference = if (isSelectedComponent) {
            R.color.background_component_selected
        } else {
            R.color.background_component
        }
        return ContextCompat.getColor(this, colorReference)
    }


    private fun initUI() {
        setGenderColor()

    }


}