package com.fbets.fstavki

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.fbets.fstavki.databinding.FragmentCenterBinding


class CenterFragment : Fragment() {

    val binding by lazy { FragmentCenterBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (requireActivity() as ZugActivity).clickLeft = {findNavController().navigate(R.id.action_centerFragment_to_leftFragment)}
        (requireActivity() as ZugActivity).clickCenter = {}
        (requireActivity() as ZugActivity).clickRight = {findNavController().navigate(R.id.action_centerFragment_to_rightFragment)}
        (requireContext() as ZugActivity).goBack = {}
        (requireContext() as ZugActivity).goBack = {}

       binding.FMlig.setOnClickListener{
           findNavController().navigate(R.id.action_centerFragment_to_deteilFragment)
       }

        }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }


}