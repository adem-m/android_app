package com.mrizak.app

import androidx.navigation.NavController
import com.mrizak.app.models.Nutriscore
import com.mrizak.app.models.Product

class Data {
    companion object {
        var navController: NavController? = null;
        val products = listOf(
            Product(
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
            ), Product(
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
                17
            )
        )
    }
}