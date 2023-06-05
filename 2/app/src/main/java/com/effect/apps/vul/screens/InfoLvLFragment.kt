package com.effect.apps.vul.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.effect.apps.vul.R
import com.effect.apps.vul.activity.MainActivity
import com.effect.apps.vul.databinding.FragmentInfoLvLBinding

class InfoLvLFragment : Fragment() {

    val binding by lazy { FragmentInfoLvLBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (requireContext() as MainActivity).dklsjdfkljfd = {findNavController().navigate(R.id.action_infoLvLFragment_to_mainActivity2)}

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root
    }


    }
