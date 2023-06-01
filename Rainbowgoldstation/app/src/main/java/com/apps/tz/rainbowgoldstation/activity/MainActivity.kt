package com.apps.tz.rainbowgoldstation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.apps.tz.rainbowgoldstation.R

class MainActivity : AppCompatActivity() {

    var goBack = {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onBackPressed() {goBack()}


}
