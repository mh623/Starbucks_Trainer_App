package com.example.starbuckstrainerappnew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.starbuckstrainerappnew.databinding.ActivityShelfLifeStandardsBinding
import com.example.starbuckstrainerappnew.databinding.ActivityShelfLifeStandardsDetailBinding

class ShelfLifeStandardsDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityShelfLifeStandardsDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShelfLifeStandardsDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val shelfItemID = intent.getIntExtra(SHELF_ITEM_EXTRA,-1)
        val shelfItem = shelfItemFromID(shelfItemID)

        if(shelfItem != null)
        {
            binding.shelfItemImage.setImageResource(shelfItem.shelfItemImage)
            binding.shelfItemName.text = shelfItem.shelfItemName
            binding.shelfItemDetails.setImageResource(shelfItem.shelfItemDetails)
        }
    }
    private fun shelfItemFromID(shelfItemID: Int): ShelfItem? {
        for(shelfItem in shelfItemList)
        {
            if(shelfItem.id == shelfItemID)
                return shelfItem
        }
        return null
    }
}