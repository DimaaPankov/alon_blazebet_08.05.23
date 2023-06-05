package com.apps.tz.rainbowgoldstation.gamescreens

import android.animation.ObjectAnimator
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.apps.tz.rainbowgoldstation.R
import com.apps.tz.rainbowgoldstation.databinding.FragmentGameThreeBinding
import com.apps.tz.rainbowgoldstation.shared.SharedPrefs
import com.google.zxing.BarcodeFormat
import com.google.zxing.MultiFormatWriter
import com.google.zxing.WriterException
import com.journeyapps.barcodescanner.BarcodeEncoder

var timer = ""

class GameThreeFragment : Fragment() {


    var sumSecond  = 10800L
    var second = 59L
    var minuts = 59L
    var hours = 2L
    var qrCode = ""
    val listPassword = listOf("JK8LPP","JJH34","JGK0","LOP43","JPO12","LZA345","VBF209"
        ,"EHDH23","3HD789","47HDI","YCHH45","DOPB59","D803J","FJK567","WHUE01","AKS01")





    val binding by lazy{ FragmentGameThreeBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        SharedPrefs(requireContext()).setStatus(SharedPrefs.STATUS_OPEN_SCREEN_THREE)
       timerAnimation()


            //binding.ETpassword.setOnClickListener{}

        binding.Bplay.setOnClickListener{
            binding.Bplay.isClickable = false
            generateQR()

            Handler(Looper.getMainLooper()).postDelayed({
                val animator0 = ObjectAnimator.ofFloat(binding.TVcode, View.ALPHA, 0F)
                animator0.duration = 330L
                animator0.start()
            },4000)

            val animator0 = ObjectAnimator.ofFloat(binding.IVqr, View.ALPHA, 1F)
            animator0.duration = 330L
            animator0.start()

         val animator = ObjectAnimator.ofFloat(binding.Bplay, View.ALPHA, 0F)
            animator.duration = 330L
            animator.start()



            Handler(Looper.getMainLooper()).postDelayed({

                val animator2 = ObjectAnimator.ofFloat(binding.IVzzz, View.ROTATION, 45F)
                animator2.duration = 330L
                animator2.start()

                val animator3 = ObjectAnimator.ofFloat(binding.IVz, View.ROTATION, 45F)
                animator3.duration = 330L
                animator3.start()

                val animator = ObjectAnimator.ofFloat(binding.CVbackGreen, View.Y, 400F)
                animator.duration = 1000
                animator.start()

                val animator4 = ObjectAnimator.ofFloat(binding.IVzzz, View.Y, 400F)
                animator4.duration = 1000
                animator4.start()

                val animator5 = ObjectAnimator.ofFloat(binding.IVz, View.Y, 350F)
                animator5.duration = 1000
                animator5.start()
            },330L)
        }



        Handler(Looper.getMainLooper()).postDelayed({
       object: CountDownTimer(10800000L, 1000L){
           override fun onTick(p0: Long) {

               if ((second==0L) or (second==1L) or (second==2L) or (second==3L) or (second==4L) or (second==5L)
                       or (second==6L) or (second==7L) or (second==8L) or (second==9L)){
                   timer = "0$hours:$minuts:0$second"
                   binding.TVtimer.text = timer
                   if ((minuts==0L) or (minuts==1L) or (minuts==2L) or (minuts==3L) or (minuts==4L) or (minuts==5L)
                       or (minuts==6L) or (minuts==7L) or (minuts==8L) or (minuts==9L)){
                       timer = "$hours:0$minuts:0$second"
                       binding.TVtimer.text = "$hours:0$minuts:0$second"
                   }else{
                       timer = "$hours:$minuts:0$second"
                       binding.TVtimer.text = "$hours:$minuts:0$second"
                   }
               }else{
                   timer = "0$hours:$minuts:$second"
                   binding.TVtimer.text = "0$hours:$minuts:$second"
                   if ((minuts==0L) or (minuts==1L) or (minuts==2L) or (minuts==3L) or (minuts==4L) or (minuts==5L)
                       or (minuts==6L) or (minuts==7L) or (minuts==8L) or (minuts==9L)){
                       timer = "$hours:0$minuts:$second"
                       binding.TVtimer.text = "$hours:0$minuts:$second"
                   }else{
                       timer = "$hours:$minuts:$second"
                       binding.TVtimer.text = "$hours:$minuts:$second"
                   }
               }

               --second
               if(second==-1L){
                   --minuts
                   second=59

               }
               if(minuts==-1L){
                   --hours
                   minuts=59
               }
               if((second == -1L) and (minuts == -1L) and (hours == -1L) ){
                   binding.TVtimer.text = "time's up"
               }

           }

           override fun onFinish() {

           }

       }.start()
                                                    },1000L)

        binding.CVback.setOnClickListener {
            binding.Bplay.isClickable = true

            val animator2 = ObjectAnimator.ofFloat(binding.IVzzz, View.ROTATION, 0F)
            animator2.duration = 330L
            animator2.start()

            val animator3 = ObjectAnimator.ofFloat(binding.IVz, View.ROTATION, 0F)
            animator3.duration = 330L
            animator3.start()

            val animator = ObjectAnimator.ofFloat(binding.CVbackGreen, View.Y, 1800F)
            animator.duration = 1000
            animator.start()

            val animator4 = ObjectAnimator.ofFloat(binding.IVzzz, View.Y, 990F)
            animator4.duration = 1000
            animator4.start()

            val animator5 = ObjectAnimator.ofFloat(binding.IVz, View.Y, 900F)
            animator5.duration = 1000
            animator5.start()

            val animator6 = ObjectAnimator.ofFloat(binding.IVqr, View.ALPHA, 0F)
            animator6.duration = 1000
            animator6.start()

            val animator7 = ObjectAnimator.ofFloat(binding.Bplay, View.ALPHA, 1F)
            animator7.duration = 1000
            animator7.start()
        clickAnimationBack()

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root
    }

    private fun generateQR() {
        qrCode = """{"computer":"${SharedPrefs(requireContext()).getComputer()}","timer":"0$timer","code":"${SharedPrefs(requireContext()).getCod()}"}"""
        val writer = MultiFormatWriter()
        try {
            val matrix = writer.encode(qrCode, BarcodeFormat.QR_CODE, 600, 600)
            val encoder = BarcodeEncoder()
            val bitmap = encoder.createBitmap(matrix)
            binding.IVqr.setImageBitmap(bitmap)
        } catch (e: WriterException) {
            e.printStackTrace()
        }
    }

    private fun clickAnimationBack(){
        val animator = ObjectAnimator.ofFloat(binding.CVback, View.SCALE_Y, 5F)
        animator.duration = 1000
        animator.start()

        val animator2 = ObjectAnimator.ofFloat(binding.CVback, View.SCALE_X, 5F)
        animator2.duration = 1000
        animator2.start()

        Handler(Looper.getMainLooper()).postDelayed({
            val animator3 = ObjectAnimator.ofFloat(binding.CVbackTop, View.ALPHA, 1F)
            animator3.duration = 500
            animator3.start()
        }, 500L)

        Handler(Looper.getMainLooper()).postDelayed({
            val animator3 = ObjectAnimator.ofFloat(binding.CVbackTop, View.ALPHA, 0F)
            animator3.duration = 500
            animator3.start()

            val animator = ObjectAnimator.ofFloat(binding.CVback, View.SCALE_Y, 1F)
            animator.duration = 1000
            animator.start()

            val animator2 = ObjectAnimator.ofFloat(binding.CVback, View.SCALE_X, 1F)
            animator2.duration = 1000
            animator2.start()

        }, 1500L)
    }

    private fun timerAnimation() {
        var listImg = listOf(R.drawable.icon,R.drawable.icon_two,R.drawable.icon_three,R.drawable.icon_four,R.drawable.icon_six)



        var second = 0L
        repeat(6001) {
            second=second+1000L
            Handler(Looper.getMainLooper()).postDelayed({

                    val animator = ObjectAnimator.ofFloat(binding.IVleftTop, View.SCALE_X, 1F)
                    animator.duration = 250
                    animator.start()

                    val animator2 = ObjectAnimator.ofFloat(binding.IVcenterTop, View.SCALE_X, 1F)
                    animator2.duration = 250
                    animator2.start()

                    val animator3 = ObjectAnimator.ofFloat(binding.IVrightTop, View.SCALE_X, 1F)
                    animator3.duration = 250
                    animator3.start()
            //    }, 500)



                Handler(Looper.getMainLooper()).postDelayed({



                    val animator = ObjectAnimator.ofFloat(binding.IVleftTop, View.SCALE_X, 0F)
                    animator.duration = 250
                    animator.start()

                    val animator2 = ObjectAnimator.ofFloat(binding.IVcenterTop, View.SCALE_X, 0F)
                    animator2.duration = 250
                    animator2.start()

                    val animator3 = ObjectAnimator.ofFloat(binding.IVrightTop, View.SCALE_X, 0F)
                    animator3.duration = 250
                    animator3.start()



                }, 500)
                Handler(Looper.getMainLooper()).postDelayed({
                    binding.IVleftTop.setImageResource(listImg.random())
                    binding.IVcenterTop.setImageResource(listImg.random())
                    binding.IVrightTop.setImageResource(listImg.random())
                },1000)
            }, second)
        }

    }
    }

