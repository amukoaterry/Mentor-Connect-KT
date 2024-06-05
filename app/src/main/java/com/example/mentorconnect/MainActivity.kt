package com.example.mentorconnect

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mentorconnect.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView2.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        binding.button.setOnClickListener {
            validateRegistration()
        }

    }
    fun validateRegistration(){
        clearErrors()
        var formError = false
        val firstName = binding.etFirstName.text.toString()
        if (firstName.isBlank()){
            binding.tilFirstName.error = getString(R.string.first_name_is_required)
        }
        val lastName = binding.etLastName.text.toString()
        if (lastName.isBlank()){
            formError = true
            binding.tilLastName.error = getString(R.string.last_name_is_required)
        }
        val email= binding.etEmail.text.toString()
        if (email.isBlank()){
            formError = true
            binding.etEmail.error = getString(R.string.email_is_required)
        }
        val codehiveId = binding.etCodehiveId.text.toString()
        if (codehiveId.isBlank()){
            formError = true
            binding.tilCodehiveId.error = getString(R.string.codehive_id_is_required)
        }
        val Username = binding.etUserName.text.toString()
        if (Username.isBlank()){
            formError = true
            binding.tilUserName.error = getString(R.string.usernameis_required)
        }

        val Password = binding.etPassword.text.toString()
        if (Password.isBlank()){
            formError = true
            binding.tilPassword.error = getString(R.string.password_is_required)
        }

        val ConfirmPassword = binding.etConfirmPassword.text.toString()
        if (ConfirmPassword.isBlank()){
            formError = true
            binding.tilConfirmPassword.error =
                getString(R.string.password_and_confirmation_is_required)
        }

        if (Password!=ConfirmPassword){
            formError = true
            binding.tilConfirmPassword.error =
                getString(R.string.password_and_confirmation_do_not_match)
        }
        if (formError!=true){
            //proceed to registration
        }
    }

    fun clearErrors(){
        binding.tilFirstName.error = null
        binding.tilLastName.error = null
        binding.tilEmail.error = null
        binding.tilCodehiveId.error = null
        binding.tilUserName.error = null
        binding.tilPassword.error = null
        binding.tilConfirmPassword.error = null


    }
}