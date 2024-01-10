package com.example.starbuckstrainerappnew

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.starbuckstrainerappnew.databinding.ActivityShelfLifeStandardsBinding

class ShelfLifeStandardsActivity : AppCompatActivity(), ShelfItemClickListener {
    private lateinit var binding: ActivityShelfLifeStandardsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShelfLifeStandardsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateShelfItems()

        val shelfLifeStandardsActivity = this
        binding.shelfLifeStandardsRecyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 3)
            adapter = ShelfLifeCardAdapter(shelfItemList, shelfLifeStandardsActivity)
        }
    }

    override fun onClick(shelfItem: ShelfItem) {
        val intent = Intent(applicationContext, ShelfLifeStandardsDetailActivity::class.java)
        intent.putExtra(SHELF_ITEM_EXTRA, shelfItem.id)
        startActivity(intent)
    }

    private fun populateShelfItems() {
        val shelfItem1 = ShelfItem(
            R.drawable.coffee_and_tea,
            "Coffee and Tea",
            R.drawable.coffee_and_tea_details
        )
        shelfItemList.add(shelfItem1)

        val shelfItem2 = ShelfItem(
            R.drawable.powders_and_inclusions,
            "Powders and Inclusions",
            R.drawable.powders_and_inclusions_details
        )
        shelfItemList.add(shelfItem2)

        val shelfItem3 = ShelfItem(
            R.drawable.dairy_and_nondairy_items,
            "Dairy and Non-Dairy Items",
            R.drawable.dairy_and_nondairy_details
        )
        shelfItemList.add(shelfItem3)

        val shelfItem4 = ShelfItem(
            R.drawable.sauces_and_syrups,
            "Sauces and Syrups",
            R.drawable.sauces_and_syrups_details
        )
        shelfItemList.add(shelfItem4)

        val shelfItem5 = ShelfItem(
            R.drawable.juices,
            "Juices",
            R.drawable.juices_details
        )
        shelfItemList.add(shelfItem5)

        val shelfItem6 = ShelfItem(
            R.drawable.toppings_and_condiments,
            "Toppings and Condiments",
            R.drawable.toppings_and_condiments_details
        )
        shelfItemList.add(shelfItem6)
    }
}