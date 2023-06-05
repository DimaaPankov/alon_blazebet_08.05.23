package com.effect.apps.vul.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.effect.apps.vul.R
import com.effect.apps.vul.activity.MainActivity
import com.effect.apps.vul.databinding.FragmentGameBinding
import com.effect.apps.vul.databinding.FragmentMenuBinding


class MenuFragment : Fragment() {
    val binding by lazy { FragmentMenuBinding .inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.Bplay .setOnClickListener{
            findNavController().navigate(R.id.action_menu_to_gameFragment)
        }
        binding.IVexit .setOnClickListener{
            (requireContext() as MainActivity).finishAffinity();
        }
        binding.IVinfo .setOnClickListener{
            findNavController().navigate(R.id.action_mainActivity2_to_infoLvLFragment)
        }
        binding.TVlevel .setOnClickListener{
            findNavController().navigate(R.id.action_mainActivity2_to_yourLevelFragment)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        return binding.root

    }


}