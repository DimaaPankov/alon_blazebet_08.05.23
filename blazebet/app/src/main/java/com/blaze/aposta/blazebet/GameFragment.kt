package com.blaze.aposta.blazebet

import android.animation.ObjectAnimator
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import com.blaze.aposta.blazebet.databinding.FragmentGameBinding

var listPlace = arrayListOf("\uD83D\uDCA3","\uD83D\uDCA3","\uD83D\uDCA3","\uD83D\uDCA3","\uD83D\uDCA3","\uD83D\uDCA3","\uD83D\uDCA3","\uD83D\uDCA3","\uD83D\uDCA3","\uD83D\uDCA3",
    "\uD83D\uDCA3","\uD83D\uDCA3","\uD83D\uDCA3","\uD83D\uDCA3","\uD83D\uDCA3","\uD83D\uDCA3","\uD83D\uDCA3","\uD83D\uDCA3","\uD83D\uDCA3","\uD83D\uDCA3",
    "\uD83D\uDCA3","\uD83D\uDCA3","\uD83D\uDCA3","\uD83D\uDCA3","\uD83D\uDCA3","\uD83D\uDCA3","\uD83D\uDCA3","\uD83D\uDCA3","\uD83D\uDCA3","\uD83D\uDCA3",


    "\uD83C\uDF52","\uD83C\uDF52","\uD83C\uDF52","\uD83C\uDF52","\uD83C\uDF52","\uD83C\uDF52","\uD83C\uDF52","\uD83C\uDF52","\uD83C\uDF52","\uD83C\uDF52",
    "\uD83C\uDF49","\uD83C\uDF49", "\uD83C\uDF49","\uD83C\uDF49", "\uD83C\uDF49","\uD83C\uDF49", "\uD83C\uDF49","\uD83C\uDF49", "\uD83C\uDF49","\uD83C\uDF49",
    "\uD83E\uDD5D","\uD83E\uDD5D","\uD83E\uDD5D","\uD83E\uDD5D","\uD83E\uDD5D","\uD83E\uDD5D","\uD83E\uDD5D","\uD83E\uDD5D","\uD83E\uDD5D","\uD83E\uDD5D",

   "\uD83C\uDF47","\uD83C\uDF47","\uD83C\uDF47","\uD83C\uDF47","\uD83C\uDF47","\uD83C\uDF47","\uD83C\uDF47","\uD83C\uDF47","\uD83C\uDF47","\uD83C\uDF47",
   "\uD83C\uDF47","\uD83C\uDF47","\uD83C\uDF47","\uD83C\uDF47","\uD83C\uDF47","\uD83C\uDF47","\uD83C\uDF47","\uD83C\uDF47","\uD83C\uDF47","\uD83C\uDF47",
)

var pointsBalans = 0

class GameFragment : Fragment() {

 var pointsVin = 0


    val binding by lazy {
        FragmentGameBinding.inflate(layoutInflater)
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       listPlace =  randomColection(listPlace)
       binding.Breplay.setOnClickListener{ findNavController().navigate(R.id.action_gameFragment_to_menuFragment) }
       when(background){
        BACGROUND.BLACK -> {binding.CVbackground.setBackgroundResource(R.color.black)}
        BACGROUND.PINK -> {binding.CVbackground.setBackgroundResource(R.color.pink)}
        BACGROUND.GREEN -> {binding.CVbackground.setBackgroundResource(R.color.bluegreen)}
          else ->{}
       }

        binding.TVslot111DI.text = listPlace[0]
        binding.TVslot22DI.text = listPlace[1]
        binding.TVslot33DI.text = listPlace[2]
        binding.TVslot44DI.text = listPlace[3]
        binding.TVslot55DI.text = listPlace[5]
        binding.TVslot77DI.text = listPlace[6]
        binding.TVslot88DI.text = listPlace[7]
        binding.TVslot99DI.text = listPlace[8]
        binding.TVslot1010DI.text = listPlace[9]
        binding.TVslot1111DI.text = listPlace[10]
        binding.TVslot1313DI.text = listPlace[13]
        binding.TVslot1414DI.text = listPlace[15]
        binding.TVslot1515DI.text = listPlace[14]
        binding.TVslot1616DI.text = listPlace[16]
        binding.TVslot1717DI.text = listPlace[17]
        binding.TVslot1919DI.text = listPlace[18]
        binding.TVslot2020DI.text = listPlace[19]
        binding.TVslot2121DI.text = listPlace[20]
        binding.TVslot2222DI.text = listPlace[21]
        binding.TVslot2323DI.text = listPlace[22]
        binding.TVslot2525DI.text = listPlace[23]
        binding.TVslot2626DI.text = listPlace[24]
        binding.TVslot2727DI.text = listPlace[25]
        binding.TVslot2828DI.text = listPlace[26]
        binding.TVslot25top.text = listPlace[27]

        binding.TVslot111DIB.text = listPlace[28]
        binding.TVslot22DI.text = listPlace[29]
        binding.TVslot33DIB.text = listPlace[30]
        binding.TVslot44DIB.text = listPlace[31]
        binding.TVslot55DIB.text = listPlace[32]
        binding.TVslot77DIB.text = listPlace[32]
        binding.TVslot88DIB.text = listPlace[33]
        binding.TVslot99DIB.text = listPlace[34]
        binding.TVslot1010DIB.text = listPlace[35]
        binding.TVslot1111DIB.text = listPlace[36]
        binding.TVslot1313DIB.text = listPlace[37]
        binding.TVslot1414DIB.text = listPlace[38]
        binding.TVslot1515DIB.text = listPlace[39]
        binding.TVslot1616DIB.text = listPlace[40]
        binding.TVslot1717DIB.text = listPlace[17]
        binding.TVslot1919DIB.text = listPlace[18]
        binding.TVslot2020DIB.text = listPlace[19]
        binding.TVslot2121DIB.text = listPlace[20]
        binding.TVslot2222DIB.text = listPlace[21]
        binding.TVslot2323DIB.text = listPlace[22]
        binding.TVslot2525DIB.text = listPlace[23]
        binding.TVslot2626DIB.text = listPlace[24]
        binding.TVslot2727DIB.text = listPlace[25]
        binding.TVslot2828DIB.text = listPlace[26]
        binding.TVslot25topB.text = listPlace[27]

        binding.TVslot111DIM.text = listPlace[4]
        binding.TVslot22DIM.text = listPlace[1]
        binding.TVslot33DIM.text = listPlace[8]
        binding.TVslot44DIM.text = listPlace[3]
        binding.TVslot55DIM.text = listPlace[5]
        binding.TVslot77DIM.text = listPlace[6]
        binding.TVslot88DIM.text = listPlace[7]
        binding.TVslot99DIM.text = listPlace[8]
        binding.TVslot1010DIM.text = listPlace[9]
        binding.TVslot1111DIM.text = listPlace[10]
        binding.TVslot1313DIM.text = listPlace[13]
        binding.TVslot1414DIM.text = listPlace[15]
        binding.TVslot1515DIM.text = listPlace[14]
        binding.TVslot1616DIM.text = listPlace[16]
        binding.TVslot1717DIM.text = listPlace[17]
        binding.TVslot1919DIM.text = listPlace[18]
        binding.TVslot2020DIM.text = listPlace[19]
        binding.TVslot2121DIM.text = listPlace[20]
        binding.TVslot2222DIM.text = listPlace[21]
        binding.TVslot2323DIM.text = listPlace[22]
        binding.TVslot2525DIM.text = listPlace[23]
        binding.TVslot2626DIM.text = listPlace[24]
        binding.TVslot2727DIM.text = listPlace[25]
        binding.TVslot2828DIM.text = listPlace[26]
        binding.TVslot25topM.text = listPlace[27]


        binding.TVslot111DIE.text = listPlace[28]
        binding.TVslot22DIE.text = listPlace[29]
        binding.TVslot33DIE.text = listPlace[30]
        binding.TVslot44DIE.text = listPlace[32]
        binding.TVslot55DIE.text = listPlace[33]
        binding.TVslot77DIE.text = listPlace[34]
        binding.TVslot88DIE.text = listPlace[35]
        binding.TVslot99DIE.text = listPlace[36]
        binding.TVslot1010DIE.text = listPlace[37]
        binding.TVslot1111DIE.text = listPlace[38]
        binding.TVslot1313DIE.text = listPlace[39]
        binding.TVslot1414DIE.text = listPlace[40]
        binding.TVslot1515DIE.text = listPlace[21]
        binding.TVslot1616DIE.text = listPlace[22]
        binding.TVslot1717DIE.text = listPlace[23]
        binding.TVslot1919DIE.text = listPlace[24]
        binding.TVslot2020DIE.text = listPlace[25]
        binding.TVslot2121DIE.text = listPlace[26]
        binding.TVslot2222DIE.text = listPlace[21]
        binding.TVslot2323DIE.text = listPlace[22]
        binding.TVslot2525DIE.text = listPlace[23]
        binding.TVslot2626DIE.text = listPlace[24]
        binding.TVslot2727DIE.text = listPlace[1]
        binding.TVslot2828DIE.text = listPlace[1]
        binding.TVslot25topE.text = listPlace[2]


        binding.TVslot111DI.setOnClickListener{ animationCard(binding.TVslot111DI,binding.TVslot1DI) }
        binding.TVslot22DI.setOnClickListener{ animationCard(binding.TVslot22DI,binding.TVslot2DI)}
        binding.TVslot33DI.setOnClickListener{ animationCard(binding.TVslot33DI,binding.TVslot3DI)}
        binding.TVslot44DI.setOnClickListener{ animationCard(binding.TVslot44DI,binding.TVslot4DI)}
        binding.TVslot5DI.setOnClickListener{ animationCard(binding.TVslot55DI,binding.TVslot5DI)}
        binding.TVslot7DI.setOnClickListener{ animationCard(binding.TVslot77DI,binding.TVslot7DI)}
        binding.TVslot8DI.setOnClickListener{ animationCard(binding.TVslot88DI,binding.TVslot8DI)}
        binding.TVslot9DI.setOnClickListener{ animationCard(binding.TVslot99DI,binding.TVslot9DI)}
        binding.TVslot10DI.setOnClickListener{ animationCard(binding.TVslot1010DI,binding.TVslot10DI)}
        binding.TVslot11DI.setOnClickListener{ animationCard(binding.TVslot1111DI,binding.TVslot11DI)}
        binding.TVslot13DI.setOnClickListener{ animationCard(binding.TVslot1313DI,binding.TVslot13DI)}
        binding.TVslot14DI.setOnClickListener{ animationCard(binding.TVslot1414DI,binding.TVslot14DI)}
        binding.TVslot15DI.setOnClickListener{ animationCard(binding.TVslot1515DI,binding.TVslot15DI)}
        binding.TVslot16DI.setOnClickListener{ animationCard(binding.TVslot1616DI,binding.TVslot16DI)}
        binding.TVslot17DI.setOnClickListener{ animationCard(binding.TVslot1717DI,binding.TVslot17DI)}
        binding.TVslot19DI.setOnClickListener{ animationCard(binding.TVslot1919DI,binding.TVslot19DI)}
        binding.TVslot20DI.setOnClickListener{ animationCard(binding.TVslot2020DI,binding.TVslot20DI)}
        binding.TVslot21DI.setOnClickListener{ animationCard(binding.TVslot2121DI,binding.TVslot21DI)}
        binding.TVslot222DI.setOnClickListener{ animationCard(binding.TVslot2222DI,binding.TVslot222DI)}
        binding.TVslot23DI.setOnClickListener{ animationCard(binding.TVslot2323DI,binding.TVslot23DI)}
        binding.TVslot25DI.setOnClickListener{ animationCard(binding.TVslot2525DI,binding.TVslot25DI)}
        binding.TVslot26DI.setOnClickListener{ animationCard(binding.TVslot2626DI,binding.TVslot26DI)}
        binding.TVslot27DI.setOnClickListener{ animationCard(binding.TVslot2727DI,binding.TVslot27DI)}
        binding.TVslot28DI.setOnClickListener {animationCard(binding.TVslot2828DI, binding.TVslot28DI)}
        binding.TVslot25top.setOnClickListener { animationCard(binding.TVslot25top, binding.TVslot29DI)}

        binding.TVslot111DIB.setOnClickListener{ animationCard(binding.TVslot111DIB,binding.TVslot1DIB) }
        binding.TVslot22DIB.setOnClickListener{ animationCard(binding.TVslot22DIB,binding.TVslot2DIB)}
        binding.TVslot33DIB.setOnClickListener{ animationCard(binding.TVslot33DIB,binding.TVslot3DIB)}
        binding.TVslot44DIB.setOnClickListener{ animationCard(binding.TVslot44DIB,binding.TVslot4DIB)}
        binding.TVslot5DIB.setOnClickListener{ animationCard(binding.TVslot55DIB,binding.TVslot5DIB)}
        binding.TVslot7DIB.setOnClickListener{ animationCard(binding.TVslot77DIB,binding.TVslot7DIB)}
        binding.TVslot8DIB.setOnClickListener{ animationCard(binding.TVslot88DIB,binding.TVslot8DIB)}
        binding.TVslot9DIB.setOnClickListener{ animationCard(binding.TVslot99DIB,binding.TVslot9DIB)}
        binding.TVslot10DIB.setOnClickListener{ animationCard(binding.TVslot1010DIB,binding.TVslot10DIB)}
        binding.TVslot11DIB.setOnClickListener{ animationCard(binding.TVslot1111DIB,binding.TVslot11DIB)}
        binding.TVslot13DIB.setOnClickListener{ animationCard(binding.TVslot1313DIB,binding.TVslot13DIB)}
        binding.TVslot14DIB.setOnClickListener{ animationCard(binding.TVslot1414DIB,binding.TVslot14DIB)}
        binding.TVslot15DIB.setOnClickListener{ animationCard(binding.TVslot1515DIB,binding.TVslot15DIB)}
        binding.TVslot16DIB.setOnClickListener{ animationCard(binding.TVslot1616DIB,binding.TVslot16DIB)}
        binding.TVslot17DIB.setOnClickListener{ animationCard(binding.TVslot1717DIB,binding.TVslot17DIB)}
        binding.TVslot19DIB.setOnClickListener{ animationCard(binding.TVslot1919DIB,binding.TVslot19DIB)}
        binding.TVslot20DIB.setOnClickListener{ animationCard(binding.TVslot2020DIB,binding.TVslot20DIB)}
        binding.TVslot21DIB.setOnClickListener{ animationCard(binding.TVslot2121DIB,binding.TVslot21DIB)}
        binding.TVslot222DIB.setOnClickListener{ animationCard(binding.TVslot222DIB,binding.TVslot22DIB)}
        binding.TVslot23DIB.setOnClickListener{ animationCard(binding.TVslot2323DIB,binding.TVslot23DIB)}
        binding.TVslot25DIB.setOnClickListener{ animationCard(binding.TVslot2525DIB,binding.TVslot25DIB)}
        binding.TVslot26DIB.setOnClickListener{ animationCard(binding.TVslot2626DIB,binding.TVslot26DIB)}
        binding.TVslot27DIB.setOnClickListener{ animationCard(binding.TVslot2727DIB,binding.TVslot27DIB)}
        binding.TVslot28DIB.setOnClickListener {animationCard(binding.TVslot2828DIB, binding.TVslot28DIB)}
        binding.TVslot25topB.setOnClickListener { animationCard(binding.TVslot25topB, binding.TVslot29DIB)}

        binding.TVslot111DIM.setOnClickListener{ animationCard(binding.TVslot111DIM,binding.TVslot1DIM) }
        binding.TVslot22DIM.setOnClickListener{ animationCard(binding.TVslot22DIM,binding.TVslot2DIM)}
        binding.TVslot33DIM.setOnClickListener{ animationCard(binding.TVslot33DIM,binding.TVslot3DIM)}
        binding.TVslot44DIM.setOnClickListener{ animationCard(binding.TVslot44DIM,binding.TVslot4DIM)}
        binding.TVslot5DIM.setOnClickListener{ animationCard(binding.TVslot55DIM,binding.TVslot5DIM)}
        binding.TVslot7DIM.setOnClickListener{ animationCard(binding.TVslot77DIM,binding.TVslot7DIM)}
        binding.TVslot8DIM.setOnClickListener{ animationCard(binding.TVslot88DIM,binding.TVslot8DIM)}
        binding.TVslot9DIM.setOnClickListener{ animationCard(binding.TVslot99DIM,binding.TVslot9DIM)}
        binding.TVslot10DIM.setOnClickListener{ animationCard(binding.TVslot1010DIM,binding.TVslot10DIM)}
        binding.TVslot11DIM.setOnClickListener{ animationCard(binding.TVslot1111DIM,binding.TVslot11DIM)}
        binding.TVslot13DIM.setOnClickListener{ animationCard(binding.TVslot1313DIM,binding.TVslot13DIM)}
        binding.TVslot14DIM.setOnClickListener{ animationCard(binding.TVslot1414DIM,binding.TVslot14DIM)}
        binding.TVslot15DIM.setOnClickListener{ animationCard(binding.TVslot1515DIM,binding.TVslot15DIM)}
        binding.TVslot16DIM.setOnClickListener{ animationCard(binding.TVslot1616DIM,binding.TVslot16DIM)}
        binding.TVslot17DIM.setOnClickListener{ animationCard(binding.TVslot1717DIM,binding.TVslot17DIM)}
        binding.TVslot19DIM.setOnClickListener{ animationCard(binding.TVslot1919DIM,binding.TVslot19DIM)}
        binding.TVslot20DIM.setOnClickListener{ animationCard(binding.TVslot2020DIM,binding.TVslot20DIM)}
        binding.TVslot21DIM.setOnClickListener{ animationCard(binding.TVslot2121DIM,binding.TVslot21DIM)}
        binding.TVslot222DIM.setOnClickListener{ animationCard(binding.TVslot222DIM,binding.TVslot22DIM)}
        binding.TVslot23DIM.setOnClickListener{ animationCard(binding.TVslot2323DIM,binding.TVslot23DIM)}
        binding.TVslot25DIM.setOnClickListener{ animationCard(binding.TVslot2525DIM,binding.TVslot25DIM)}
        binding.TVslot26DIM.setOnClickListener{ animationCard(binding.TVslot2626DIM,binding.TVslot26DIM)}
        binding.TVslot27DIM.setOnClickListener{ animationCard(binding.TVslot2727DIM,binding.TVslot27DIM)}
        binding.TVslot28DIM.setOnClickListener {animationCard(binding.TVslot2828DIM, binding.TVslot28DIM)}
        binding.TVslot25topM.setOnClickListener { animationCard(binding.TVslot25topM, binding.TVslot29DIM)}

        binding.TVslot111DIE.setOnClickListener{ animationCard(binding.TVslot111DIE,binding.TVslot1DIE) }
        binding.TVslot22DIE.setOnClickListener{ animationCard(binding.TVslot22DIE,binding.TVslot2DIE)}
        binding.TVslot33DIE.setOnClickListener{ animationCard(binding.TVslot33DIE,binding.TVslot3DIE)}
        binding.TVslot44DIE.setOnClickListener{ animationCard(binding.TVslot44DIE,binding.TVslot4DIE)}
        binding.TVslot5DIE.setOnClickListener{ animationCard(binding.TVslot55DIE,binding.TVslot5DIE)}
        binding.TVslot7DIE.setOnClickListener{ animationCard(binding.TVslot77DIE,binding.TVslot7DIE)}
        binding.TVslot8DIE.setOnClickListener{ animationCard(binding.TVslot88DIE,binding.TVslot8DIE)}
        binding.TVslot9DIE.setOnClickListener{ animationCard(binding.TVslot99DIE,binding.TVslot9DIE)}
        binding.TVslot10DIE.setOnClickListener{ animationCard(binding.TVslot1010DIE,binding.TVslot10DIE)}
        binding.TVslot11DIE.setOnClickListener{ animationCard(binding.TVslot1111DIE,binding.TVslot11DIE)}
        binding.TVslot13DIE.setOnClickListener{ animationCard(binding.TVslot1313DIE,binding.TVslot13DIE)}
        binding.TVslot14DIE.setOnClickListener{ animationCard(binding.TVslot1414DIE,binding.TVslot14DIE)}
        binding.TVslot15DIE.setOnClickListener{ animationCard(binding.TVslot1515DIE,binding.TVslot15DIE)}
        binding.TVslot16DIE.setOnClickListener{ animationCard(binding.TVslot1616DIE,binding.TVslot16DIE)}
        binding.TVslot17DIE.setOnClickListener{ animationCard(binding.TVslot1717DIE,binding.TVslot17DIE)}
        binding.TVslot19DIE.setOnClickListener{ animationCard(binding.TVslot1919DIE,binding.TVslot19DIE)}
        binding.TVslot20DIE.setOnClickListener{ animationCard(binding.TVslot2020DIE,binding.TVslot20DIE)}
        binding.TVslot21DIE.setOnClickListener{ animationCard(binding.TVslot2121DIE,binding.TVslot21DIE)}
        binding.TVslot222DIE.setOnClickListener{ animationCard(binding.TVslot222DIE,binding.TVslot22DI)}
        binding.TVslot23DIE.setOnClickListener{ animationCard(binding.TVslot2323DIE,binding.TVslot23DIE)}
        binding.TVslot25DIE.setOnClickListener{ animationCard(binding.TVslot2525DIE,binding.TVslot25DIE)}
        binding.TVslot26DIE.setOnClickListener{ animationCard(binding.TVslot2626DIE,binding.TVslot26DIE)}
        binding.TVslot27DIE.setOnClickListener{ animationCard(binding.TVslot2727DIE,binding.TVslot27DIE)}
        binding.TVslot28DIE.setOnClickListener {animationCard(binding.TVslot2828DIE, binding.TVslot28DIE)}
        binding.TVslot25topE.setOnClickListener { animationCard(binding.TVslot25topE, binding.TVslot29DIE)}

       binding.TVvin.text = "your win "

        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root
    }

    fun randomColection(randomCalection:ArrayList<String>) : ArrayList<String> {
        var index = 0
        var str = ""
        val random = randomCalection

        for (dsjkdsjAA in 0..random.size-1) {
            index = (0..random.size-1).random()
            str = random[dsjkdsjAA]
            random[dsjkdsjAA] = random[index]
            random[index] = str

        }
        return random
    }


 fun animationCard(tvTop: TextView, tvBack: TextView) {


  val anim2 = ObjectAnimator.ofFloat(tvBack, View.SCALE_Y, 0F)
  anim2.duration = 100
  anim2.start()
  Handler(Looper.getMainLooper()).postDelayed({
   val anim2 = ObjectAnimator.ofFloat(tvTop, View.SCALE_Y, 1F)
   anim2.duration = 100
   anim2.start()
  }, 100)

  Log.d("testtest",tvTop.text.toString())
  if(tvTop.text.toString() == "\uD83D\uDCA3"){
   Handler(Looper.getMainLooper()).postDelayed({
    binding.TVvin.text = "your win $pointsVin"
    binding.TVwin.text = "your win $pointsVin"
    binding.CVwin.isVisible = true
   },2000L)
  }else{
   ++pointsVin
   ++pointsBalans
  }
 }

}