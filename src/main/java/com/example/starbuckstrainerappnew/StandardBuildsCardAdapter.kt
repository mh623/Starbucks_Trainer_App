package com.example.starbuckstrainerappnew

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.starbuckstrainerappnew.databinding.StandardBuildsCardCellBinding

class StandardBuildsCardAdapter (
    private val drinks: List<Drink>,
    private val clickListener: StandardBuildsClickListener
)
    : RecyclerView.Adapter<StandardBuildsCardViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StandardBuildsCardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = StandardBuildsCardCellBinding.inflate(from, parent, false)
        return StandardBuildsCardViewHolder(binding, clickListener)
    }

    override fun getItemCount(): Int = drinks.size

    override fun onBindViewHolder(holder: StandardBuildsCardViewHolder, position: Int) {
        holder.bindDrink(drinks[position])
    }

}