package com.example.silaris

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.GridLayout
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.silaris.ui.HomeFragment
import com.example.silaris.ui.TrolliFragment

class MainActivity : AppCompatActivity(){

    private lateinit var recyclerView: RecyclerView
    private lateinit var photoAdapter: ImageAdapter
    private var dataList = mutableListOf<ImageData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycle_item)
        recyclerView.layoutManager = GridLayoutManager(applicationContext, 2)
        photoAdapter = ImageAdapter(applicationContext)
        recyclerView.adapter = photoAdapter

        dataList.add(ImageData("Title", "Desc", R.drawable.img_item1))
        dataList.add(ImageData("Title", "Desc", R.drawable.img_item2))
        dataList.add(ImageData("Title", "Desc", R.drawable.img_item3))
        dataList.add(ImageData("Title", "Desc", R.drawable.img_item4))
        dataList.add(ImageData("Title", "Desc", R.drawable.img_item5))

        photoAdapter.setDataList(dataList)
    }

}