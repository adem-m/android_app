package com.mrizak.app.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.mrizak.app.Data.Companion.navController
import com.mrizak.app.R
import com.mrizak.app.recycler.ListAdapter
import kotlinx.android.synthetic.main.search_list.*

class SearchListFragment() : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.search_list,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycler_view.layoutManager = LinearLayoutManager(requireContext())
        recycler_view.adapter = ListAdapter { position -> onListItemClick(position) }
    }

    private fun onListItemClick(position: Int) {
        navController?.navigate(R.id.action_searchListFragment_to_productDetailsFragment)
    }
}