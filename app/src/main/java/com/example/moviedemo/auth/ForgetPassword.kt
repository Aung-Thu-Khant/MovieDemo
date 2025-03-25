package com.example.moviedemo.auth

import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.moviedemo.databinding.ActivityForgetPaswordBinding

class ForgetPassword : AppCompatActivity() {
    private lateinit var binding: ActivityForgetPaswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityForgetPaswordBinding.inflate(layoutInflater)

        binding.btnForget.setOnClickListener {
            var email = binding.etForgetPassword.text.toString()
            if(TextUtils.isEmpty(email)){
                binding.etForgetPassword.error = "Email is required"
                binding.etForgetPassword.requestFocus()
            }else{
                Log.e("ForgetPassword", "Email: $email")
            }
        }


        setContentView(binding.root)

    }
}