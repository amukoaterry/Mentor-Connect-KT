package com.example.mentorconnect

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val connectRegister = findViewById<TextView>(R.id.textView2)
            connectRegister.setOnClickListener{
                val intent = Intent(this,SecondActivity::class.java)
                startActivity(intent)
        }
    }
}