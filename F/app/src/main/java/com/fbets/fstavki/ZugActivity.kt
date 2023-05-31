package com.fbets.fstavki

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fbets.fstavki.databinding.ActivityZugBinding

class ZugActivity : AppCompatActivity() {

    var kldsjkldsjdm = {}
    var dfjsdlkfjklfd = {}
    var ksdjkdlsjd = {}
    var dslkjkdsljds = {}

   val lkdfsjkgldf by lazy {ActivityZugBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

         setupNavigation()
        setContentView(lkdfsjkgldf.root)
    }

    private fun setupNavigation() {
        lkdfsjkgldf.klfdsjgklfdjklds .setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.klfjdsklvjfdsljdsx -> {
                    dfjsdlkfjklfd()
                    true
                }
                R.id.lkdsjflkjsdfkljdslkf -> {
                    ksdjkdlsjd()
                    true
                }
                R.id.flkdhgdjfklfdsjfklsdjkl -> {

                    dslkjkdsljds()
                    true
                }
                else -> true
            }
        }
    }

    override fun onBackPressed() {
    kldsjkldsjdm()
    }

}