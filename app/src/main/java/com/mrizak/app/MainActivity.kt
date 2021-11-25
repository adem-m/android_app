package com.mrizak.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.NavHostFragment
import com.mrizak.app.fragments.SearchListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.toolbar))

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        Data.navController = navHostFragment.navController

        supportFragmentManager.beginTransaction()
            .apply {
                replace(R.id.nav_host_fragment_container, SearchListFragment())
                commitAllowingStateLoss()
            }


//        recycler_view.layoutManager = LinearLayoutManager(this)
//        val product = Product(
//            "Petits pois et carottes",
//            "Cassegrain",
//            "3083680085304",
//            Nutriscore.E,
//            "https://static.openfoodfacts.org/images/products/308/368/008/5304/front_fr.7.400.jpg",
//            "400 g (280 g net égoutté)",
//            listOf("France", "Japon", "Suisse"),
//            listOf("aa", "bb"),
//            listOf("aa", "bb"),
//            listOf("aa", "bb"),
//            230
//        )
//
//        val product2 = Product(
//            "Petits pois et carottes",
//            "Cassegrain",
//            "3083680085304",
//            Nutriscore.E,
//            "https://static.openfoodfacts.org/images/products/308/368/008/5304/front_fr.7.400.jpg",
//            "400 g (280 g net égoutté)",
//            listOf("France", "Japon", "Suisse"),
//            listOf("aa", "bb"),
//            listOf("aa", "bb"),
//            listOf("aa", "bb"),
//            17
//        )
//        recycler_view.adapter = ListAdapter(listOf(product, product2))

//
//        displayProduct(product)
    }
}

