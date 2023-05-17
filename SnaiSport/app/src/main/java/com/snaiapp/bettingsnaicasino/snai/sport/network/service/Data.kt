package com.sekvenie.model.network.service

import androidx.annotation.StringRes

enum class CATEGORY {
    FOOTBAL,TENIS,WRESTLING,HOKEY,BOX,MMA,AMERICANS_FOOTBAL
}


data class Data(
    val img:Int,val title:Int,val group:CATEGORY,val c1:Float,
    val c2:Float,val c3:Float
)