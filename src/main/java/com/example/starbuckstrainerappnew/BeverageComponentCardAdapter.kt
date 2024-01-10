package com.example.starbuckstrainerappnew

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.starbuckstrainerappnew.databinding.BeverageComponentRecipesCardCellBinding

class BeverageComponentCardAdapter (
    private val beverageComponents: List<BeverageComponent>,
    private val clickListener: BeverageComponentClickListener
)
    : RecyclerView.Adapter<BeverageComponentCardViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeverageComponentCardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = BeverageComponentRecipesCardCellBinding.inflate(from, parent, false)
        return BeverageComponentCardViewHolder(binding, clickListener)
    }

    override fun getItemCount(): Int = beverageComponents.size

    override fun onBindViewHolder(holder: BeverageComponentCardViewHolder, position: Int) {
        holder.bindBeverageComponents(beverageComponents[position])
    }
}