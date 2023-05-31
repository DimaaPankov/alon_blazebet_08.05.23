package com.parimatch.betting.parimatch.pari.lksdjglkjsklfjsklfdjlkds

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.parimatch.betting.parimatch.pari.R

class MainActivity : AppCompatActivity() {

    var sdkjkdsljdsklop = {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ksfddsdjfdjskl = ndjkshflksj("TeadffdlkmA")
        val fdfdklmkfdl = fdkjtkgjkrdo("kfdmfkd")

        val kjfdsfkdnjdsf = kdkjdfnkfd("Pfkdlmdfkkdfm")
        val kmlfdmkfldkmlfd = kdkjdfnkfd("fdklfdmklfdrB")
        val sdklfmkdflmkdf = klmfdmdkflfm("fdkmfdklfdm")
        val kdsmkfdklmfdsmkl = klmfdmdkflfm("fdmkfdkldfmkl")

        ksfddsdjfdjskl.smdjklfjdslk(kjfdsfkdnjdsf)
        ksfddsdjfdjskl.smdjklfjdslk(kmlfdmkfldkmlfd)
        fdfdklmkfdl.smdjklfjdslk(sdklfmkdflmkdf)
        fdfdklmkfdl.smdjklfjdslk(kdsmkfdklmfdsmkl)

        val dksmlksdmklds = kmdsmkdfsmds("dskmdsklmdskl")
        val jkdfdfmdf = kmfmlfdk("sdfkmmfdklmdfkB")

        val mkdmkldfmkfdmkl = dfmkldfmkl("Mfdklmfdklfdm")

        dksmlksdmklds.kmdflmkldf()
        jkdfdfmdf.kmdflmkldf()

        mkdmkldfmkfdmkl.lmdsmdslsd()

        ksfddsdjfdjskl.kdmskljdsbncjk()
        fdfdklmkfdl.kdmskljdsbncjk()

    }

    override fun onBackPressed() {

        sdkjkdsljdsklop()

    }


}


class kldsjdlksjdop(val dsjksdjdslkop: Context) {
    private var ksdljkldsjdop: SharedPreferences
    private val ksdljdklsjdop = dsjksdjdslkop.getSharedPreferences("databaseInfo", Context.MODE_PRIVATE)
    private var jsdkljldksop: SharedPreferences.Editor
    private val ksdjldsjop = ksdljdklsjdop.edit()



    init {
        ksdljkldsjdop = dsjksdjdslkop.getSharedPreferences(djdhjdfop().toString(), Context.MODE_PRIVATE)
        jsdkljldksop = ksdljkldsjdop.edit()
    }

    fun djdhjdfop(): Float {
        return ksdljdklsjdop.getFloat("size", 1000F)
    }

     fun setBalans(i:Float) {
        ksdjldsjop.putFloat("size", djdhjdfop() - i).apply()
    }
}//jvirj/XBet_17.08