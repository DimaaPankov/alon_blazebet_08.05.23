package com.blaze.aposta.blazebet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.blaze.aposta.blazebet.databinding.FragmentMenuBinding


class MenuFragment : Fragment() {

    val binding by lazy{
        FragmentMenuBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        when(background){
            BACGROUND.BLACK -> {binding.CVbackground.setBackgroundResource(R.color.black)}
            BACGROUND.PINK -> {binding.CVbackground.setBackgroundResource(R.color.pink)}
            BACGROUND.GREEN -> {binding.CVbackground.setBackgroundResource(R.color.bluegreen)}
            else ->{}}

        binding.TVbalans.text = pointsBalans.toString()
        binding.IVinfo.setOnClickListener{findNavController().navigate(R.id.action_menuFragment_to_infoFragment)}
        binding.Bshop.setOnClickListener{findNavController().navigate(R.id.action_menuFragment_to_shopFragment)}
      binding.BplayDI.setOnClickListener {findNavController().navigate(R.id.action_menuFragment_to_gameFragment) }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root
    }
}