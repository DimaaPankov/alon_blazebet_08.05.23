package com.sekvenie.mainpresemter

import com.sekvenie.model.network.service.Data

interface DataApi<T> {
val data:List<Data>
}