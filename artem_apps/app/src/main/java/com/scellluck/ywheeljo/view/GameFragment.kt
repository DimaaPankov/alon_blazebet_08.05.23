package com.scellluck.ywheeljo.view

import android.animation.ObjectAnimator

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.scellluck.ywheeljo.MainActivity
import com.scellluck.ywheeljo.databinding.FragmentFirstqasdBinding

import com.scellluck.ywheeljo.utils.bet


data class CountDrum(var i:Int,var color:Int)
var balans = 1000F

class FirstFragment : Fragment() {
    var histr = mutableListOf(false,false,false,
                                       false,false,false,
                                       false,false,false,
                                       false)



    companion object {
        val RED = 0
        val BLACK = 1
    }
    var rote = 0
    var roteIndex = 0
    var lastRote = 0
    var indexList = 0

    val binding by lazy { FragmentFirstqasdBinding.inflate(layoutInflater) }
    lateinit var animator1:ObjectAnimator


  var indexRot = listOf(0,14,17,25,9,8,23,11,23,4,8,40,50,23,12,33,29,26, 11,33,1,20,21,20,14,27,35,
      0,14,17,25,9,8,23,11,23,4,8,40,50,23,12,33,29,26,11,33,1,20,21,20,14,27,35)

    val listCount = listOf(
        CountDrum(400, BLACK),
         CountDrum(150, BLACK),
        CountDrum(150, RED),
        CountDrum(10, RED),
        CountDrum(1000, RED),
        CountDrum(10, RED),
        CountDrum(60, RED),
        CountDrum(10, RED),
        CountDrum(400, RED),
        CountDrum(10, BLACK),
        CountDrum(30, BLACK),
        CountDrum(1000, RED),
        CountDrum(60, BLACK),
        CountDrum(1000, BLACK),
        CountDrum(70, BLACK),
        CountDrum(1000, RED),
        CountDrum(10, RED),
        CountDrum(90, RED),
        CountDrum(500, RED),
        CountDrum(150, BLACK),
        CountDrum(30, RED),
        CountDrum(70, BLACK),
        CountDrum(150, BLACK),
        CountDrum(200, RED),
        CountDrum(20, BLACK),
        CountDrum(60, BLACK),
        CountDrum(20, RED),
        CountDrum(30, BLACK),
        CountDrum(90, BLACK),
        CountDrum(150, RED),
        CountDrum(150, RED),
        CountDrum(150, RED),
        CountDrum(70, RED),
        CountDrum(1000, BLACK),
        CountDrum(200, BLACK),
        CountDrum(150, BLACK),
        CountDrum(150, BLACK),
        CountDrum(200, BLACK),
        CountDrum(150, BLACK),
        CountDrum(70, RED),
        CountDrum(150, RED),
        CountDrum(500, RED))


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.TVbet.text = bet.toString()

        binding.FLminus.setOnClickListener{
            if(bet!=0F) {
                --bet
                binding.TVbet.text  = bet.toString()
            }
        }

        binding.FLplus.setOnClickListener{
            if(bet!=0F) {
                ++bet
                binding.TVbet.text  = bet.toString()
            }
        }


        MainActivity.goBack = {}



            binding.bPlayqasd.setOnClickListener{
               // gerughvrgu(requireContext()).ewfh(gerughvrgu(requireContext()).wevh() - bet)
               balans =  balans-bet
                binding.TVwin.text = balans.toString() //(gerughvrgu(requireContext()).wevh()).toString()
                rote  = rote()
                animationDrum()

                Handler(Looper.getMainLooper()).postDelayed({

                        //if (rvjkh.color == listCount[indexList].color) {
                          //  gerughvrgu(requireContext()).ewfh(gerughvrgu(requireContext()).wevh() + bet*(listCount[indexList].i*0.01F) )
                          balans = balans+ bet*(listCount[indexList].i*0.01F)
                           // binding.TVbalansqasd.text = (gerughvrgu(requireContext()).wevh()).toString()
                            binding.TVwin.text = balans.toString()//(gerughvrgu(requireContext()).wevh()).toString()
                            histr.add(true)
                  /*  }else if(rvjkh.i == listCount[indexList].color) {
                            gerughvrgu(requireContext()).ewfh(gerughvrgu(requireContext()).wevh() +  bet*(listCount[indexList].i*0.01F) )
                            binding.TVwin.text = (gerughvrgu(requireContext()).wevh()).toString()
                            histr.add(false)
                        }*/
                      /* var i = histr.size -1
                    if(histr[i] && histr[i-1] && histr[i-2]) {
                        countBonus = 100

                        histr = mutableListOf<Boolean>(
                            false,false,false,
                            false,false,false,
                            false,false,false,
                            false)
                    }else if(histr[i] && histr[i-1] && histr[i-2] && histr[i - 3] && histr[i-4]){
                        countBonus = 500

                        histr = mutableListOf<Boolean>(
                            false,false,false,
                            false,false,false,
                            false,false,false,
                            false)
                    }else if(histr[i] && histr[i-1] && histr[i-2] && histr[i - 3] && histr[i-4] ||
                             histr[i-5] && histr[i-6] && histr[i-7] && histr[i - 8] && histr[i-9]){
                        countBonus = 500
                      //  openBonus()
                      //  binding.TVcountBonusqasd.text  =  countBonus.toString()
                        histr = mutableListOf<Boolean>(
                            false,false,false,
                            false,false,false,
                            false,false,false,
                            false)
                    }*/
                    ++indexList
                },4000)
}

      /*  binding.Bbonusqasd.setOnClickListener{
            val animator5 = ObjectAnimator.ofFloat(binding.CVbonusqasd, View.ALPHA, 0F)
            animator5.duration = 1000
            animator5.start()

            val animator6 = ObjectAnimator.ofFloat(binding.CVbonusqasd, View.X, -130F)
            animator6.duration = 1500
            animator6.start()
        }*/

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root


    }
    private fun animationDrum(){
        animator1 = ObjectAnimator.ofFloat(binding.imageViewqasd, View.ROTATION, rote().toFloat())
        animator1.duration = 4000
        animator1.start()
    }

    fun rote():Int {
        roteIndex = indexRot[indexList]
        lastRote+=1805+indexRot[indexList]*10
        Log.d("indexRote ",indexRot[indexList].toString())
        return lastRote

    }

  /*  private fun openBonus(){
        binding.TVcountBonusqasd.text = countBonus.toString()
       val animator5 = ObjectAnimator.ofFloat(binding.CVbonusqasd, View.ALPHA, 1F)
        animator5.duration = 1000
        animator5.start()

       val animator6 = ObjectAnimator.ofFloat(binding.CVbonusqasd, View.X, 130F)
        animator6.duration = 1500
        animator6.start()
    }*/

}