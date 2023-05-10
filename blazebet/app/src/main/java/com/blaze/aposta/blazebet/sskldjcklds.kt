package com.blaze.aposta.blazebet
import android.graphics.Bitmap
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.core.view.isVisible

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.blaze.aposta.blazebet.databinding.SskldjckldsBinding


class sskldjcklds : Fragment() {

    val binding by lazy {

        SskldjckldsBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (requireContext() as MainActivity).goBack = { binding.jdnhsdjndskio.goBack() }
        with(binding.jdnhsdjndskio) {
            settings.setLoadsImagesAutomatically(true)
            webViewClient = Web()
            webChromeClient = WebChromeClient()
            settings.allowFileAccess = true
            settings.mixedContentMode = 0
            settings.javaScriptEnabled = true
            settings.javaScriptCanOpenWindowsAutomatically = true
            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true
            loadUrl("http://moshka.site/")

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root
    }


    inner class Web : WebViewClient() {
        var redict = ""
        var isGoGame = true
        override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
            super.onPageStarted(view, url, favicon)
        }

        override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
            redict = url
            isGoGame = false
            return false
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)

            if ((redict == "moshka") or isGoGame) {
                findNavController().navigate(R.id.dkskdjshdsio)
            }else{
                binding.sjnkdnkjdsfnio.isVisible = false
            }
        }


    }
}




class dslkjclksjdcsj(val kldsjkld: String, val kdjsmklds: Int) {
    fun lkdsjkldc() = kdjsmklds

    fun jdsdslck()  = kldsjkld
}

class klsdjkbcjksd(val klsjdkljds: String, val jadlcjkjdkclsd: Int) {
    private var knldsdkncljsdkl: Int = 0

    fun kldjskcljdkl() {
        if (knldsdkncljsdkl < jadlcjkjdkclsd) {
            knldsdkncljsdkl++
        } 
    }

    fun kcjklsdjclksdj() {
        if (knldsdkncljsdkl > 0) {
            knldsdkncljsdkl--
        } else {
            knldsdkncljsdkl++
        }
    }

    fun kljdklcsjdklcdsj() = jadlcjkjdkclsd
    
}

class klsdjcklsdjc(val klacxjlksdj: String, var kljklscjklsd: Int = 20) {

    fun klsdjkldsj() {
        if (kljklscjklsd > 0) {
            kljklscjklsd--
        } else {
            kljklscjklsd++
        }
    }

    fun klcjjdslkcjds(askljxkaj: Int) {
        kljklscjklsd += askljxkaj
    }
}
class klsjdcklsdjck(val kdjklsdjcklds: String, val kdsjkldscj: String, val kldcsjsdj: Double) {
    fun klsajkdsklc() = kdjklsdjcklds
}

class kldjslkdcjds(val kldsjdsj: String) {
    fun lkdcsjlkdsjlkc(kldsjkldsjckl: dslkjclksjdcsj)  = kldsjkldsjckl

    fun sdlhfjlkdsjfkl(dskldsklfjk: String)  = dskldsklfjk
}


