package com.example.silaris.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.silaris.databinding.ActivityDetailBinding
import com.example.silaris.data.Baju

class DetailActivity : AppCompatActivity() {

    //view Binding
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //untuk menampilkan tombol back
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val dataBaju = intent.getParcelableExtra<Baju>(BAJU_DATA) as Baju

        binding.imgItem.setImageResource(dataBaju.gambar!!)
        binding.imgItemToko.setImageResource(dataBaju.gambarToko!!)
        binding.apply {
            textItemJudul.text = dataBaju.nama
            textItemDetail.text = dataBaju.detail
            textItemHarga.text = dataBaju.harga
            textItemToko.text = dataBaju.toko
        }
        binding.btnBackDetail.setOnClickListener {
            finish()
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
