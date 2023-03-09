package com.example.magicbuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.magicbuttons.R

class MainActivity : AppCompatActivity() {
    lateinit var label :TextView
    lateinit var btnShow :Button
    lateinit var btnShow2 :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        label = findViewById(R.id.textView)
        btnShow = findViewById(R.id.button)
        btnShow2 = findViewById(R.id.button2)

        label.text = ""

        btnShow.setOnClickListener{
            label.text = "Hello World"
        }

        btnShow2.setOnClickListener{
            label.text = ""
        }
    }
}