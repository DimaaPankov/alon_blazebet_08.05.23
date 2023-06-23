package com.rustamtest.karaokefrogtest.app

import android.app.Application
import android.util.Log

import com.appsflyer.AppsFlyerLib
import com.appsflyer.attribution.AppsFlyerRequestListener
import com.facebook.FacebookSdk


class myApp : Application() {

    override fun onCreate() {
        super.onCreate()
        FacebookSdk.sdkInitialize(applicationContext);

        //AppsFlyer()

    }


    fun appsFlyer(actionToOffer : () -> Unit, actionToGame : () -> Unit) {

        appsFlyerID = AppsFlyerLib.getInstance().getAppsFlyerUID(this)!!

        val token = "rpaZQL27fJhjw4YbhmJVy8"

        AppsFlayerListner.actionToOffer = actionToOffer
        AppsFlayerListner.actionToGame = actionToGame

        AppsFlyerLib.getInstance().init(token, AppsFlayerListner, applicationContext)
        AppsFlyerLib.getInstance().start(applicationContext, token, object :
            AppsFlyerRequestListener {
            override fun onSuccess() {
                Log.d("appsFlayer", "Launch sent successfully")
                Log.d("asa", "kjo")
            }

            override fun onError(errorCode: Int, errorDesc: String) {
                Log.d(
                    "appsFlayer", "Launch failed to be sent:\n" +
                            "Error code: " + errorCode + "\n"
                            + "Error description: " + errorDesc
                )
            }
        })
        AppsFlyerLib.getInstance().setDebugLog(true)


    }


}

