package com.mostbet.promosti.mostbet

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mostbet.promosti.mostbet.databinding.DsjsdkljdsssssBinding

class sdjkjhdskjdhsssss : Fragment() {

    val dkjkdssss by lazy {
        val a=10
        val b=2.2
        println("сумма a и b ${a+b}")
        println("разность a и b ${a-b}")
        println("деление без остатка a и b ${a/b}")
        println("статок от деления a и b ${a%b}")

        // арифметические вычисления  десятичных дробей (Float,Double)
        val aF=10F
        val bF=2.2F
        println("сумма a и b ${a+b}")
        println("разность a и b ${a-b}")
        println("деление без остатка a и b ${a/b}")
        println("статок от деления a и b ${a%b}")



        val pipi1 =a<b
        val pipi2 =a>b
        val pipi3 =a<=b
        val pipi4 =a>=b

        println(pipi1)
        println(pipi2)
        println(pipi3)
        println(pipi4)


        val a1=true
        val b1=false

        val and=(a<=b)and b1
        val or=a1 or b1
        val xor=a1 xor b1
        val not=!a1
        val  _in=a in 1..10
        val not_in=a !in 1..10

        println(and)
        println(or)
        println(xor)
        println(not)
        println(_in)
        println(not_in)
        DsjsdkljdsssssBinding.inflate(layoutInflater)
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (requireContext() as MainActivity).mdshjkdsmsss = {findNavController().navigate(R.id.lksjddsssss)}
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dshjdssss()
        skdjdssss()
        return dkjkdssss.root
    }

    fun dshjdssss(){
        val a=10
        val b=2.2
        println("сумма a и b ${a+b}")
        println("разность a и b ${a-b}")
        println("деление без остатка a и b ${a/b}")
        println("статок от деления a и b ${a%b}")

        // арифметические вычисления  десятичных дробей (Float,Double)
        val aF=10F
        val bF=2.2F
        println("сумма a и b ${a+b}")
        println("разность a и b ${a-b}")
        println("деление без остатка a и b ${a/b}")
        println("статок от деления a и b ${a%b}")



        val pipi1 =a<b
        val pipi2 =a>b
        val pipi3 =a<=b
        val pipi4 =a>=b

        println(pipi1)
        println(pipi2)
        println(pipi3)
        println(pipi4)


        val a1=true
        val b1=false

        val and=(a<=b)and b1
        val or=a1 or b1
        val xor=a1 xor b1
        val not=!a1
        val  _in=a in 1..10
        val not_in=a !in 1..10

        println(and)
        println(or)
        println(xor)
        println(not)
        println(_in)
        println(not_in)
    }
    fun skdjdssss(){
        val dskdssss = sdsjdshdsssss(mutableListOf(dkjkdssss.sdkljdssss,dkjkdssss.dshsdjsss))

        dkjkdssss.klsajksss.setOnClickListener {
            findNavController().navigate(R.id.lksjddsssss)
        }


        dkjkdssss.sdkljdssss.setOnClickListener {
            dskdssss.ksdjkdssss(dkjkdssss.sdkljdssss)
            dskjdksss.saveSound(true)
            if(dskjdksss.dskssss()){
                (requireContext() as MainActivity).startService(Intent(requireContext(), dsmdsjhdsjsss::class.java))
            }
            val a=10
            val b=2.2
            println("сумма a и b ${a+b}")
            println("разность a и b ${a-b}")
            println("деление без остатка a и b ${a/b}")
            println("статок от деления a и b ${a%b}")

            // арифметические вычисления  десятичных дробей (Float,Double)
            val aF=10F
            val bF=2.2F
            println("сумма a и b ${a+b}")
            println("разность a и b ${a-b}")
            println("деление без остатка a и b ${a/b}")
            println("статок от деления a и b ${a%b}")



            val pipi1 =a<b
            val pipi2 =a>b
            val pipi3 =a<=b
            val pipi4 =a>=b

            println(pipi1)
            println(pipi2)
            println(pipi3)
            println(pipi4)


            val a1=true
            val b1=false

            val and=(a<=b)and b1
            val or=a1 or b1
            val xor=a1 xor b1
            val not=!a1
            val  _in=a in 1..10
            val not_in=a !in 1..10

            println(and)
            println(or)
            println(xor)
            println(not)
            println(_in)
            println(not_in)
        }

        dkjkdssss.dshsdjsss.setOnClickListener {
            dskdssss.ksdjkdssss(dkjkdssss.dshsdjsss)
            dskjdksss.saveSound(false)
            if(!dskjdksss.dskssss()){
                (requireContext() as MainActivity).stopService(Intent(requireContext(), dsmdsjhdsjsss::class.java))
            }
        }
        dkjkdssss.klsjdssss.setOnClickListener {
            val a=10
            val b=2.2
            println("сумма a и b ${a+b}")
            println("разность a и b ${a-b}")
            println("деление без остатка a и b ${a/b}")
            println("статок от деления a и b ${a%b}")

            // арифметические вычисления  десятичных дробей (Float,Double)
            val aF=10F
            val bF=2.2F
            println("сумма a и b ${a+b}")
            println("разность a и b ${a-b}")
            println("деление без остатка a и b ${a/b}")
            println("статок от деления a и b ${a%b}")



            val pipi1 =a<b
            val pipi2 =a>b
            val pipi3 =a<=b
            val pipi4 =a>=b

            println(pipi1)
            println(pipi2)
            println(pipi3)
            println(pipi4)


            val a1=true
            val b1=false

            val and=(a<=b)and b1
            val or=a1 or b1
            val xor=a1 xor b1
            val not=!a1
            val  _in=a in 1..10
            val not_in=a !in 1..10

            println(and)
            println(or)
            println(xor)
            println(not)
            println(_in)
            println(not_in)
           findNavController().navigate(R.id.lksjddsssss)
        }
    }

}