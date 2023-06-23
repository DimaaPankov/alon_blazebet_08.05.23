package com.rustamtest.karaokefrogtest

import android.os.Build
import androidx.annotation.RequiresApi
import java.util.Base64

fun parseSubs(
    campaignName: String,
    appsflyerId: String,
    advertisingID: String
): Map<String, String>? {
    if (!campaignName.startsWith("app//")) {
        return null
    }

    return campaignName.removePrefix("app//")
        .split("/")
        .mapIndexed { index, s ->
            if (index == 0) {
                "key" to s
            } else {
                "sub${index}" to s
            }
        }.associate { it } +
            mapOf("sub9" to appsflyerId, "sub10" to advertisingID)
}

   @RequiresApi(Build.VERSION_CODES.O)
   fun deCoderBase64(str:String):String{
       val decoder: Base64.Decoder = Base64.getDecoder()
      return decoder.decode(str).toString()
   }