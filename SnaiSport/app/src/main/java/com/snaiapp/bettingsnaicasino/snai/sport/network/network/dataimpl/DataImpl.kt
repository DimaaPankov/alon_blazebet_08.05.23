package com.sekvenie.model.network.dataimpl

import com.sekvenie.R
import com.sekvenie.model.network.service.Data
import com.sekvenie.mainpresemter.DataApi
import com.sekvenie.model.network.service.CATEGORY


object DataImpl : DataApi<Data> {
    override var data = listOf<Data>(
        Data(R.drawable.footboll,R.string.footbal_1,CATEGORY.FOOTBAL,2.12F,1.09F,3.2F),
        Data(R.drawable.footboll,R.string.footbal_2,CATEGORY.FOOTBAL,1.34F,1.56F,5.6F),
        Data(R.drawable.footboll,R.string.footbal_3,CATEGORY.FOOTBAL,2.01F,2.33F,4.7F),
        Data(R.drawable.footboll,R.string.footbal_4,CATEGORY.FOOTBAL,2.11F,1.08F,8F),
        Data(R.drawable.footboll,R.string.footbal_5,CATEGORY.FOOTBAL,1.8F,1.3F,4F),
        Data(R.drawable.footboll,R.string.footbal_6,CATEGORY.FOOTBAL,1.92F,3.89F,5.7F),
        Data(R.drawable.footboll,R.string.footbal_7,CATEGORY.FOOTBAL,2.07F,1.29F,2.7F),
        Data(R.drawable.ufc_280,R.string.ufc_1,CATEGORY.MMA,2.23F,1.45F,6.7F),
        Data(R.drawable.ufc_280,R.string.ufc_2,CATEGORY.MMA,2.12F,1.1F,11.7F),
        Data(R.drawable.ufc_280,R.string.ufc_3,CATEGORY.MMA,1.59F,1.33F,8.32F),
        Data(R.drawable.ufc_280,R.string.ufc_4,CATEGORY.MMA,2.15F,2.4F,12.12F),
        Data(R.drawable.ufc_280,R.string.ufc_5,CATEGORY.MMA,1.67F,1.6F,4.7F),
        Data(R.drawable.box,R.string.box_1,CATEGORY.BOX,2.1F,2.5F,13.7F),
        Data(R.drawable.box,R.string.box_2,CATEGORY.BOX,1.41F,3F,9F),
        Data(R.drawable.box,R.string.box_3,CATEGORY.BOX,1.92F,1.2F,6F),
        Data(R.drawable.box,R.string.box_4,CATEGORY.BOX,1.53F,1.45F,3.5F),
        Data(R.drawable.box,R.string.box_5,CATEGORY.BOX,1.27F,1.12F,6.98F),
        Data(R.drawable.box,R.string.box_6,CATEGORY.BOX,2.41F,1.47F,9.15F),
        Data(R.drawable.tenis,R.string.tenis_1,CATEGORY.TENIS,2.02F,2.45F,9.07F),
        Data(R.drawable.tenis,R.string.tenis_2,CATEGORY.TENIS,2.11F,3F,5.1F),
        Data(R.drawable.tenis,R.string.tenis_3,CATEGORY.TENIS,1.12F,2.43F,9.81F),
        Data(R.drawable.tenis,R.string.tenis_4,CATEGORY.TENIS,3.12F,1.41F,6.98F),
        Data(R.drawable.tenis,R.string.tenis_5,CATEGORY.TENIS,1.62F,1.12F,5.82F),
        Data(R.drawable.tenis,R.string.tenis_6,CATEGORY.TENIS,2.82F,1.5F,4.18F),
        Data(R.drawable.tenis,R.string.tenis_7,CATEGORY.TENIS,3.29F,1.7F,4.7F),
        Data(R.drawable.tenis,R.string.tenis_8,CATEGORY.TENIS,1.22F,1.9F,10.8F),
        Data(R.drawable.americans_footbal,R.string.americans_1,CATEGORY.AMERICANS_FOOTBAL,1.39F,1.39F,3.76F),
        Data(R.drawable.americans_footbal,R.string.americans_2,CATEGORY.AMERICANS_FOOTBAL,2.94F,1.25F,4.89F),
        Data(R.drawable.americans_footbal,R.string.americans_3,CATEGORY.AMERICANS_FOOTBAL,1.52F,1.14F,8.7F),
        Data(R.drawable.americans_footbal,R.string.americans_4,CATEGORY.AMERICANS_FOOTBAL,2.65F,1.97F,4.73F),
        Data(R.drawable.americans_footbal,R.string.americans_5,CATEGORY.AMERICANS_FOOTBAL,1.42F,1.12F,3.61F),
        Data(R.drawable.americans_footbal,R.string.americans_6,CATEGORY.AMERICANS_FOOTBAL,1.34F,2F,4.09F),
        Data(R.drawable.americans_footbal,R.string.americans_7,CATEGORY.AMERICANS_FOOTBAL,2.17F,2.5F,7.41F),
        Data(R.drawable.americans_footbal,R.string.americans_8,CATEGORY.AMERICANS_FOOTBAL,4.12F,3F,4F),
        Data(R.drawable.americans_footbal,R.string.americans_8,CATEGORY.AMERICANS_FOOTBAL,3.92F,4.1F,4.07F),
        Data(R.drawable.wrestling,R.string.wrestling_1,CATEGORY.WRESTLING,2.11F,1.5F,8F),
        Data(R.drawable.hokey,R.string.hokey_1,CATEGORY.HOKEY,1.79F,1.7F,6.81F),
        Data(R.drawable.hokey,R.string.hokey_2,CATEGORY.HOKEY,1.28F,2.43F,4.9F),
        Data(R.drawable.hokey,R.string.hokey_3,CATEGORY.HOKEY,1.08F,1.24F,5.89F),
        Data(R.drawable.hokey,R.string.hokey_4,CATEGORY.HOKEY,1.15F,1.91F,3.49F),
        Data(R.drawable.hokey,R.string.hokey_5,CATEGORY.HOKEY,1.38F,2.12F,5.1F),
        Data(R.drawable.hokey,R.string.hokey_6,CATEGORY.HOKEY,1.67F,2.26F,10.29F)
        )
}