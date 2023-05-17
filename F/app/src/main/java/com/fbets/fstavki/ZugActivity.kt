package com.fbets.fstavki

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.fbets.fstavki.databinding.ActivityZugBinding

class ZugActivity : AppCompatActivity() {

    var goBack = {}
    var clickLeft = {}
    var clickCenter = {}
    var clickRight = {}

   val binding by lazy {ActivityZugBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

         setupNavigation()
        setContentView(binding.root)
    }

    private fun setupNavigation() {
        binding.bottom .setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.leftC -> {
                    clickLeft()
                    true
                }
                R.id.centerC -> {
                    clickCenter()
                    true
                }
                R.id.rightC -> {

                    clickRight()
                    true
                }
                else -> true
            }
        }
    }

    override fun onBackPressed() {
    goBack()
    }

}