package com.mrizak.app.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mrizak.app.R
import com.mrizak.app.models.Nutriscore
import com.mrizak.app.models.Product
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.empty_search_list.*
import kotlinx.android.synthetic.main.product_sheet.*

class EmptySearchListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.empty_search_list,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}