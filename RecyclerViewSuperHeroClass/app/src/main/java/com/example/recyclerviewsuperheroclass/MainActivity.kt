package com.example.recyclerviewsuperheroclass

import android.icu.text.Transliterator.Position
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewsuperheroclass.adapter.SuperHeroAdapter
import com.example.recyclerviewsuperheroclass.databinding.ActivityMainBinding
import com.example.recyclerviewsuperheroclass.model.SuperHero
import com.example.recyclerviewsuperheros.utils.SuperHeroProvider

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: SuperHeroAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
        }
    fun onItemSelected(superHero: SuperHero){
        Toast.makeText(this,superHero.SuperHeroRealName,
            Toast.LENGTH_LONG).show()
    }
    private fun initRecyclerView(){
        //val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewSuperHero)
        //recyclerView.layoutManager = LinearLayoutManager(this)
        //recyclerView.adapter = SuperHeroAdapter(SuperHeroProvider.superHeroList)
        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this,manager.orientation)
        adapter = SuperHeroAdapter(SuperHeroProvider.superHeroList)
        {superHero->onItemSelected(superHero)}
        binding.recyclerViewSuperHero.layoutManager = manager
        binding.recyclerViewSuperHero.adapter = adapter
        binding.recyclerViewSuperHero.addItemDecoration(decoration)


    }
    }
