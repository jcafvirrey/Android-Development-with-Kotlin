package com.example.lesson_4_build_your_first_android_app

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LayoutInflaterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_inflater)

        // Get the LinearLayout where the views will be added
        val container: LinearLayout = findViewById(R.id.container)

        // Get the LayoutInflater
        val inflater = LayoutInflater.from(this)

        // Inflate custom layout
        val itemView = inflater.inflate(R.layout.my_item, container, false)

        // Modify content dynamically
        val textView: TextView = itemView.findViewById(R.id.textView)
        textView.text = "Dynamically added view"

        // Add the view to the container
        container.addView(itemView)

        }
    }
