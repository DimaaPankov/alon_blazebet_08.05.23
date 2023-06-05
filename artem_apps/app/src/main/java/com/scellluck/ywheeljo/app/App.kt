package com.scellluck.ywheeljo.app

import android.app.Application
import android.content.Context
import android.provider.Settings
import android.telephony.TelephonyManager
import android.util.Log
import com.appsflyer.AppsFlyerLib
import com.appsflyer.attribution.AppsFlyerRequestListener
import com.onesignal.OneSignal


var appsFlyerID = ""
var android_id = ""
var simState = ""
var bid = "com.scellluck.ywheeljo"
var countryCode = ""
var af_statusMAin = ""
var campaignMain = ""
class AFApplication : Application() {

    init {

    }
    override fun onCreate() {
        super.onCreate()

        initOneSignal()
       // initAppsFlyer()

     var telMgr = (getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager)
       // int simState = telMgr.getSimState()

        android_id = Settings.Secure.getString(this.getContentResolver(),
            Settings.Secure.ANDROID_ID)



        when (telMgr.simState) {
            TelephonyManager.SIM_STATE_ABSENT -> { simState = "СОСТОЯНИЕ SIM-КАРТЫ ОТСУТСТВУЕТ"}
            TelephonyManager.SIM_STATE_NETWORK_LOCKED -> {simState = "СОСТОЯНИЕ SIM-КАРТЫ СЕТЬ ЗАБЛОКИРОВАНА"}
            TelephonyManager.SIM_STATE_PIN_REQUIRED -> {simState = "ТРЕБУЕТСЯ PIN-КОД"}
            TelephonyManager.SIM_STATE_PUK_REQUIRED -> {simState = "ТРЕБУЕТСЯ СТАРТОВЫЙ ПАКЕТ SIM-КАРТ_REQUIRED"}
            TelephonyManager.SIM_STATE_READY -> {simState = "СОСТОЯНИЕ SIM-КАРТЫ ГОТОВО К ИСПОЛЬЗОВАНИЮ"}
            TelephonyManager.SIM_STATE_UNKNOWN -> {simState = "СОСТОЯНИЕ SIM-КАРТЫ НЕИЗВЕСТНО"}
        }

    }

    fun cachova(){

    }

    // + "?device_id=" + Build.BRAND.toUpperCase()
    //                                    + "&country=" + response.getString("countryCode").toUpperCase()
    //                                    + "&sim=" + simState
    //                                    + "&bid=com.aflywi.nspolet"
    //                                    + "&campaign_name=" + campaign + "&af_status=" + sharedPreferences.getString("af_status", "unknown") + "&osid=" + sharedPreferences.getString("osid", "unknown")
    //                                    + "&af_id=" + sharedPreferences.getString("af_id", "unknown");

    private fun initOneSignal() {
        //8dfe1d55-3813-4d63-a729-981ae3f01e05
        val ONESIGNAL_APP_ID = "8dfe1d55-3813-4d63-a729-981ae3f01e05"

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
        OneSignal.promptForPushNotifications()
    }





}

fun getUserCountry(context: Context): String? {
    try {
        val tm = context.getSystemService(Application.TELEPHONY_SERVICE) as TelephonyManager
        val simCountry = tm.simCountryIso
        if (simCountry != null && simCountry.length == 2) { // SIM country code is available
            return simCountry.lowercase()
        } else if (tm.phoneType != TelephonyManager.PHONE_TYPE_CDMA) { // device is not 3G (would be unreliable)
            val networkCountry = tm.networkCountryIso
            if (networkCountry != null && networkCountry.length == 2) { // network country code is available
                return networkCountry.lowercase()
            }
        }
    } catch (e: Exception) {
    }
    return null
}