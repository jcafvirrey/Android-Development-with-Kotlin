package com.example.recyclerviewsuperheros.utils

import com.example.recyclerviewsuperheroclass.R
import com.example.recyclerviewsuperheroclass.model.SuperHero


class SuperHeroProvider {
    companion object{
        val superHeroList = listOf<SuperHero>(
            SuperHero(
                "Spiderman",
                "Marvel",
                "Peter Parker",
                R.drawable.spiderman
            ),
            SuperHero(
                "Daredevil",
                "Marvel",
                "Matthew Michael Murdock",
                R.drawable.daredevil
            ),
            SuperHero(
                "Batman",
                "DC",
                "Bruce Wayne",
                R.drawable.batman
            ),
            SuperHero(
                "Thor",
                "Marvel",
                "Thor Odinson",
                R.drawable.thor
            ),
            SuperHero(
                "Flash",
                "DC",
                "Jay Garrick",
                R.drawable.flash
            ),
            SuperHero(
                "Green Lantern",
                "DC",
                "Alan Scott",
                R.drawable.greenlantern
            ),
            SuperHero(
                "Wonder Woman",
                "DC",
                "Princess Diana",
                R.drawable.wonder_woman
            )
        )
    }
}