package com.apps.tz.rainbowgoldstation.app

import android.app.Application
import android.util.Log
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.appsflyer.attribution.AppsFlyerRequestListener
import com.onesignal.OneSignal
import com.scellluck.ywheeljo.app.AppsFlayerListner


class App : Application() {
    override fun onCreate() {
        super.onCreate()

        initAppsFlyer()
        initOneSignal()
    }

    private fun initOneSignal() {
        val ONESIGNAL_APP_ID = "8b0326ba-a0c9-4172-8bd9-72f1fbde5b18"

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
        OneSignal.promptForPushNotifications()
    }

    private fun initAppsFlyer() {
        val key = "PicmH3h3wQDHfapGJ69bSb"
        AppsFlyerLib.getInstance().init(key, AppsFlayerListner, applicationContext)
        AppsFlyerLib.getInstance().start(applicationContext, key, object :
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

        AppsFlyerLib.getInstance().sendAdRevenue(this, mapOf("test" to "true"))
    }
}