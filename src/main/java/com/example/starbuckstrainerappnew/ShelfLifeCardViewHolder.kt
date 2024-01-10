package com.example.starbuckstrainerappnew

import androidx.recyclerview.widget.RecyclerView
import com.example.starbuckstrainerappnew.databinding.ShelfLifeCardCellBinding

class ShelfLifeCardViewHolder(
    private val cardCellBinding: ShelfLifeCardCellBinding,
    private val clickListener: ShelfItemClickListener
) : RecyclerView.ViewHolder(cardCellBinding.root)
{
    fun bindShelfItem(shelfItem: ShelfItem)
    {
        cardCellBinding.shelfItemImage.setImageResource(shelfItem.shelfItemImage)
        cardCellBinding.shelfItemName.text = shelfItem.shelfItemName

        cardCellBinding.shelfLifeStandardsCardView.setOnClickListener{
            clickListener.onClick(shelfItem)
        }
    }
}