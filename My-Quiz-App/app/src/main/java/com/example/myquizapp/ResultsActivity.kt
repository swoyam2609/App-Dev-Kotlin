package com.example.myquizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultsActivity : AppCompatActivity() {
    private var outputText : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        outputText = findViewById(R.id.outputText)
        val userName = Constants.userName
        val correctAnswers = Constants.correctQuestion
        outputText?.text="Congratulations $userName\nYou've scored $correctAnswers/7"
    }
}