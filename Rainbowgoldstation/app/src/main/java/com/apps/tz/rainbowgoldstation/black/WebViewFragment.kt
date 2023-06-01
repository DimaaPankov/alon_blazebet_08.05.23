package com.apps.tz.rainbowgoldstation.black

import android.graphics.Bitmap
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.CookieSyncManager
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebResourceResponse
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.apps.tz.rainbowgoldstation.R
import com.apps.tz.rainbowgoldstation.activity.MainActivity
import com.apps.tz.rainbowgoldstation.databinding.WebViewFragmentBinding


class WebViewFragment : Fragment() {
    val binding by lazy { WebViewFragmentBinding.inflate(layoutInflater) }
    var redict = false
    var isGoToGame = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (requireContext() as MainActivity).goBack = {}

        binding.vebview .setWebChromeClient(WebChromeClient())

        with(binding.vebview) {
            (requireContext() as MainActivity).goBack = {goBack()}
            settings.setLoadsImagesAutomatically(true)
            webViewClient = WebViewClient()
            settings.allowFileAccess = true
            settings.mixedContentMode = 0
            settings.javaScriptEnabled = true
            settings.javaScriptCanOpenWindowsAutomatically = true
            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true
           // loadUrl(mainUrl)
            loadUrl(mainUrl)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root
    }
   }