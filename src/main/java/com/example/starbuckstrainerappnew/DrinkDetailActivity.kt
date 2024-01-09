package com.example.starbuckstrainerappnew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.starbuckstrainerappnew.databinding.ActivityDrinkDetailBinding

class DrinkDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDrinkDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDrinkDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val drinkID = intent.getIntExtra(DRINK_EXTRA, -1)
        val drink = drinkFromID(drinkID)

        if(drink != null)
        {
            binding.drinkImage.setImageResource(drink.drinkImage)
            binding.drinkName.text = drink.drinkName
            binding.drinkInstructions.setImageResource(drink.drinkInstructions)
        }
    }
    private fun drinkFromID(drinkID: Int): Drink?
    {
        for(drink in drinkList)
        {
            if(drink.id == drinkID)
                return drink
        }
        return null
    }
}