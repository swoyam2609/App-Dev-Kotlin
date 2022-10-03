package com.example.agecalculator

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var btnDateClicked: Button
    private lateinit var btnRefresh: Button
    private var selectedDateDisplay : TextView? = null
    private var showYourDate : TextView? = null
    private var resultAge : TextView? = null
    private var time1: Long = 0
    private var time2: Long = 0
    private var radioGroup : RadioGroup? = null
    private lateinit var radioButton: RadioButton
    var divider = 1
    var unit = "Minutes"
    var age : Long = 0


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroup = findViewById(R.id.groupRadio)

        btnDateClicked = findViewById(R.id.buttonDatePicker)
        btnDateClicked.setOnClickListener {
            val myCalendar = Calendar.getInstance()
            val year = myCalendar.get(Calendar.YEAR)
            val month = myCalendar.get(Calendar.MONTH)
            val day = myCalendar.get(Calendar.DAY_OF_MONTH)



            Toast.makeText(this, "Select your BirthDay", Toast.LENGTH_SHORT).show()
            DatePickerDialog(this, { view, selectedYear, selectedMonth, selectedDay ->
                Toast.makeText(this, "Date : $selectedYear Month : ${selectedMonth+1} Day : $selectedDay", Toast.LENGTH_SHORT).show()
                val toShowText = "$selectedDay/${selectedMonth+1}/$selectedYear"
                selectedDateDisplay=findViewById(R.id.selectedDateDisplay)
                showYourDate = findViewById(R.id.showYourDate)
                selectedDateDisplay?.text=toShowText
                selectedDateDisplay?.textSize=55.0f
                showYourDate?.text="Your Birth Date is"
                val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)
                val thisDate = sdf.parse(toShowText)
                val currentDate = sdf.parse(sdf.format(System.currentTimeMillis()))
                divider = 1
                unit = "Minutes"

                val intSelectedButton = radioGroup!!.checkedRadioButtonId
                radioButton = findViewById(intSelectedButton)

                when (radioButton.text) {
                    "in Minutes" -> {
                        divider = 1
                        unit = "Minutes"
                    }
                    "in Years" -> {
                        divider = 525600
                        unit = "Years"
                    }
                    "in Months" -> {
                        unit="Months"
                        divider=43800
                    }
                    "in Days" -> {
                        unit = "Days"
                        divider = 1440
                    }
                    "in Hours" -> {
                        unit = "hours"
                        divider = 60
                    }
                }


                if (currentDate != null) {
                    time1 = currentDate.time / 60000
                }
                if (thisDate != null) {
                    time2 = thisDate.time / 60000
                }
                resultAge=findViewById(R.id.resultAge)
                age = time1 - time2
                resultAge?.text = "${age / divider} $unit"

            }, year, month, day).show()
        }

        btnRefresh=findViewById(R.id.refresh)
        btnRefresh.setOnClickListener {
            val intSelectedButton = radioGroup!!.checkedRadioButtonId
            radioButton = findViewById(intSelectedButton)

            when (radioButton.text) {
                "in Minutes" -> {
                    divider = 1
                    unit = "Minutes"
                }
                "in Years" -> {
                    divider = 525600
                    unit = "Years"
                }
                "in Months" -> {
                    unit="Months"
                    divider=43800
                }
                "in Days" -> {
                    unit = "Days"
                    divider = 1440
                }
                "in Hours" -> {
                    unit = "hours"
                    divider = 60
                }
            }

            resultAge=findViewById(R.id.resultAge)
            age = time1 - time2
            resultAge?.text = "${age / divider} $unit"
        }
    }

}