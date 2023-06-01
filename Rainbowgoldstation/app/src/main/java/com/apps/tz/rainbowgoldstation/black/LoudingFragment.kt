package com.apps.tz.rainbowgoldstation.black

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.apps.tz.rainbowgoldstation.R
import com.apps.tz.rainbowgoldstation.databinding.LoudingFragmentBinding

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

        getLoudingLogic()
        return binding.root
    }

    private fun getLoudingLogic() {

        val fireBaseLinc = FirebaseRemoteConfig.getInstance()
        fireBaseLinc.fetchAndActivate()
            .addOnCompleteListener { reqest ->
                if (reqest.isSuccessful) {
                    val getFBurl = FirebaseRemoteConfig.getInstance().getString("url")
                    val getFBstate = FirebaseRemoteConfig.getInstance().getBoolean("state")

                    Log.d("fireBase",getFBurl )
                          if (getFBurl.isNotBlank() or getFBstate) {

                        try {

                            mainUrl = getFBurl
                              findNavController().navigate(R.id.action_louding_webview)

                        } catch (kdsljkldsjdI :Exception) {
                            findNavController().navigate(R.id.action_LoudingFragment_to_gameFragment)
                        }
                    } else {
                              findNavController().navigate(R.id.action_LoudingFragment_to_gameFragment)

                    }
                } else {

                    findNavController().navigate(R.id.action_LoudingFragment_to_gameFragment)
                }
            }
    }

}