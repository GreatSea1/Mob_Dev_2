package com.example.attributes2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val size24Button: Button = findViewById(R.id.buttonSize24)
        val redTextButton: Button = findViewById(R.id.buttonRedText)
        val blackTextButton: Button = findViewById(R.id.buttonBlackText)
        val size8Button: Button = findViewById(R.id.buttonSize8)
        val whiteBackgroundButton: Button = findViewById(R.id.buttonWhiteBackground)
        val yellowBackgroundButton: Button = findViewById(R.id.buttonYellowBackground)
        val editOutText: EditText = findViewById(R.id.editText)

        size24Button.setOnClickListener {
            editOutText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24F)
        }
        size8Button.setOnClickListener{
            editOutText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 8F)
        }
        redTextButton.setOnClickListener {
            editOutText.setTextColor(Color.RED)
        }
        blackTextButton.setOnClickListener {
            editOutText.setTextColor(Color.BLACK)
        }
        whiteBackgroundButton.setOnClickListener {
            editOutText.setBackgroundColor(Color.WHITE)
        }
        yellowBackgroundButton.setOnClickListener {
            editOutText.setBackgroundColor(Color.YELLOW)
        }
    }
}