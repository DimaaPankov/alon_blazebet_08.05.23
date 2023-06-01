package com.apps.tz.rainbowgoldstation.shared

import android.content.Context
import android.content.SharedPreferences

class SharedPrefs(val wevj: Context) {
    private var wehf: SharedPreferences
    private val pref = wevj.getSharedPreferences("databaseInfo", Context.MODE_PRIVATE)
    private var ewh: SharedPreferences.Editor
    private val wregvhrwghv = pref.edit()
    init {
        wehf = wevj.getSharedPreferences(isGoGame().toString(), Context.MODE_PRIVATE)
        ewh = wehf.edit()
    }

    fun isGoGame(): Boolean {
        return pref.getBoolean("goGame",true)
    }

    fun setGoGame(i:Boolean) {
        wregvhrwghv.putBoolean("goGame",i).apply()
    }
}

