package com.example.silaris.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.silaris.R
import com.example.silaris.data.Baju
import com.example.silaris.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    //view Binding
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //untuk menampilkan tombol back
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_24)

        val dataBaju = intent.getParcelableExtra<Baju>(BAJU_DATA) as Baju

        binding.imgItem.setImageResource(dataBaju.gambar!!)
        binding.imgItemToko.setImageResource(dataBaju.gambarToko!!)
        binding.apply {
            textItemJudul.text = dataBaju.nama
            textItemDetail.text = dataBaju.detail
            textItemHarga.text = dataBaju.harga
            textItemToko.text = dataBaju.toko
        }
    }

    companion object {
        const val BAJU_DATA = "Baju"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}