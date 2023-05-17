package com.fbets.fstavki

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.fbets.fstavki.databinding.FragmentLeftBinding


class LeftFragment : Fragment() {

    val binding by lazy { FragmentLeftBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (requireContext() as ZugActivity).goBack = {}

        (requireActivity() as ZugActivity).clickLeft = {}
        (requireActivity() as ZugActivity).clickCenter = {findNavController().navigate(R.id.action_leftFragment_to_centerFragment)}
        (requireActivity() as ZugActivity).clickRight = {findNavController().navigate(R.id.action_leftFragment_to_rightFragment)}

         binding.FMlig.setOnClickListener{
             findNavController().navigate(R.id.action_leftFragment_to_deteilFragment)
         }
        binding.FMlig2.setOnClickListener{
            findNavController().navigate(R.id.action_leftFragment_to_deteilFragment)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }



}