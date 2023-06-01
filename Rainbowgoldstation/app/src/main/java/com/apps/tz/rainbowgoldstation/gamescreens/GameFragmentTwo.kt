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


      var codePlace = ""


class GameFragmentTwo : Fragment() {

    val binding by lazy { FragmentGameTwoBinding.inflate(layoutInflater) }

    val ramdomCode = listOf("J235","L901","N988","F509","M091","V289","Q971","X198","T601","W176","E612","H499",)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        codePlace = ramdomCode.random()
        binding.TVpassword.text = codePlace
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