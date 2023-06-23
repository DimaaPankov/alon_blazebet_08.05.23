package com.rustamtest.karaokefrogtest.black

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.apps.tz.rainbowgoldstation.shared.SharedPrefs
import com.rustamtest.karaokefrogtest.app.myApp
import com.rustamtest.karaokefrogtest.R
import com.rustamtest.karaokefrogtest.databinding.LoudingFragmentBinding
import com.google.android.gms.ads.identifier.AdvertisingIdClient

import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

var mainUrl = ""
var fireBaseState = true
var advertising_ID = ""


class LoudingFragment : Fragment() {


    val binding by lazy { LoudingFragmentBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CoroutineScope(Dispatchers.IO).launch {
            advertising_ID = AdvertisingIdClient.getAdvertisingIdInfo(requireContext()).id!!
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Handler(Looper.getMainLooper()).postDelayed({
        val status = SharedPrefs(requireContext()).getStatus()
        val url = SharedPrefs(requireContext()).getUrl()


        if (status == SharedPrefs.STATUS_OPENED_GAME) {
            Log.d("LoudingFragment", "SharedPrefs: open game because status $status")
            toGame()
        } else if (status == SharedPrefs.STATUS_OPENED_URL && !url.isNullOrBlank()) {
            Log.d("LoudingFragment", "SharedPrefs: open url $url")
            mainUrl = url
            toWebview()
        }  else {
            loudingLogic()
        }
    },6000L)
        return binding.root
    }

    private fun toGame() {
        findNavController().navigate(R.id.action_loudingFragment2_to_oneFragment)
    }

    private fun toWebview() {
        findNavController().navigate(R.id.action_loudingFragment2_to_webViewFragment2)
    }

    private fun loudingLogic() {

        val fireBaseLinc = FirebaseRemoteConfig.getInstance()
        fireBaseLinc.fetchAndActivate()
            .addOnCompleteListener { reqest ->
                if (reqest.isSuccessful) {
                    val getFBurl = FirebaseRemoteConfig.getInstance().getString("url")
                    fireBaseState = FirebaseRemoteConfig.getInstance().getBoolean("state")

                    Log.d("fireBase", getFBurl)
                    if (getFBurl.isNotBlank()) {
                        try {
                            (requireContext().applicationContext as myApp)
                                .appsFlyer({ findNavController().navigate(R.id.action_loudingFragment2_to_webViewFragment2) },
                                    { findNavController().navigate(R.id.action_loudingFragment2_to_oneFragment) })
                            mainUrl = getFBurl

                        } catch (e: Exception) {
                            toGame()
                        }
                    } else {
                        toGame()
                    }

                } else {
                    toGame()
                }
            }
    }

}