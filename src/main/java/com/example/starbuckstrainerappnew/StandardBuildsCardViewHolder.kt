package com.example.starbuckstrainerappnew

import androidx.recyclerview.widget.RecyclerView
import com.example.starbuckstrainerappnew.databinding.StandardBuildsCardCellBinding

class StandardBuildsCardViewHolder (
    private val cardCellBinding: StandardBuildsCardCellBinding,
    private val clickListener: StandardBuildsClickListener
) : RecyclerView.ViewHolder(cardCellBinding.root)
{
    fun bindDrink(drink: Drink)
    {
        cardCellBinding.drinkImage.setImageResource(drink.drinkImage)
        cardCellBinding.drinkName.text = drink.drinkName

        cardCellBinding.standardBuildsCardView.setOnClickListener {
            clickListener.onClick(drink)
        }
    }
}