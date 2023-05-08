package com.blaze.aposta.blazebet

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import com.blaze.aposta.blazebet.databinding.FragmentShopBinding

var background = BACGROUND.EMPTY

enum class BACGROUND {
    BLACK,GREEN,PINK,EMPTY
}


class ShopFragment : Fragment() {

    val binding by lazy { FragmentShopBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        when(background){
            BACGROUND.BLACK -> {binding.CVbackground.setBackgroundResource(R.color.black)}
            BACGROUND.PINK -> {binding.CVbackground.setBackgroundResource(R.color.pink)}
            BACGROUND.GREEN -> {binding.CVbackground.setBackgroundResource(R.color.bluegreen)}
            else ->{}}

        binding.FL1.setOnClickListener{if(pointsBalans>=20){binding.FL1q.isVisible = true;binding.FL2q.isVisible = false;binding.FL3q.isVisible = false;background = BACGROUND.GREEN;binding.CVbackground.setBackgroundResource(R.color.bluegreen);pointsBalans = pointsBalans-20}else{binding.TVnotprice.isVisible = true;Handler(
            Looper.getMainLooper()).postDelayed({findNavController().navigate(R.id.action_shopFragment_to_menuFragment)},1000L)} }
        binding.FL2.setOnClickListener{if(pointsBalans>=20){binding.FL1q.isVisible = false;binding.FL2q.isVisible = true;binding.FL3q.isVisible = false;background = BACGROUND.PINK;binding.CVbackground.setBackgroundResource(R.color.pink);pointsBalans = pointsBalans-20}else{binding.TVnotprice.isVisible = true;Handler(
            Looper.getMainLooper()).postDelayed({findNavController().navigate(R.id.action_shopFragment_to_menuFragment)},1000L)} }
        binding.FL3.setOnClickListener{if(pointsBalans>=20){binding.FL1q.isVisible = false;binding.FL2q.isVisible = false;binding.FL3q.isVisible = true;background = BACGROUND.BLACK;binding.CVbackground.setBackgroundResource(R.color.black);pointsBalans = pointsBalans-20}else{binding.TVnotprice.isVisible = true;Handler(
            Looper.getMainLooper()).postDelayed({findNavController().navigate(R.id.action_shopFragment_to_menuFragment)},1000L)} }
        binding.Bback.setOnClickListener { findNavController().navigate(R.id.action_shopFragment_to_menuFragment) }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }


}