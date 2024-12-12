package com.example.recyclerviewsuperheroclass.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewsuperheroclass.R
import com.example.recyclerviewsuperheroclass.model.SuperHero

class SuperHeroAdapter(val superHeroList: List<SuperHero>,
    private val onItemClick: (SuperHero)->Unit,
    )
    : RecyclerView.Adapter<SuperHeroViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view: View = layoutInflater.inflate(
            R.layout.superhero_item_view,
            parent,
            false
        )
        return SuperHeroViewHolder(view)
    }

    override fun getItemCount(): Int {
        return superHeroList.size
    }

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        val item = superHeroList[position]
        holder.render(item)
        holder.itemView.setOnClickListener { onItemClick(item) }
    }
}