package com.example.silaris.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.silaris.R
import com.example.silaris.adapter.BajuAdapter
import com.example.silaris.data.Baju
import com.example.silaris.data.DataBaju
import com.example.silaris.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    //view Binding
    private lateinit var binding : ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarDetail)

        //untuk menampilkan tombol back
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val dataBaju = intent.getParcelableExtra<Baju>(BAJU_DATA) as Baju

        Glide.with(this).load(dataBaju.gambar).into(binding.imgItem)

        binding.apply {
            textItemDetail.text = dataBaju.detail
            textItemJudul.text = dataBaju.nama
            textItemHarga.text = dataBaju.harga
        }
    }

    companion object {
        const val BAJU_DATA = "recipes"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}