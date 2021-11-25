package com.mrizak.app.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mrizak.app.Data
import com.mrizak.app.R

class ListAdapter(
    private val onItemClicked: (position: Int) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ListItemViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.list_cell, parent, false),
            onItemClicked
        )
    }

    override fun onBindViewHolder(
        holder: RecyclerView.ViewHolder,
        position: Int
    ) {
        val item = holder as ListItemViewHolder
        item.bindData(Data.products[position])
    }

    override fun getItemCount(): Int {
        return Data.products.size
    }

}