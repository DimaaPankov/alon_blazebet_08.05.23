package com.mostbet.promosti.mostbet

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences


object dskjdksss {

    private const val PREFS_FILE = "Account"
    private const val LANGAUGE = "L"
    private const val SOUND = "S"
    private const val BESTRESULT = "BR"
    lateinit var context:Context
    var settings: SharedPreferences? = null


   fun init(context: Context) {
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
       dskjdksss.context = context
        settings =  (context).getSharedPreferences(PREFS_FILE, MODE_PRIVATE);
    }



    fun saveSound(i:Boolean) {
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
        settings!!.edit().putBoolean(SOUND, i).apply();
    }

    fun dskssss() = settings!!.getBoolean(SOUND,true)



}

