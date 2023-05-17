package com.sekvenie.mainpresemter

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.sekvenie.App
import com.sekvenie.R
import com.sekvenie.model.network.service.CATEGORY
import com.sekvenie.model.network.service.Data
import com.sekvenie.model.network.service.Film
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


enum class ApiStatus{  LOADING,DONE,ERROR }

class MainPresenter(private val api: DataApi<Data/*Film*/>): ViewModel() {
    private var mainList: List<Data>? = null
    private var view: MainViewApi? = null
    private var sortedList: List<Data> = mutableListOf()
    private val categoryList = mutableSetOf<String>()

    private fun sortingFilmsFromABC(){
        mainList = mainList?.sortedWith(compareBy(Data::title))
    }

    fun getMainList() = mainList

    fun getSortedList() = sortedList

    private fun setCategory(){
        mainList?.forEach { film ->
                categoryList.add(film.group.name)
        }
    }

    fun init(view: MainViewApi) {
        this.view = view
        getFilms()
    }

    private fun getFilms() {
                    mainList = api.data
                    setCategory()
                    sortingFilmsFromABC()
                    view?.showFilms(mainList!!)
                    view?.showCategory(categoryList)
                    view?.showStatus(ApiStatus.DONE)

                    view?.showStatus(ApiStatus.ERROR)

    }

    fun sortingFilmsFromCategory(chooseCategory: String?){
            val resultList = mutableListOf<Data>()
            mainList?.forEach { film ->

                    if(film.group.name == chooseCategory){
                        resultList.add(film)

                }
            }
            sortedList = resultList
    }

    fun destroy() {
        view = null
    }

    fun openFilm() {
        App.navController?.navigate(R.id.action_mainFragment_to_detailFragment)
    }

}