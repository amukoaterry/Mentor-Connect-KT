package com.example.mentorconnect

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mentorconnect.databinding.ActivityMainBinding
import com.example.mentorconnect.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView4.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.button2.setOnClickListener {
            validateLogin()
        }
    }

    fun validateLogin() {
        clearErrors()
        var formError = false
        val UserName = binding.etSecUserName.text.toString()
        if (UserName.isBlank()) {
            binding.tilSecUserName.error = "Username is required"
        }

        val Password = binding.etSecPassword.text.toString()
        if (Password.isBlank()) {
            formError = true
            binding.tilSecPassword.error = "Password is required"

        }
    }

    fun clearErrors() {
        binding.tilSecUserName.error = null
        binding.tilSecPassword.error = null

    }
}