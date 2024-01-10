package com.example.starbuckstrainerappnew

import androidx.recyclerview.widget.RecyclerView
import com.example.starbuckstrainerappnew.databinding.BeverageComponentRecipesCardCellBinding

class BeverageComponentCardViewHolder(
    private val cardCellBinding: BeverageComponentRecipesCardCellBinding,
    private val clickListener: BeverageComponentClickListener
): RecyclerView.ViewHolder(cardCellBinding.root)
{
    fun bindBeverageComponents(beverageComponent: BeverageComponent)
    {
        cardCellBinding.beverageComponentImage.setImageResource(beverageComponent.beverageComponentImage)
        cardCellBinding.beverageComponentName.text = beverageComponent.beverageComponentName

        cardCellBinding.beverageComponentRecipesCardView.setOnClickListener{
            clickListener.onClick(beverageComponent)
        }
    }
}