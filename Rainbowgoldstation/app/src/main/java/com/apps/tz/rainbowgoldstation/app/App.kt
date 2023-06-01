package com.apps.tz.rainbowgoldstation.app

import android.app.Application
import android.util.Log
import com.appsflyer.AppsFlyerLib
import com.appsflyer.attribution.AppsFlyerRequestListener
import com.onesignal.OneSignal

class App:Application() {
    override fun onCreate() {
        super.onCreate()

        initAppsFlyer()
        initOneSignal()

    }


    private fun initOneSignal() {
        val ONESIGNAL_APP_ID = "PicmH3h3wQDHfapGJ69bSb"

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
        OneSignal.promptForPushNotifications()
    }

    private fun initAppsFlyer() {


        val key = "PicmH3h3wQDHfapGJ69bSb"


        AppsFlyerLib.getInstance().init(key, null, applicationContext)
        AppsFlyerLib.getInstance().start(applicationContext, "PfawYwYHxXyxyxXT8WJWVsB", object :
            AppsFlyerRequestListener {
            override fun onSuccess() {
                Log.d("appsFlayer", "Launch sent successfully")
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