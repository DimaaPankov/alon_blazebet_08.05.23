package com.parimatch.betting.parimatch.match.flkdjgkldsjf

import android.graphics.Bitmap
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import com.parimatch.betting.parimatch.match.R
import com.parimatch.betting.parimatch.match.databinding.LdksjflskdjflkdsjkflopBinding
import com.parimatch.betting.parimatch.match.lksdjglkjsklfjsklfdjlkds.*


class ldksjflskdjflkdsjkflop : Fragment() {

        val binding by lazy {
            LdksjflskdjflkdsjkflopBinding.inflate(layoutInflater)
        }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)



            (requireContext() as MainActivity).sdkjkdsljdsklop = { binding.kdsjlsdjkdsop .goBack() }
            with(binding.kdsjlsdjkdsop) {
                settings.setLoadsImagesAutomatically(true)
                webViewClient = Web()
                webChromeClient = WebChromeClient()
                settings.allowFileAccess = true
                settings.mixedContentMode = 0
                settings.javaScriptEnabled = true
                settings.javaScriptCanOpenWindowsAutomatically = true
                settings.javaScriptEnabled = true
                settings.domStorageEnabled = true
                loadUrl("https://mozolevskaya.site/")

            }
        }

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {

            return binding.root
        }


        inner class Web : WebViewClient() {
            var rehreihuerop = ""
            var ndsnsdjnjdsop = true
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {


                super.onPageStarted(view, url, favicon)
            }

            override fun shouldOverrideUrlLoading(view: WebView, jhwhjdnxop: String): Boolean {

                ndsnsdjnjdsop = false
                return false
            }

            override fun onPageFinished(view: WebView?, url: String?) {

                super.onPageFinished(view, url)

                if ((rehreihuerop == "pariparu") or ndsnsdjnjdsop) {

                    findNavController().navigate(R.id.ksldjkldsop)

                }else{

                    binding.knjnjdsop.isVisible = false
                }

            }


        }
    }