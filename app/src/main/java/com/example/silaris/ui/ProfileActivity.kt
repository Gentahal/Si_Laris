package com.example.silaris.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import com.example.silaris.MainActivity
import com.example.silaris.R
import com.example.silaris.databinding.ActivityDetailBinding

class ProfileActivity : AppCompatActivity(), View.OnClickListener {

    private var _binding:ActivityDetailBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val btnBack: ImageButton = findViewById(R.id.btn_back)
        btnBack.setOnClickListener(this)
    }

    override fun onClick(v: View?){
        when(v?.id){
            R.id.btn_back -> {
                val moveIntent = Intent(this@ProfileActivity,MainActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}