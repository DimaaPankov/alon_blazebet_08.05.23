package com.scellluck.ywheeljo.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.scellluck.ywheeljo.MainActivity
import com.scellluck.ywheeljo.R
import com.scellluck.ywheeljo.databinding.FragmentMenuBinding


class MenuFragment : Fragment() {

    val binding by lazy{
        FragmentMenuBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.IVstart.setOnClickListener{
            findNavController().navigate(R.id.action_menuFragment_to_firstFragment)
        }
        binding.IVexit.setOnClickListener{
            (requireContext() as MainActivity).finishAffinity()
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }


}