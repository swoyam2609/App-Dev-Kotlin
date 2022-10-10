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
    private var lastOperator = false
    private var lastEqual = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculatorView = findViewById(R.id.calculatorInput)
    }

    fun onButtonClick(view: View){
        if(lastEqual){
            calculatorView?.text=""
            lastNum = false
            lastDot = false
            lastOperator = false
            lastEqual = false
        }
        calculatorView?.append((view as Button).text)
        lastNum = true
        lastOperator = false
    }

    fun onClearClick(view: View){
        calculatorView?.text=""
        lastNum = false
        lastDot = false
        lastOperator = false
    }

    fun onDecimalClick(view: View){
        if(lastEqual){
            calculatorView?.text=""
            lastNum = false
            lastDot = false
            lastOperator = false
            lastEqual = false
        }
        if(lastNum && !lastDot){
            calculatorView?.append((view as Button).text)
            lastNum = false
            lastOperator = false
            lastDot = true
        }
        else{
            Toast.makeText(this, "Invalid Operation", Toast.LENGTH_SHORT).show()
        }
    }

    fun onOperatorClick(view: View){
        if(calculatorView?.text?.contentEquals("") == true && (view as Button).text.contentEquals("-")){
            calculatorView?.append((view as Button).text)
            lastNum=false
            lastDot=false
            lastOperator=true
        }
        else if(!lastOperator && lastNum){
            if(lastEqual){
                calculatorView?.text=""
                lastNum = false
                lastDot = false
                lastOperator = false
                lastEqual = false
            }
            calculatorView?.append((view as Button).text)
            lastNum=false
            lastDot=false
            lastOperator=true
        }
        else{
            Toast.makeText(this, "Invalid Operation", Toast.LENGTH_SHORT).show()
        }
    }

    fun onClickEqual(view: View){
        if(lastNum){
            var textViewInput = calculatorView?.text.toString()
            try{
                var negetiveStart = false
                if (textViewInput[0]=='-'){
                    textViewInput=textViewInput.substring(1)
                    negetiveStart = true
                }
                var resultArray = textViewInput?.split("/","X","-","+")
                var one = resultArray?.get(0)?.toDouble()
                if (negetiveStart){
                    one = -1* one!!
                }
                var two = resultArray?.get(1)?.toDouble()
                if(textViewInput?.contains("-") == true){
                    if (one != null) {
                        if (two != null) {
                            calculatorView?.text = (one-two).toString()
                        }
                    }
                }
                else if(textViewInput?.contains("/") == true){
                    if (one != null) {
                        if (two != null) {
                            calculatorView?.text = (one.toDouble()/two.toDouble()).toString()
                        }
                    }
                }
                else if(textViewInput?.contains("X") == true){
                    if (one != null) {
                        if (two != null) {
                            calculatorView?.text = (one.toDouble()*two.toDouble()).toString()
                        }
                    }
                }
                else if(textViewInput?.contains("+") == true){
                    if (one != null) {
                        if (two != null) {
                            calculatorView?.text = (one.toDouble()+two.toDouble()).toString()
                        }
                    }
                }
                lastEqual = true
            }
            catch (e: ArithmeticException){
                e.printStackTrace()
            }
        }
    }
}