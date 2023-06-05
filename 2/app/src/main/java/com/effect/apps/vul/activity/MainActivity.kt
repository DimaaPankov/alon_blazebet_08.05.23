package com.effect.apps.vul.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.effect.apps.vul.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    var dklsjdfkljfd = {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    override fun onBackPressed() {
        dklsjdfkljfd()
    }

}