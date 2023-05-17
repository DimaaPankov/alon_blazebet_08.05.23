package com.fbets.fstavki

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.fbets.fstavki.databinding.FragmentRightBinding


class RightFragment : Fragment() {

    val binding by lazy { FragmentRightBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (requireContext() as ZugActivity).goBack = {}
        (requireActivity() as ZugActivity).clickLeft = {findNavController().navigate(R.id.action_rightFragment_to_leftFragment)}
        (requireActivity() as ZugActivity).clickCenter = {findNavController().navigate(R.id.action_rightFragment_to_centerFragment)}
        (requireActivity() as ZugActivity).clickRight = {}
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root
    }


}