package com.example.moviedemo.auth

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.moviedemo.R
import com.example.moviedemo.databinding.ActivityForgetPaswordBinding

class ForgetPasword : AppCompatActivity() {
    private lateinit var binding: ActivityForgetPaswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityForgetPaswordBinding.inflate(layoutInflater)

        binding.btnForget.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
        }

        setContentView(binding.root)

    }
}