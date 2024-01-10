package com.example.starbuckstrainerappnew

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.starbuckstrainerappnew.databinding.ShelfLifeCardCellBinding

class ShelfLifeCardAdapter(
    private val shelfItems: List<ShelfItem>,
    private val clickListener: ShelfItemClickListener
    )
    : RecyclerView.Adapter<ShelfLifeCardViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShelfLifeCardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = ShelfLifeCardCellBinding.inflate(from, parent, false)
        return ShelfLifeCardViewHolder(binding, clickListener)
    }

    override fun getItemCount(): Int = shelfItems.size

    override fun onBindViewHolder(holder: ShelfLifeCardViewHolder, position: Int) {
        holder.bindShelfItem(shelfItems[position])
    }
}