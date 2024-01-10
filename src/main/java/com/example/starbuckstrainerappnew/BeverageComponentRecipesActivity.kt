package com.example.starbuckstrainerappnew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.starbuckstrainerappnew.databinding.ActivityBeverageComponentRecipesBinding
import com.example.starbuckstrainerappnew.databinding.ActivityMainBinding

class BeverageComponentRecipesActivity : AppCompatActivity(), BeverageComponentClickListener {
    private lateinit var binding: ActivityBeverageComponentRecipesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBeverageComponentRecipesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateBeverageComponents()

        val beverageComponentRecipesActivity = this
        binding.beverageComponentRecipesRecycleView.apply{
            layoutManager = GridLayoutManager(applicationContext, 3)
            adapter = BeverageComponentCardAdapter(beverageComponentList, beverageComponentRecipesActivity)
        }

    }

    override fun onClick(beverageComponent: BeverageComponent) {
        val intent = Intent(applicationContext, BeverageComponentDetailActivity::class.java)
        intent.putExtra(BEVERAGE_COMPONENT_EXTRA, beverageComponent.id)
        startActivity(intent)
    }

    private fun populateBeverageComponents()
    {
        val beverageComponent1 = BeverageComponent(
            R.drawable.ice_coffee,
            "Ice Coffee",
            R.drawable.ice_coffee_instructions
        )
        beverageComponentList.add(beverageComponent1)

        val beverageComponent2 = BeverageComponent(
            R.drawable.cold_brew_toddy,
            "Cold Brew (Toddy)",
            R.drawable.cold_brew_toddy_instructions
        )
        beverageComponentList.add(beverageComponent2)

        val beverageComponent3 = BeverageComponent(
            R.drawable.teavana_tea,
            "Teavana Tea",
            R.drawable.teavana_tea_instructions
        )
        beverageComponentList.add(beverageComponent3)

        val beverageComponent4 = BeverageComponent(
            R.drawable.vanilla_sweet_cream,
            "Vanilla Sweet Cream",
            R.drawable.vanilla_sweet_cream_instructions
        )
        beverageComponentList.add(beverageComponent4)

        val beverageComponent5 = BeverageComponent(
            R.drawable.whipped_cream,
            "Whipped Cream",
            R.drawable.whipped_cream_instructions
        )
        beverageComponentList.add(beverageComponent5)
    }
}