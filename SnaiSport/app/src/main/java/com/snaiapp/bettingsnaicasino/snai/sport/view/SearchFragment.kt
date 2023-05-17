package com.parimatch.bettingipl.pari.match.screen

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.parimatch.bettingipl.pari.match.*
import com.parimatch.bettingipl.pari.match.databinding.FragmentSearchBinding
import java.util.*


class SearchFragment : Fragment() {

    val myAdapter = SearchAdapter()

    val binding by lazy { FragmentSearchBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        isPlayerReview = true
        setAppsList()
        binding.recyclerView.adapter = myAdapter

        fun setData(list: ArrayList<String>){
            sportsSearch = list
        }

        binding.searchBar.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                filterData(s.toString())
            }

            override fun afterTextChanged(s: Editable) {}
        })

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }

    private fun filterData(query: String) {
        val filteredData = ArrayList<String>()
        for (data in sports) {
            if (data.toLowerCase().contains(query.lowercase(Locale.getDefault()))) {
                filteredData.add(data)
            }
        }
        myAdapter.setData(filteredData)
        myAdapter.notifyDataSetChanged()
        binding.recyclerView.adapter = myAdapter
    }

}

