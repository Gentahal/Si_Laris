package com.example.silaris.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.silaris.R

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }

    companion object {
        const val BAJU_DATA = "Baju"
    }
}