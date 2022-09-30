package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClickMe = findViewById<Button>(R.id.myButton)
//        buttonClickMe.text = "Haha"
        var count=0
        buttonClickMe.setOnClickListener {
//            buttonClickMe.text = "Hey! You clicked me"
            val textName=findViewById<TextView>(R.id.nameText)
            count++
            textName.text="Hey Swoyam\nYou Clicked me $count number of times"
            Toast.makeText(this, "Hey, Click no. $count", Toast.LENGTH_SHORT).show()
        }
    }
}
