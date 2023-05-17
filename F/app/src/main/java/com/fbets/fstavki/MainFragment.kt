package com.fbets.fstavki

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.fbets.fstavki.databinding.FragmentMainBinding


class MainFragment : Fragment() {

   val binding by lazy { FragmentMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (requireActivity() as ZugActivity).clickLeft = {}
        (requireActivity() as ZugActivity).clickCenter = {findNavController().navigate(R.id.action_mainFragment_to_centerFragment)}
        (requireActivity() as ZugActivity).clickRight = {findNavController().navigate(R.id.action_mainFragment_to_rightFragment)}

        binding.IVall.setOnClickListener{
            findNavController().navigate(R.id.action_mainFragment_to_leftFragment)
        }
        binding.IVlegua.setOnClickListener{
            findNavController().navigate(R.id.action_mainFragment_to_centerFragment)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root
    }


}