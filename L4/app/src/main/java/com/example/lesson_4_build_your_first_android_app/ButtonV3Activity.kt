package com.example.lesson_4_build_your_first_android_app

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ButtonV3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button_v3)
        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener{
            Toast.makeText(this,"Button3 clicked", Toast.LENGTH_LONG).show()
        }
        }
    }
