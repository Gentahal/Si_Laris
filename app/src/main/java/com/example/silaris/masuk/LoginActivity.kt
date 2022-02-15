package com.example.silaris.masuk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.silaris.MainActivity
import com.example.silaris.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private var _binding: ActivityLoginBinding? = null
    private val binding get() = _binding as ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()


        binding.button.setOnClickListener {
            val username = binding.txtUsername
            val userpass = binding.txtPassword

            startActivity(Intent(applicationContext, MainActivity::class.java))
            finish()

//            if (username.text.toString().equals("admin") && userpass.text.toString().equals("admin")) {
//                startActivity(Intent(applicationContext, MainActivity::class.java))
//                finish()
//            }else {
//                Toast.makeText(applicationContext, "Waduh password kamu salah!!", Toast.LENGTH_LONG).show()
//            }
        }

        binding.signupTxt.setOnClickListener {
            startActivity(Intent(applicationContext, SignUpActivity::class.java))
        }

    }
}