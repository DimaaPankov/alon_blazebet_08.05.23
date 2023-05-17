package com.fbets.fstavki

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.fbets.fstavki.databinding.FragmentDeteilBinding

class DeteilFragment : Fragment() {

    val binding by lazy { FragmentDeteilBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (requireContext() as ZugActivity).goBack = {findNavController().navigate(R.id.action_deteilFragment_to_mainFragment)}

        (requireActivity() as ZugActivity).clickLeft = {}
        (requireActivity() as ZugActivity).clickCenter = {findNavController().navigate(R.id.action_deteilFragment_to_centerFragment)}
        (requireActivity() as ZugActivity).clickRight = {findNavController().navigate(R.id.action_deteilFragment_to_rightFragment)}

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }


}