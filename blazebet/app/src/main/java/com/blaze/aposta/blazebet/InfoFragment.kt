package com.blaze.aposta.blazebet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.blaze.aposta.blazebet.databinding.FragmentInfoBinding


class InfoFragment : Fragment() {

    val binding by lazy{
        FragmentInfoBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.Bback.setOnClickListener { findNavController().navigate(R.id.action_infoFragment_to_menuFragment) }

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }


}