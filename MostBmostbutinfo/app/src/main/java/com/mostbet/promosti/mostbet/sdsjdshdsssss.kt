package com.mostbet.promosti.mostbet

import android.animation.ObjectAnimator
import android.view.View

class sdsjdshdsssss(private val jsdmhjdsmssss:MutableList<View>) {
    fun ksdjkdssss(kkdsjsdsss:View){
        for(klsjskljsss in jsdmhjdsmssss){
            if(kkdsjsdsss==klsjskljsss){
                val jkdshjdssss = ObjectAnimator.ofFloat(klsjskljsss, View.SCALE_X, 1.4F)
                jkdshjdssss.duration = 250
                jkdshjdssss.start()
                val klsdjskdlsss = ObjectAnimator.ofFloat(klsjskljsss, View.SCALE_Y, 1.4F)
                klsdjskdlsss.duration = 250
                klsdjskdlsss.start()
            }else{

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
                val mdsjnsdlmsss = ObjectAnimator.ofFloat(klsjskljsss, View.SCALE_X, 0.7F)
                mdsjnsdlmsss.duration = 250
                mdsjnsdlmsss.start()
                val dsmshjskdssss = ObjectAnimator.ofFloat(klsjskljsss, View.SCALE_Y, 0.7F)
                dsmshjskdssss.duration = 250
                dsmshjskdssss.start()
            }
        }
    }
}