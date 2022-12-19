package com.example.logging

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }


        val some_text: EditText = findViewById(R.id.some_text)
        val button_timber: Button = findViewById(R.id.button_timber)
        val button_log: Button = findViewById(R.id.button_log)

        button_log.setOnClickListener {
            Log.v("From EditText", some_text.text.toString())
        }

        button_timber.setOnClickListener{
            Timber.v(some_text.text.toString())
        }
    }
}