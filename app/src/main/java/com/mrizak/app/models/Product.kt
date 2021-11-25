package com.mrizak.app.models

data class Product(
    val name: String,
    val brand: String,
    val barCode: String,
    val nutriscore: Nutriscore,
    val imageUrl: String,
    val quantity: String,
    val countries: List<String>,
    val ingredients: List<String>,
    val allergens: List<String>,
    val additives: List<String>,
    val calories: Int
)