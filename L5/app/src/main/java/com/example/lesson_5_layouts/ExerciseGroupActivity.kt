package com.example.lesson_5_layouts

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.Group
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ExerciseGroupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_exercise_group)

        val dataGroup = findViewById<Group>(R.id.dataGroup)
        val toggleButton = findViewById<Button>(R.id.toggleButton)


        toggleButton.setOnClickListener {
            // Alternar la visibilidad del grupo
            dataGroup.visibility =
                if (dataGroup.visibility == View.VISIBLE)
                {
                    toggleButton.setText("Show Data")
                    View.GONE
                } else {
                    toggleButton.setText("Hide Data")
                    View.VISIBLE
                }
        }
    }
}