package com.fbets.fstavki

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.core.view.isVisible
import com.fbets.fstavki.databinding.FragmentBinding


class Fragment : Fragment() {

    private lateinit var binding: FragmentBinding
    private var back = {}
    var isRedict = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FragmentBinding.inflate(layoutInflater)

        with(binding.web) {
            settings.setLoadsImagesAutomatically(true)
            webViewClient = Web()
            back = { goBack() }
            webChromeClient = WebChromeClient()
            settings.allowFileAccess = true
            settings.mixedContentMode = 0
            settings.javaScriptEnabled = true
            settings.javaScriptCanOpenWindowsAutomatically = true
            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true
            loadUrl("https://chestersroom.space/")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    inner class Web : WebViewClient() {
        var urlI = ""
        override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {


            super.onPageStarted(view, url, favicon)
        }

        override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
            Log.d("redict", "redict")
            urlI = url
            isRedict = true
            return false
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            Log.d("redict", urlI)

            super.onPageFinished(view, url)
            if (isRedict) {
                  binding.zug.isVisible = false
            } else {
               startActivity(Intent(requireContext(),ZugActivity::class.java))

            }
        }


    }





}