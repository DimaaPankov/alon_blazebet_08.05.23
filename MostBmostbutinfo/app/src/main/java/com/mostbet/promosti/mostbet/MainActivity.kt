package com.mostbet.promosti.mostbet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.mostbet.promosti.mostbet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var sdlfdhdfhjss: NavController
    var mdshjkdsmsss = {}
    val skldjsksss by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(skldjsksss.root)
        dskjdksss.init(this)
         kdsjdsss = this
         sdlfdhdfhjss = Navigation.findNavController(this, R.id.nav_host_fragment)
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

    override fun onBackPressed() {
  mdshjkdsmsss()
    }

}