package com.example.silaris


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.silaris.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity(){

    private lateinit var binding : ActivityMainBinding

    private lateinit var recyclerView: RecyclerView
    private lateinit var photoAdapter: ImageAdapter
    private var dataList = mutableListOf<ImageData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        var navView : BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)

        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home,
                R.id.navigation_notification,
                R.id.navigation_setting,
            )
        )

        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        recyclerView = findViewById(R.id.recycle_item)
        recyclerView.layoutManager = GridLayoutManager(applicationContext, 2)
        photoAdapter = ImageAdapter(applicationContext)
        recyclerView.adapter = photoAdapter

        dataList.add(ImageData("Baju Sweater Perempuan ", "Rp125.000", R.drawable.img_item1))
        dataList.add(ImageData("Title", "Desc", R.drawable.img_item2))
        dataList.add(ImageData("Title", "Desc", R.drawable.img_item3))
        dataList.add(ImageData("Kaos Putih Polos Oversize", "Rp250.000", R.drawable.img_item4))
        dataList.add(ImageData("Hoodie hitam bahan halus ORIGINAL", "Rp150.000", R.drawable.img_item5))

        photoAdapter.setDataList(dataList)

    }

}