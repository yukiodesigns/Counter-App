package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)
        val result = findViewById<TextView>(R.id.resultText)

        btn.setOnClickListener(){
            result.setText(""+increaseCounter())
        }
    }
    fun increaseCounter():Int{
        counter++
        return counter
    }
}