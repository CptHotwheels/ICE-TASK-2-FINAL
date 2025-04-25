package com.example.mycalculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() , View.OnClickListener {

    lateinit var addButton: Button
    lateinit var divButton: Button
    lateinit var multButton: Button
    lateinit var subButton: Button
    lateinit var firstNum: EditText
    lateinit var secondNum: EditText
    lateinit var tVAnswer: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addButton = findViewById(R.id.addButton)
        divButton = findViewById(R.id.divButton)
        multButton = findViewById(R.id.multButton)
        subButton = findViewById(R.id.subButton)
        firstNum = findViewById(R.id.firstNum)
        secondNum = findViewById(R.id.secondNum)
        tVAnswer = findViewById(R.id.tVAnswer)

        addButton.setOnClickListener(this)
        divButton.setOnClickListener(this)
        multButton.setOnClickListener(this)
        subButton.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        var firstNum = firstNum.text.toString().toDouble()
        var secondNum = secondNum.text.toString().toDouble()
        var answer = 0.0
        when(v?.id){
            R.id.addButton ->{
                answer = firstNum+secondNum
            }
            R.id.divButton ->{
                answer = firstNum/secondNum
            }
            R.id.multButton ->{
                answer = firstNum*secondNum
            }
            R.id.subButton ->{
                answer = firstNum-secondNum
            }
        }
        tVAnswer.text = "Answer is $answer"
        //Channel: Easy Tuto
        //URL: https://www.youtube.com/watch?v=XLt_moCoauw
    }
}