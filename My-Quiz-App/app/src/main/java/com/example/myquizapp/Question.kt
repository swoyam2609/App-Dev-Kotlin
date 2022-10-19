package com.example.myquizapp

data class Question(
    val id: Int,
    val question : String,
    val image : Int,
    val optionA : String,
    val optionB : String,
    val optionC : String,
    val optionD : String,
    val correctAnswer : Int
)


