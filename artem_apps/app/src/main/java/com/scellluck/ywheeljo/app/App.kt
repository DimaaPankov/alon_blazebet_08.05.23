package com.scellluck.ywheeljo.app

import android.app.Application
import android.util.Log
import com.appsflyer.AppsFlyerLib
import com.appsflyer.attribution.AppsFlyerRequestListener
import com.onesignal.OneSignal

class AFApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initOneSignal()
        initAppsFlyer()
    }

    fun cachova(){

    }

    private fun initOneSignal() {
        //8dfe1d55-3813-4d63-a729-981ae3f01e05
        val ONESIGNAL_APP_ID = "8dfe1d55-3813-4d63-a729-981ae3f01e05"

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
        OneSignal.promptForPushNotifications()
    }

    private fun initAppsFlyer() {

        Log.d("appsFlayerq", "Launch sent successfully")


        //tps5ncnXRsg7CEgq2ng8rG
        val key = "tps5ncnXRsg7CEgq2ng8rG"


        AppsFlyerLib.getInstance().init(key, AppsFlayerListner, applicationContext)
        AppsFlyerLib.getInstance().start(applicationContext, "PfawYwYHxXyxyxXT8WJWVsB", object :
            AppsFlyerRequestListener {
            override fun onSuccess() {
                Log.d("appsFlayerq", "Launch sent successfully")
            }

            override fun onError(errorCode: Int, errorDesc: String) {
                Log.d("appsFlayerq", "Launch failed to be sent:\n" +
                        "Error code: " + errorCode + "\n"
                        + "Error description: " + errorDesc)
            }
        })
        AppsFlyerLib.getInstance().setDebugLog(true)
    }

}