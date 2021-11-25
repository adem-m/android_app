package com.mrizak.app.recycler

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mrizak.app.R
import com.mrizak.app.models.Product

class ListItemViewHolder(
    v: View,
    private val onItemClicked: (position: Int) -> Unit
) :
    RecyclerView.ViewHolder(v), View.OnClickListener {
    init {
        v.setOnClickListener(this)
    }

    val name = v.findViewById<TextView>(R.id.cell_name)
    val brand = v.findViewById<TextView>(R.id.cell_brand)
    val nutriscore = v.findViewById<TextView>(R.id.cell_nutriscore)
    val calories = v.findViewById<TextView>(R.id.cell_calories)

    fun bindData(product: Product) {
        name.text = product.name
        brand.text = product.brand
        nutriscore.text = product.nutriscore.toString()
        calories.text = product.calories.toString()
    }

    override fun onClick(v: View) {
        val position = adapterPosition
        onItemClicked(position)
    }
}