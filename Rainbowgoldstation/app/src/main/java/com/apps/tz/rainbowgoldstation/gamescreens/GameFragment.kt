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
import com.apps.tz.rainbowgoldstation.databinding.FragmentGameBinding
import com.apps.tz.rainbowgoldstation.shared.SharedPrefs


class GameFragment : Fragment() {

    val binding by lazy { FragmentGameBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val animator6 = ObjectAnimator.ofFloat(binding.IVgnom, View.TRANSLATION_X, 500F)
        animator6.duration = 0
        animator6.start()

        val animator7 = ObjectAnimator.ofFloat(binding.IVgnom, View.ALPHA, 0F)
        animator7.duration = 0
        animator7.start()

        val animator8 = ObjectAnimator.ofFloat(binding.Bplay, View.TRANSLATION_Y, 500F)
        animator8.duration = 0
        animator8.start()

        val animator9 = ObjectAnimator.ofFloat(binding.Bplay, View.ALPHA, 0F)
        animator9.duration = 0
        animator9.start()

        val animator13 = ObjectAnimator.ofFloat(binding.CVbackGreen, View.TRANSLATION_Y, 500F)
        animator13.duration = 0
        animator13.start()

        val animator14 = ObjectAnimator.ofFloat(binding.CVbackGreen, View.ALPHA, 0F)
        animator14.duration = 0
        animator14.start()

        Handler(Looper.getMainLooper()).postDelayed({

        val animator8 = ObjectAnimator.ofFloat(binding.IVgnom, View.TRANSLATION_X, -0F)
        animator8.duration = 1000
        animator8.start()

        val animator9 = ObjectAnimator.ofFloat(binding.IVgnom, View.ALPHA, 1F)
        animator9.duration = 1000
        animator9.start()

            val animator10 = ObjectAnimator.ofFloat(binding.Bplay, View.TRANSLATION_Y, 0F)
            animator10.duration = 1000
            animator10.start()

            val animator11 = ObjectAnimator.ofFloat(binding.Bplay, View.ALPHA, 1F)
            animator11.duration = 1000
            animator11.start()

            val animator13 = ObjectAnimator.ofFloat(binding.CVbackGreen, View.TRANSLATION_Y, 0F)
            animator13.duration = 1000
            animator13.start()

            val animator14 = ObjectAnimator.ofFloat(binding.CVbackGreen, View.ALPHA, 1F)
            animator14.duration = 1000
            animator14.start()
        },500L)

        binding.Bplay.setOnClickListener {
            findNavController().navigate(R.id.action_gameFragment_to_gameFragmentTwo)
        }

        SharedPrefs(requireContext()).setStatus(SharedPrefs.STATUS_OPEN_GAME)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }


}