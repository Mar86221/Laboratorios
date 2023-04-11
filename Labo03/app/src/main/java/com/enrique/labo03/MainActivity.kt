package com.enrique.labo03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var five: ImageView
    private lateinit var ten: ImageView
    private lateinit var quarter: ImageView
    private lateinit var dollar: ImageView
    private lateinit var Amount: TextView

    private var tot = 0.00
    //private var totround = 0.00

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind()

        addListener()

    }
    
    private fun bind () {
        five = findViewById(R.id.Moneda5)
        ten = findViewById(R.id.Moneda10)
        quarter = findViewById(R.id.Moneda25)
        dollar = findViewById(R.id.Moneda1)
        Amount = findViewById(R.id.MontoTotal)


    }

    private fun addListener(){
        five.setOnClickListener {
            tot += 0.05
            val totround = String.format("%.2f", tot)
            Amount.text = totround.toString()
        }
        ten.setOnClickListener {
            tot += 0.10
            val totround = String.format("%.2f", tot)
            Amount.text = totround.toString()
        }
        quarter.setOnClickListener {
            tot += 0.25
            val totround = String.format("%.2f", tot)
            Amount.text = totround.toString()
        }
        dollar.setOnClickListener {
            tot += 1.00
            val totround = String.format("%.2f", tot)
            Amount.text = totround.toString()
        }
    }
    
}