package com.example.myquizapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat

class QuizQuestionsActivity : AppCompatActivity() {

    private var progreassBar : ProgressBar? = null
    private var quizQuestion : TextView? = null
    private var quizQuestionImage : ImageView? = null
    private var progressBarCount : TextView? = null
    private var optionA : TextView? = null
    private var optionB : TextView? = null
    private var optionC : TextView? = null
    private var optionD : TextView? = null
    private var submitButton : Button? = null
    var selectedOption = 0


    @SuppressLint("LongLogTag")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)
        val questionsList = Constants.getQuestion()
        var currentQuestion = 0


        progreassBar = findViewById(R.id.quizProgressBar)
        quizQuestion = findViewById(R.id.quizQuestion)
        quizQuestionImage = findViewById(R.id.quizQuestionImage)
        progressBarCount = findViewById(R.id.quizProgressCount)
        optionA = findViewById(R.id.quizOptionA)
        optionB = findViewById(R.id.quizOptionB)
        optionC = findViewById(R.id.quizOptionC)
        optionD = findViewById(R.id.quizOptionD)
        submitButton = findViewById(R.id.nextButton)



        setQuestion(questionsList[currentQuestion], currentQuestion)

        submitButton?.setOnClickListener {
            if(selectedOption==questionsList[currentQuestion].correctAnswer){
                Constants.increaseCorrect()
            }
            selectedOption=0
            currentQuestion++
            if(currentQuestion==7){
                val intent = Intent(this, ResultsActivity::class.java)
                startActivity(intent)
                finish()
            }
            else{
                setQuestion(questionsList[currentQuestion], currentQuestion)
                optionA?.background = getDrawable(R.drawable.default_option_background)
                optionB?.background = getDrawable(R.drawable.default_option_background)
                optionC?.background = getDrawable(R.drawable.default_option_background)
                optionD?.background = getDrawable(R.drawable.default_option_background)
            }
        }

        optionA?.setOnClickListener {
            selectedOption = 1
            optionA?.background = getDrawable(R.drawable.selected_option_background)
            optionB?.background = getDrawable(R.drawable.default_option_background)
            optionC?.background = getDrawable(R.drawable.default_option_background)
            optionD?.background = getDrawable(R.drawable.default_option_background)
        }
        optionB?.setOnClickListener {
            selectedOption = 2
            optionB?.background = getDrawable(R.drawable.selected_option_background)
            optionA?.background = getDrawable(R.drawable.default_option_background)
            optionC?.background = getDrawable(R.drawable.default_option_background)
            optionD?.background = getDrawable(R.drawable.default_option_background)
        }
        optionC?.setOnClickListener {
            selectedOption = 3
            optionC?.background = getDrawable(R.drawable.selected_option_background)
            optionB?.background = getDrawable(R.drawable.default_option_background)
            optionA?.background = getDrawable(R.drawable.default_option_background)
            optionD?.background = getDrawable(R.drawable.default_option_background)
        }
        optionD?.setOnClickListener {
            selectedOption = 4
            optionD?.background = getDrawable(R.drawable.selected_option_background)
            optionB?.background = getDrawable(R.drawable.default_option_background)
            optionC?.background = getDrawable(R.drawable.default_option_background)
            optionA?.background = getDrawable(R.drawable.default_option_background)
        }

    }

    fun setQuestion(Que : Question, queNumber : Int){
        progreassBar?.progress=queNumber+1
        quizQuestion?.text=Que.question
        quizQuestionImage?.setImageResource(Que.image)
        progressBarCount?.text="${queNumber+1}/${progreassBar?.max}"
        optionA?.text=Que.optionA
        optionB?.text=Que.optionB
        optionC?.text=Que.optionC
        optionD?.text=Que.optionD
    }

}