package com.parimatch.bettingipl.pari.match.screen

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.parimatch.bettingipl.pari.match.R
import com.parimatch.bettingipl.pari.match.databinding.FragmentBlankBinding
import com.parimatch.bettingipl.pari.match.isPlayerReview
import com.parimatch.bettingipl.pari.match.sportsAppReviews


class BlankFragment : Fragment() {

val binding by lazy{ FragmentBlankBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.homeButton.setOnClickListener{
            isPlayerReview = true
            findNavController().navigate(R.id.action_blankFragment_to_mainFragment)
        }
        binding.favoritesButton.setOnClickListener{
            isPlayerReview = false
            findNavController().navigate(R.id.action_blankFragment_to_mainFragment)

        }

        binding.bestSearchButton.setOnClickListener{
            findNavController().navigate(R.id.action_blankFragment_to_searchFragment)
        }

        (requireContext() as MainActivity).goBack = {
            findNavController().navigate(R.id.action_searchFragment_to_blankFragment)
        }

        binding.exitButton.setOnClickListener{
            requireActivity().finishAffinity();
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }


}