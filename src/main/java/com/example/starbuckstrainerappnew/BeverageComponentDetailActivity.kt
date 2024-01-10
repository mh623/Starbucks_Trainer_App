package com.example.starbuckstrainerappnew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.starbuckstrainerappnew.databinding.ActivityBeverageComponentDetailBinding
import com.example.starbuckstrainerappnew.databinding.ActivityBeverageComponentRecipesBinding

class BeverageComponentDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBeverageComponentDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBeverageComponentDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val beverageComponentID = intent.getIntExtra(BEVERAGE_COMPONENT_EXTRA, -1)
        val beverageComponent = beverageComponentFromID(beverageComponentID)

        if(beverageComponent != null)
        {
            binding.beverageComponentImage.setImageResource(beverageComponent.beverageComponentImage)
            binding.beverageComponentName.text = beverageComponent.beverageComponentName
            binding.beverageComponentInstructions.setImageResource(beverageComponent.beverageComponentInstructions)
        }
    }

    private fun beverageComponentFromID(beverageComponentID: Int): BeverageComponent? {
        for(beverageComponent in beverageComponentList)
        {
            if(beverageComponent.id == beverageComponentID)
                return beverageComponent
        }
        return null
    }
}