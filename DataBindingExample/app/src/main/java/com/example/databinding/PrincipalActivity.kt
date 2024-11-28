package com.example.databinding
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityPrincipalBinding

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_principal)
        val binding: ActivityPrincipalBinding = DataBindingUtil.setContentView(this, R.layout.activity_principal)
        binding.message = "Welcome Data Binding"
        binding.button.setOnClickListener{
            binding.message = "Button clicked"
        }
    }
    }
