package com.mrizak.app.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mrizak.app.R
import com.mrizak.app.models.Nutriscore
import com.mrizak.app.models.Product
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.product_sheet.*

class ProductSheetFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.product_sheet,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val product = Product(
            "Petits pois et carottes",
            "Cassegrain",
            "3083680085304",
            Nutriscore.E,
            "https://static.openfoodfacts.org/images/products/308/368/008/5304/front_fr.7.400.jpg",
            "400 g (280 g net égoutté)",
            listOf("France", "Japon", "Suisse"),
            listOf("aa", "bb"),
            listOf("aa", "bb"),
            listOf("aa", "bb"),
            230
        )
        displayProduct(product)
    }

    private fun displayProduct(product: Product) {
        name.text = product.name
        brand.text = product.brand
        nutriscore_image.setImageResource(product.nutriscore.image)
        bar_code.text = product.barCode
        quantity.text = product.quantity
        countries.text = product.countries.joinToString()
        ingredients.text = product.ingredients.joinToString()
        allergens.text =
            if (product.allergens.isEmpty()) "Aucune" else product.allergens.joinToString()
        additives.text =
            if (product.additives.isEmpty()) "Aucun" else product.additives.joinToString()
        Picasso.get().load(product.imageUrl).into(product_image)
    }
}