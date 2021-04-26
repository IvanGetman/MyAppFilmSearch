package com.getman.myappfilmsearch

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloText = findViewById<TextView>(R.id.hello_text)
        val button = findViewById<Button>(R.id.button_text)
        val helloWorld = ExampleDataClass( "Привет")
        button.setOnClickListener { helloText.text = helloWorld.toString() }
    }
}