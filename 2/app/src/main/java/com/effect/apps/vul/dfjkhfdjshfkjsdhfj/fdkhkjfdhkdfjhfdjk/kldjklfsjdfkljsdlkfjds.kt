package com.effect.apps.vul.dfjkhfdjshfkjsdhfj.fdkhkjfdhkdfjhfdjk

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.effect.apps.vul.R
import com.effect.apps.vul.dfjkhfdjshfkjsdhfj.fdkhkjfdhkdfjhfdjk.kjdsjksjkdhdskj.MainActivity
import com.effect.apps.vul.databinding.KldjklfsjdfkljsdlkfjdsBinding


class kldjklfsjdfkljsdlkfjds : Fragment() {
    val djkhfkjdsfh by lazy { KldjklfsjdfkljsdlkfjdsBinding .inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        djkhfkjdsfh.jdkshfkjdh .setOnClickListener{

            findNavController().navigate(R.id.jkhgjkshfjksdhfjksdf)
        }
        djkhfkjdsfh.kdjshfkjshdf .setOnClickListener{
            (requireContext() as MainActivity).finishAffinity();
        }
        djkhfkjdsfh.kdjshfjksdhf .setOnClickListener{
            findNavController().navigate(R.id.kfhgkjfdhgkjhdfgkjhdfgjkhfg)
        }
        djkhfkjdsfh.fklhgkljfsgklfjg .setOnClickListener{
            findNavController().navigate(R.id.lksdjlkjsfdklgjlkfsgjlkdfgjl)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        return djkhfkjdsfh.root

    }


}