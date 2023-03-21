package com.example.laboratorio02

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*


class MainActivity : AppCompatActivity() {

    //UI
    lateinit var resultText: TextView
    lateinit var displayWeight: EditText
    lateinit var displayHeight: EditText
    lateinit var calculateButton: Button
    lateinit var statusText: TextView
    lateinit var sugestText: TextView

    private var results = 0.0
    private var ibmround = 0.0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()
        setListener()

}

    private fun setListener() {
        calculateButton.setOnClickListener{
            val weight = displayWeight.text.toString().toString()
            val height = displayHeight.text.toString().toString()

            if (!validate(weight, height)){
                return@setOnClickListener
            }

            val bmi = calculate(weight.toFloat(), height.toFloat())
            Log.d("IKNIN", bmi.toString())
            val bmiTwo = String.format("%.2f",bmi).toFloat()
            displayResult(bmiTwo)
        }
    }


    private fun calculate(weight: Float, height: Float): Float {
        results = weight.toDouble()/Math.pow(height/100.toDouble(),2.0)
        ibmround = (Math.round((results*100.0)/100.0).toDouble())
        return ibmround.toFloat()
    }
    private fun validate(weightS: String, heightS: String): Boolean {
        when {
            weightS.isNullOrEmpty() -> {
                Toast.makeText(this, "Weight is empety", Toast.LENGTH_SHORT).show()
                return false
            }
            heightS.isNullOrEmpty() -> {
                Toast.makeText(this, "Height is empety", Toast.LENGTH_SHORT).show()
                return false
            }
        }
        return true

    }


    private fun displayResult(bmi:Float) {
        resultText.text = bmi.toString()

        when {
            bmi <= 18.5 -> {

                resultText.text = "" + (ibmround) + ""
                statusText.text = "Underweight"
                statusText.setTextColor(Color.parseColor("#37BEFD"))
                sugestText.text = "Normal range is 18.5-24.9"
            }
            bmi in 18.5..24.99 -> {
                resultText.text = "" + ibmround + ""
                statusText.text = "Healthy"
                sugestText.text = "Normal range is 18.5-24.9"
                statusText.setTextColor(Color.parseColor("#10A308"))
            }
            bmi in 25.0..29.99 -> {
                resultText.text = "" + ibmround + ""
                statusText.text = "Overweight"
                sugestText.text = "Normal range is 18.5-24.9"
                statusText.setTextColor(Color.parseColor("#FF9800"))
            }
            bmi >= 30 -> {
                resultText.text = "" + ibmround + ""
                statusText.text = "Obese"
                sugestText.text = "Normal range is 18.5-24.9"
                statusText.setTextColor(Color.parseColor("#FF5722"))
            }


        }
    }


    private fun bind() {
        displayWeight = findViewById(R.id.edit_text_weight)
        displayHeight = findViewById(R.id.edit_text_height)
        calculateButton = findViewById(R.id.button_calculate)
        resultText = findViewById(R.id.text_view_ibm)
        statusText = findViewById(R.id.text_view_status)
        sugestText = findViewById(R.id.text_view_sugest)
    }
}