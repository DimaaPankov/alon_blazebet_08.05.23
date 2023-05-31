package com.fbets.fstavki

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.fbets.fstavki.databinding.SlkdjfhkflxjghkfjghdlfBinding


class slkdjfhkflxjghkfjghdlf : Fragment() {

    val fhjdgkljdfkgljkldfgjkdlfjgldfjg by lazy { SlkdjfhkflxjghkfjghdlfBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (requireContext() as ZugActivity).kldsjkldsjdm = {}
        (requireActivity() as ZugActivity).dfjsdlkfjklfd = {findNavController().navigate(R.id.kfgvhkdlfjghvnklfdjhkjdh)}
        (requireActivity() as ZugActivity).ksdjkdlsjd = {findNavController().navigate(R.id.xgkjhdfkljghdfkjghdlkjfg)}
        (requireActivity() as ZugActivity).dslkjkdsljds = {}
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return fhjdgkljdfkgljkldfgjkdlfjgldfjg.root
    }


}