package com.apps.tz.rainbowgoldstation.black

import android.graphics.Bitmap
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.*
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.apps.tz.rainbowgoldstation.R
import com.apps.tz.rainbowgoldstation.activity.MainActivity
import com.apps.tz.rainbowgoldstation.databinding.WebViewFragmentBinding
import com.apps.tz.rainbowgoldstation.shared.SharedPrefs


class WebViewFragment : Fragment() {
    val binding by lazy { WebViewFragmentBinding.inflate(layoutInflater) }
    var redict = false
    var isGoToGame = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (requireContext() as MainActivity).goBack = {}

        val client = WebChromeClient()
        binding.vebview.setWebChromeClient(client)


        with(binding.vebview) {
            (requireContext() as MainActivity).goBack = { goBack() }
            settings.loadsImagesAutomatically = true
            webViewClient = MyWeb()
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


    inner class MyWeb : WebViewClient() {

        override fun onReceivedError(
            view: WebView?,
            request: WebResourceRequest?,
            error: WebResourceError?
        ) {
            super.onReceivedError(view, request, error)
        }

        override fun onReceivedHttpError(
            view: WebView?,
            request: WebResourceRequest?,
            errorResponse: WebResourceResponse?
        ) {
            if (errorResponse?.statusCode == 404) {
                findNavController().navigate(R.id.action_WebViewFragment_to_gameFragment)
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
             binding.zug.isVisible = false
            SharedPrefs(requireContext()).setStatus(SharedPrefs.STATUS_OPEN_URL)
            SharedPrefs(requireContext()).setUrl(mainUrl)
        }
    }

}