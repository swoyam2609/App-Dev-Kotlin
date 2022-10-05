package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var calculatorView : TextView? = null
    private var lastNum = false
    private var lastDot = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculatorView = findViewById(R.id.calculatorInput)
    }

    fun onButtonClick(view: View){
        calculatorView?.append((view as Button).text)
        lastNum = true
    }

    fun onClearClick(view: View){
        calculatorView?.text=""
        lastNum = false
        lastDot = false
    }

    fun onDecimalClick(view: View){
        if(lastNum && !lastDot){
            calculatorView?.append((view as Button).text)
            lastNum = false
            lastDot = true
        }
        else{
            Toast.makeText(this, "Invalid Operation", Toast.LENGTH_SHORT).show()
        }
    }
}