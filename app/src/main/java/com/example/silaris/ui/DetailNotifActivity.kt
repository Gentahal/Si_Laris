package com.example.silaris.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.silaris.data.Notif
import com.example.silaris.databinding.ActivityDetailNotifBinding

class DetailNotifActivity : AppCompatActivity() {
    private var _binding : ActivityDetailNotifBinding? = null
    private val binding get() = _binding as ActivityDetailNotifBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityDetailNotifBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        val pesan = intent.getParcelableExtra<Notif>(DATA_PESAN) as Notif

        binding.apply {
            tvPesan.text = pesan.notif
        }

        binding.ivDetail.setImageResource(pesan.gambar)
        binding.ib.setOnClickListener {
            finish()
        }

    }

    companion object{
        const val DATA_PESAN = "Pesan"
    }

}