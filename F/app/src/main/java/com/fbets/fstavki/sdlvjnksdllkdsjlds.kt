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
import com.fbets.fstavki.databinding.SdlvjnksdllkdsjldsBinding


class sdlvjnksdllkdsjlds : Fragment() {

    private lateinit var jsdmlkjgdjfglkfdjgxc: SdlvjnksdllkdsjldsBinding
    private var lfkdjlkvjdfkljkl = {}
    var kdsljfdlkgjklsgjklsd = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        jsdmlkjgdjfglkfdjgxc = SdlvjnksdllkdsjldsBinding.inflate(layoutInflater)

        with(jsdmlkjgdjfglkfdjgxc.fsdhgjklkjdhfkjfdhgkj) {
            settings.setLoadsImagesAutomatically(true)
            webViewClient = hjdsfklhklfdhkgf()
            lfkdjlkvjdfkljkl = { goBack() }
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
        return jsdmlkjgdjfglkfdjgxc.root
    }

    inner class hjdsfklhklfdhkgf : WebViewClient() {
        var kdsfhgjkdfghkjdf = ""
        override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {


            super.onPageStarted(view, url, favicon)
        }

        override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
            kdsljfdlkgjklsgjklsd = true
            Log.d("ddddddddddd","ssssssssssssssss")
            return false
        }

        override fun onPageFinished(view: WebView?, url: String?) {

            super.onPageFinished(view, url)
            if (kdsljfdlkgjklsgjklsd) {
                  jsdmlkjgdjfglkfdjgxc.dlksjflkfsgjksjf.isVisible = false
            } else {
               startActivity(Intent(requireContext(),ZugActivity::class.java))

            }
        }


    }





}