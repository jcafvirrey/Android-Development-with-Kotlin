package com.example.recyclerviewsuperheroclass.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewsuperheroclass.R
import com.example.recyclerviewsuperheroclass.databinding.SuperheroItemViewBinding
import com.example.recyclerviewsuperheroclass.model.SuperHero

class SuperHeroViewHolder (view: View): RecyclerView.ViewHolder(view){


    //val superHeroName = view.findViewById<TextView>(R.id.textViewSuperHeroName)
    //val superHeroProvider = view.findViewById<TextView>(R.id.textViewSuperHeroProvider)
    //val superHeroRealName = view.findViewById<TextView>(R.id.textViewSuperHeroRealName)
    //val superHeroPhoto = view.findViewById<ImageView>(R.id.imageViewSuperHero)
    val binding = SuperheroItemViewBinding.bind(view)
    fun render(superHeroModel: SuperHero){
        binding.textViewSuperHeroName.text= superHeroModel.SuperHeroName
        binding.textViewSuperHeroProvider.text = superHeroModel.SuperHeroProvider
        binding.textViewSuperHeroRealName.text = superHeroModel.SuperHeroRealName
        binding.imageViewSuperHero.setImageResource(superHeroModel.SuperHeroPhoto)

    }
}

