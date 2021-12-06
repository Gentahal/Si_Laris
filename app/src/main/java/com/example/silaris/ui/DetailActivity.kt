package com.example.silaris.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import com.bumptech.glide.Glide
import com.example.silaris.MainActivity
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

        val btnBack: ImageButton = findViewById(R.id.btn_back_detail)
        btnBack.setOnClickListener(this)

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
    }

    override fun onClick(v: View?){
        when(v?.id){
            R.id.btn_back_detail -> {
                val moveIntent = Intent(this@DetailActivity,MainActivity::class.java)
                startActivity(moveIntent)
            }
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
