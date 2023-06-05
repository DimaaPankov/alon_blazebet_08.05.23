package com.apps.tz.rainbowgoldstation.shared

import android.content.Context

class SharedPrefs(private val context: Context) {

    private val pref = context.getSharedPreferences("databaseInfo", Context.MODE_PRIVATE)

    companion object {


        const val LEVEL = "LEVEL"
        const val BALANCE = "BALANS"

    }


    fun setLevel(level: Int) {
        pref.edit().putInt(LEVEL, level).apply()
    }

    fun getLevel(): Int {
        return pref.getInt(LEVEL, 0) ?: 0
    }

    fun setBalance(balanse: Int) {
        pref.edit().putInt(BALANCE, balanse).apply()
    }

    fun getBalance(): Int {
        return pref.getInt(BALANCE, 0)
    }





}

