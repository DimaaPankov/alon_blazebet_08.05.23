package com.apps.tz.rainbowgoldstation.gamescreens

import android.animation.ObjectAnimator
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.apps.tz.rainbowgoldstation.R
import com.apps.tz.rainbowgoldstation.databinding.FragmentGameTwoBinding
import com.apps.tz.rainbowgoldstation.shared.SharedPrefs


class GameFragmentTwo : Fragment() {

    val binding by lazy { FragmentGameTwoBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding.TVpassword.text = SharedPrefs(requireContext()).getComputer()
        binding.CVback.setOnClickListener{
            val animator = ObjectAnimator.ofFloat(binding.CVback, View.SCALE_Y, 5F)
            animator.duration = 1000
            animator.start()

            val animator2 = ObjectAnimator.ofFloat(binding.CVback, View.SCALE_X, 5F)
            animator2.duration = 1000
            animator2.start()

            val animator3 = ObjectAnimator.ofFloat(binding.TVback, View.ALPHA, 1F)
            animator3.duration = 1000
            animator3.start()

        Handler(Looper.getMainLooper()).postDelayed({
            findNavController().navigate(R.id.action_gameFragmentTwo_to_gameFragment)
        },2000L)
    }



        binding.Bplay.setOnClickListener{
         findNavController().navigate(R.id.action_gameFragmentTwo_to_gameThreeFragment)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root
    }


}