package com.example.silaris.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.silaris.R
import com.example.silaris.databinding.ActivityDetailBinding

//class DetailActivity : AppCompatActivity() {
//
//    //view Binding
//    private lateinit var binding : ActivityDetailBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityDetailBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        setSupportActionBar(binding.toolbarDetail)
//
//        //untuk menampilkan tombol back
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//
//        val dataRecipes = intent.getParcelableExtra<Recipes>(RECIPES_DATA) as Recipes
//
//        Glide.with(this).load(dataRecipes.photo).into(binding.imgDetail)
//
//        binding.apply {
//            tvNameRecipeDetail.text = dataRecipes.name
//            tvCaloriesDetail.text = dataRecipes.calories
//            tvCarboDetail.text = dataRecipes.carbo
//            tvDescriptionDetail.text = dataRecipes.description
//            tvProteinDetail.text = dataRecipes.protein
//            tvIngredientsDetail.text = dataRecipes.ingredients
//            tvInstructionDetail.text = dataRecipes.instructions
//        }
//    }
//
//    companion object {
//        const val RECIPES_DATA = "recipes"
//    }
//
//    override fun onSupportNavigateUp(): Boolean {
//        onBackPressed()
//        return super.onSupportNavigateUp()
//    }
//}