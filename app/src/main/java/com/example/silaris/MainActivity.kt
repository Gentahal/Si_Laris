package com.example.silaris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.silaris.ui.HomeFragment
import com.example.silaris.ui.ProfileFragment

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.profile_btn)
        btnMoveActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.navigation_home -> {
                val moveIntent = Intent(this@MainActivity, ProfileFragment::class.java)
                startActivity(moveIntent)
            }
        }
    }
}