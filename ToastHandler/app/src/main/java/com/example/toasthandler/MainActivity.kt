package com.example.toasthandler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button_ok)
        button.setOnClickListener {
            val toast = Toast.makeText(applicationContext, "Кнопка ОК", Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}