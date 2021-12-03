package com.example.silaris


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.silaris.databinding.ActivityMainBinding
import com.example.silaris.ui.DetailActivity
import com.example.silaris.ui.ProfileActivity
import com.example.silaris.ui.TrolliFragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        var navView : BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)

        val btnAboutActivity :ImageButton = findViewById(R.id.profile_btn)
        btnAboutActivity.setOnClickListener(this)


        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home,
                R.id.navigation_notification,
                R.id.navigation_setting,
            )
        )

        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.profile_btn -> {
                val moveIntent = Intent(this@MainActivity,ProfileActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }

}

