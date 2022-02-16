package com.example.silaris.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.silaris.data.ImageData
import com.example.silaris.R

class ImageAdapter(var context : Context) : RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    var dataList = emptyList<ImageData>()

    internal fun setDataList(dataList : List<ImageData>){
        this.dataList = dataList
    }

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        var img : ImageView
        var title : TextView
        var desc : TextView

        init {
            img = itemView.findViewById(R.id.img_item)
            title = itemView.findViewById(R.id.text_item_judul)
            desc = itemView.findViewById(R.id.text_item_harga)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.grid_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = dataList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var data = dataList[position]

        holder.title.text = data.title
        holder.desc.text = data.desc

        holder.img.setImageResource(data.img)
    }


}