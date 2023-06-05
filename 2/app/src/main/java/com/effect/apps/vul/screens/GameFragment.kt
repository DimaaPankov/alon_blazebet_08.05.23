package com.effect.apps.vul.screens

import android.animation.ObjectAnimator
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.apps.tz.rainbowgoldstation.shared.SharedPrefs
import com.effect.apps.vul.R
import com.effect.apps.vul.activity.MainActivity
import com.effect.apps.vul.databinding.FragmentGameBinding


var point = 0

class GameFragment : Fragment() {

    val binding by lazy{
        FragmentGameBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        point = SharedPrefs(requireContext()).getBalance()
        binding.TVpoints.text = "${point} \uD83D\uDD25"
        (requireContext() as MainActivity).dklsjdfkljfd = {findNavController().navigate(R.id.action_gameFragment_to_mainActivity2)}
        binding.IVClick.setOnClickListener {
            val animator = ObjectAnimator.ofFloat(binding.IVClick, View.SCALE_X, 1.5F)
            animator.duration = 20
            animator.start()

            val animator2 = ObjectAnimator.ofFloat(binding.IVClick, View.SCALE_Y, 1.5F)
            animator2.duration = 20
            animator2.start()

            Handler(Looper.getMainLooper()).postDelayed({
                val animator = ObjectAnimator.ofFloat(binding.IVClick, View.SCALE_X, 1F)
                animator.duration = 20
                animator.start()
                val animator2 = ObjectAnimator.ofFloat(binding.IVClick, View.SCALE_Y, 1F)
                animator2.duration = 20
                animator2.start()
                when{
                    (SharedPrefs(requireContext()).getBalance()>=2500) ->{
                        SharedPrefs(requireContext()).setLevel(1)
                   }
                    (SharedPrefs(requireContext()).getBalance()>=10000) ->{
                        SharedPrefs(requireContext()).setLevel(2)
                    }
                    (SharedPrefs(requireContext()).getBalance()>=100000) ->{
                        SharedPrefs(requireContext()).setLevel(3)
                    }

                }
                when(SharedPrefs(requireContext()).getLevel()){
                    0->{
                        ++point
                        SharedPrefs(requireContext()).setBalance(point)
                        binding.TVpoints.text = "$point \uD83D\uDD25"}
                    1->{
                        point = point + 3
                        SharedPrefs(requireContext()).setBalance(point)
                        binding.TVpoints.text = "$point \uD83D\uDD25"}
                    2->{
                        point = point + 10
                        SharedPrefs(requireContext()).setBalance(point)
                        binding.TVpoints.text = "$point \uD83D\uDD25"}
                    3->{
                        point = point + 25
                        SharedPrefs(requireContext()).setBalance(point)
                        binding.TVpoints.text = "$point \uD83D\uDD25"}
                }
                SharedPrefs(requireContext()).setBalance(point)
                binding.TVpoints.text = "$point \uD83D\uDD25"


            },100)

        }

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }
}