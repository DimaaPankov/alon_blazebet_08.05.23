package com.rustamtest.karaokefrogtest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.apps.tz.rainbowgoldstation.shared.SharedPrefs
import com.rustamtest.karaokefrogtest.activity.MainActivity
import com.rustamtest.karaokefrogtest.R
import com.rustamtest.karaokefrogtest.databinding.FragmentOneBinding

data class ModelMusic(val music:String, val artist : String )

var listDataApi = arrayListOf<ModelMusic>()

class OneFragment : Fragment() {

val binding by lazy{
    FragmentOneBinding.inflate(layoutInflater)
}



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (requireContext() as MainActivity).goBack = {}

        SharedPrefs(requireContext()).setStatus(SharedPrefs.STATUS_OPENED_URL)


        binding.IVplay.setOnClickListener{
            findNavController().navigate(R.id.action_oneFragment_to_foureFragment)
        }

        binding.TVadmin.setOnClickListener{
            findNavController().navigate(R.id.action_oneFragment_to_twoFragment)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }


}

