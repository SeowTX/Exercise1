package com.example.exercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener(){
            carLoan()
            interest()
            monPayment()
        }
    }

    /*fun carLoan(){
        if(inputIsNotEmpty()) {
            val input1 = editTextCarPrice.text.toString().trim().toBigInteger()
            val input2 = editTextDownPayment.text.toString().trim().toBigInteger()
            textViewLoan.text = input1.subtract(input2).toString()
        }
    }*/

    fun carLoan(){
        if(inputIsNotEmpty()) {
            var input1 = findViewById<View>(R.id.editTextCarPrice) as EditText
            var input2 = findViewById<View>(R.id.editTextDownPayment) as EditText
            var result1 = findViewById<View>(R.id.textViewLoan) as TextView
            //var button1 = findViewById<View>(R.id.buttonCalculate) as Button

            result1.text= (input1.text.toString().toInt()-input2.text.toString().toInt()).toString()

        }
    }

    fun interest(){
        if(inputIsNotEmpty()) {
            //var input1 = findViewById<View>(R.id.editTextCarPrice) as EditText
            //var input2 = findViewById<View>(R.id.editTextDownPayment) as EditText
            var input3 = findViewById<View>(R.id.editTextInterestRate) as EditText
            var input4 = findViewById<View>(R.id.editTextLoanPeriod) as EditText
            var result1 = findViewById<View>(R.id.textViewLoan) as TextView
            var result2 = findViewById<View>(R.id.textViewInterest) as TextView
            //var button1 = findViewById<View>(R.id.buttonCalculate) as Button

            result2.text= (result1.text.toString().toInt()*input3.text.toString().toInt()*input4.text.toString().toInt()).toString()

        }
    }

    fun monPayment(){
        if(inputIsNotEmpty()) {
            //var input1 = findViewById<View>(R.id.editTextCarPrice) as EditText
            //var input2 = findViewById<View>(R.id.editTextDownPayment) as EditText
            //var input3 = findViewById<View>(R.id.editTextInterestRate) as EditText
            var input4 = findViewById<View>(R.id.editTextLoanPeriod) as EditText
            var result1 = findViewById<View>(R.id.textViewLoan) as TextView
            var result2 = findViewById<View>(R.id.textViewInterest) as TextView
            var result3 = findViewById<View>(R.id.textViewMonthlyRepayment) as TextView
            //var button1 = findViewById<View>(R.id.buttonCalculate) as Button

            result3.text= ((result1.text.toString().toInt()+result2.text.toString().toInt())/input4.text.toString().toInt()/12).toString()

        }
    }





    fun inputIsNotEmpty() :Boolean {
        var a = true
        if(editTextCarPrice.text.toString().trim().isEmpty()){
            editTextCarPrice.error = "Required"
            a = false
        }
        if(editTextDownPayment.text.toString().trim().isEmpty()){
            editTextDownPayment.error = "Required"
            a = false
        }
        if(editTextInterestRate.text.toString().trim().isEmpty()){
            editTextInterestRate.error = "Required"
            a = false
        }
        if(editTextLoanPeriod.text.toString().trim().isEmpty()){
            editTextLoanPeriod.error = "Required"
            a = false
        }
        return a
    }
}
