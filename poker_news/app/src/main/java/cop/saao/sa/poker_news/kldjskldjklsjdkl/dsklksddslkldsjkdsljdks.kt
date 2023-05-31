package cop.saao.sa.poker_news.kldjskldjklsjdkl

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
import cop.saao.sa.poker_news.MainActivity
import cop.saao.sa.poker_news.R
import cop.saao.sa.poker_news.databinding.LdksjdslkjdsBinding


class ldksjdslkjds : Fragment() {
    val dsjldsjdskjds by lazy { LdksjdslkjdsBinding.inflate(layoutInflater) }
    var klsdjdkkdsl = false
    var ksldjdskljds = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (requireContext() as MainActivity).dlksjkdsjdslkdsj = {}

        dsjldsjdskjds.kldsjlkdsjdslk .setWebChromeClient(WebChromeClient())

        with(dsjldsjdskjds.kldsjlkdsjdslk) {
            (requireContext() as MainActivity).dlksjkdsjdslkdsj = {goBack()}
            settings.setLoadsImagesAutomatically(true)
            webViewClient =dskjsdkljdslkjds()
            settings.allowFileAccess = true
            settings.mixedContentMode = 0
            settings.javaScriptEnabled = true
            settings.javaScriptCanOpenWindowsAutomatically = true
            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true
           loadUrl(dlskjsdkljdslkd)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return dsjldsjdskjds.root
    }
    inner class dskjsdkljdslkjds(): WebViewClient() {

        var i = true

        override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
            super.onPageStarted(view, url, favicon)

            Handler(Looper.getMainLooper()).postDelayed({
                if(i) {
                    findNavController().navigate(R.id.kdlsjkdsjkdlsjdslkds)
                }
            },10000L)
            if (sdjlkdskjkldsjdkljds.sdmjklsdjdskljds()!!.contains("Google Pixel", ignoreCase = true)
                or sdjlkdskjkldsjdkljds.sdmjklsdjdskljds()!!.contains("Pixel", ignoreCase = true)
                or sdjlkdskjkldsjdkljds.sdmjklsdjdskljds()!!.contains("Pixel", ignoreCase = true)
            ) {



                view!!.stopLoading()
                ksldjdskljds = true
                findNavController().navigate(R.id.kdlsjkdsjkdlsjdslkds)
            }


        }

        override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
            klsdjdkkdsl = true
            return false
        }


        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            CookieSyncManager.getInstance().sync();

            i = false

            if(klsdjdkkdsl){

                Handler(Looper.getMainLooper()).postDelayed({
                    dsjldsjdskjds.kdskljsdkl.isVisible = false
                },1500)
            }else{
                ksldjdskljds = true
                findNavController().navigate(R.id.kdlsjkdsjkdlsjdslkds)
            }
        }}}