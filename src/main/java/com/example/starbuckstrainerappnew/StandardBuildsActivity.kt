package com.example.starbuckstrainerappnew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.starbuckstrainerappnew.databinding.ActivityStandardBuildsBinding

class StandardBuildsActivity : AppCompatActivity(), StandardBuildsClickListener {
    private lateinit var binding: ActivityStandardBuildsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStandardBuildsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateDrinks()

        val standardBuildsActivity = this
        binding.standardBuildsRecycleView.apply {
            layoutManager = GridLayoutManager(applicationContext, 3)
            adapter = StandardBuildsCardAdapter(drinkList, standardBuildsActivity)
        }
        }

    override fun onClick(drink: Drink) {
        val intent = Intent(applicationContext, DrinkDetailActivity::class.java)
        intent.putExtra(DRINK_EXTRA, drink.id)
        startActivity(intent)
    }
}

    private fun populateDrinks()
    {
        val drink1 = Drink(
            R.drawable.espresso_bg,
            "Espresso",
            R.drawable.espresso_instructions
        )
        drinkList.add(drink1)

        val drink2 = Drink(
            R.drawable.iced_espresso_bg,
            "Iced Espresso",
            R.drawable.iced_espresso_instructions
        )
        drinkList.add(drink2)

        val drink3 = Drink(
            R.drawable.tea_latte_bg,
            "Tea Latte",
            R.drawable.tea_latte_instructions
        )
        drinkList.add(drink3)

        val drink4 = Drink(
            R.drawable.iced_tea_latte_bg,
            "Iced Tea Latte",
            R.drawable.iced_tea_latte_instructions
        )
        drinkList.add(drink4)

        val drink5 = Drink(
            R.drawable.cold_foam_bg,
            "Cold Foam",
            R.drawable.cold_foam_instructions
        )
        drinkList.add(drink5)

        val drink6 = Drink(
            R.drawable.frappuccino_bg,
            "Frappuccino",
            R.drawable.frappuccino_instructions
        )
        drinkList.add(drink6)

        val drink7 = Drink(
            R.drawable.shaken_iced_tea_bg,
            "Shaken Iced Tea",
            R.drawable.shaken_iced_tea_instructions
        )
        drinkList.add(drink7)

        val drink8 = Drink(
            R.drawable.refresher_bg,
            "Refresher",
            R.drawable.refresher_instructions
        )
        drinkList.add(drink8)

    }