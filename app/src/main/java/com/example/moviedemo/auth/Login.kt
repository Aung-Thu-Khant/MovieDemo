package com.example.moviedemo.auth

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.moviedemo.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)

        binding.txtRegister.setOnClickListener {
            var intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }

        binding.lbForget.setOnClickListener {
            startActivity(Intent(this, ForgetPassword::class.java))
        }

        binding.btnSignIn.setOnClickListener {
            var email = binding.etEmail.text.toString()
            var password = binding.etPassword.text.toString()

            if(TextUtils.isEmpty(email)){
                binding.etEmail.error = "Email is required"
                binding.etEmail.requestFocus()
            }else if(TextUtils.isEmpty(password)){
                binding.etPassword.error = "Password is required"
                binding.etPassword.requestFocus()
            }else{
                Log.e("Login", "Email: $email, Password: $password")
            }


        }

        setContentView(binding.root)

    }
}