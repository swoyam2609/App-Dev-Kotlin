package com.example.agecalculator

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var btnDateClicked: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnDateClicked = findViewById(R.id.buttonDatePicker)

        btnDateClicked.setOnClickListener {
            clickDatePicker()
        }
    }

    var selectedDateDisplay : TextView? = null
    var showYourDate : TextView? = null


    fun clickDatePicker(){
        var myCalendar = Calendar.getInstance()
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)
        Toast.makeText(this, "Select your BirthDay", Toast.LENGTH_SHORT).show()
        DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, selectedYear, selectedMonth, selectedDay ->
            Toast.makeText(this, "Date : $selectedYear Month : ${selectedMonth+1} Day : $selectedDay", Toast.LENGTH_SHORT).show()
            var toShowText = "$selectedDay/${selectedMonth+1}/$selectedYear"
            selectedDateDisplay=findViewById(R.id.selectedDateDisplay)

            selectedDateDisplay?.text=toShowText
            selectedDateDisplay?.textSize=55.0f
            showYourDate?.text="Your Birth Date is"

            val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)

            val thisDate = sdf.parse(toShowText)

        }, year, month, day).show()


    }

//    btnDateClicked : Button = findViewById(R.id.buttonDatePicker)

}