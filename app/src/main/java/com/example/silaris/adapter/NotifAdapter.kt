package com.example.silaris.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.silaris.data.Notif
import com.example.silaris.databinding.GridItemBinding
import com.example.silaris.databinding.GridItemNotifBinding
import com.example.silaris.ui.DetailActivity

class NotifAdapter(private val listNotif: ArrayList<Notif>) :
    RecyclerView.Adapter<NotifAdapter.MyViewHolder>(){

    inner class MyViewHolder(val binding: GridItemNotifBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        GridItemNotifBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.apply {
            with(listNotif[position]) {
                textItemJudulNotif.text = notif
                textItemDetailNotif.text = desc
//                Glide.with(imgItemNotif.context).load(gambar).into(imgItemNotif)
                holder.itemView.setOnClickListener {
                    val intent = Intent(it.context, com.example.silaris.ui.DetailActivity::class.java)
                    intent.putExtra(com.example.silaris.ui.NotifFragment.NOTIF_DATA, listNotif[position])
                    it.context.startActivity(intent)
                }
            }
        }
    }

    override fun getItemCount(): Int = listNotif.size
}