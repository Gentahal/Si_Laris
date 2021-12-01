package com.example.silaris.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.silaris.data.Baju
import com.example.silaris.databinding.GridItemBinding
import com.example.silaris.ui.DetailActivity


class BajuAdapter(private val listBaju: ArrayList<Baju>) :
    RecyclerView.Adapter<BajuAdapter.MyViewHolder>() {

    inner class MyViewHolder(val binding: GridItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        GridItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.apply {
            with(listBaju[position]) {
                textItemJudul.text = nama
                textItemHarga.text = harga
                Glide.with(imgItem.context).load(gambar).into(imgItem)
                holder.itemView.setOnClickListener {
                    val intent = Intent(it.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.BAJU_DATA, listBaju[position])
                    it.context.startActivity(intent)
                }
            }
        }
    }

    override fun getItemCount(): Int = listBaju.size
}
