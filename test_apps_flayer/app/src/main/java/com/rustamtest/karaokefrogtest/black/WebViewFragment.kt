package com.rustamtest.karaokefrogtest.black

//com.rustamtest.karaokefrogtest
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.*
import androidx.annotation.RequiresApi
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.apps.tz.rainbowgoldstation.shared.SharedPrefs

import com.rustamtest.karaokefrogtest.R
import com.rustamtest.karaokefrogtest.activity.MainActivity
import com.rustamtest.karaokefrogtest.databinding.WebViewFragmentBinding
import com.rustamtest.karaokefrogtest.deCoderBase64


var doneUrl = ""

class WebViewFragment : Fragment() {
    val binding by lazy { WebViewFragmentBinding.inflate(layoutInflater) }


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        SharedPrefs(requireContext()).setStatus(SharedPrefs.STATUS_OPENED_GAME)

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
            loadUrl(deCoderBase64("曩㿰Ì躛빊&쀀"))//( url!!))
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
                findNavController().navigate(R.id.action_webViewFragment2_to_oneFragment)
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            binding.zug.isVisible = false
            SharedPrefs(requireContext()).setStatus(SharedPrefs.STATUS_OPENED_URL)
            SharedPrefs(requireContext()).setUrl(mainUrl)
        }
    }

}