package com.effect.apps.vul.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.apps.tz.rainbowgoldstation.shared.SharedPrefs
import com.effect.apps.vul.R
import com.effect.apps.vul.activity.MainActivity
import com.effect.apps.vul.databinding.FragmentYourLevelBinding


class YourLevelFragment : Fragment() {

    val binding by lazy{
        FragmentYourLevelBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (requireContext() as MainActivity).dklsjdfkljfd = {findNavController().navigate(R.id.action_yourLevelFragment_to_mainActivity2)}

        when(SharedPrefs(requireContext()).getLevel()){
            1 -> {binding.textView4.text = "Your level is one"; binding.imageView.setImageResource(R.drawable.onelvl)}
            2 -> {binding.textView4.text = "Your level is two"; binding.imageView.setImageResource(R.drawable.twolvl)}
            3 -> {binding.textView4.text = "Your level is three"; binding.imageView.setImageResource(R.drawable.threelvl)}
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }


}