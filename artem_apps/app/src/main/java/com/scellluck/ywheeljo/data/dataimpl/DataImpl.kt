package com.scellluck.ywheeljo.data.dataimpl

import com.scellluck.ywheeljo.data.service.Data
import com.scellluck.ywheeljo.data.service.ApiService
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

interface DataApi<T> {
    suspend fun getData(): T
}

object DataImpl : DataApi<Data> {
    private var data: Data? = null

    override suspend fun getData(): Data {
        data = Data(listOf())
        coroutineScope {
            launch {
                try {
                    data = ApiService.getInstance().getPhotos()
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
        return data!!
    }
}