package com.example.lesson_4_build_your_first_android_app

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ButtonV1Activity : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button_v1)

        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener(this)

        }

    override fun onClick(v: View?) {
        Toast.makeText(this,"Button1 clicked", Toast.LENGTH_LONG).show()
    }
}
