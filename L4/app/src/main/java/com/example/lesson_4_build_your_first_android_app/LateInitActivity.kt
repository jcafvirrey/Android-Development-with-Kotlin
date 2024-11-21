package com.example.lesson_4_build_your_first_android_app

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LateInitActivity : AppCompatActivity() {
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_late_init)
        button = findViewById(R.id.my_button) // Late initialization
        button.setOnClickListener {
            showToast()
        }
    }
    fun showToast(){
        Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show()
    }
}
