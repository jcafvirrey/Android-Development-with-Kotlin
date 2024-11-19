package com.example.lesson_4_build_your_first_android_app

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ButtonV2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button_v2)

        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@ButtonV2Activity,"Button2 clicked", Toast.LENGTH_LONG).show()
            }

        })

        }
    }
