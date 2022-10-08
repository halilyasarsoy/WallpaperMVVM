package com.halil.wallpapermvvm.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.halil.wallpapermvvm.Model.ResponsePexels
import com.halil.wallpapermvvm.Repository.RepositoryWallpaper
import kotlinx.coroutines.launch
import retrofit2.Response

class ViewModel (val repository : RepositoryWallpaper):ViewModel() {

    lateinit var wallpaperList : MutableLiveData<Response<ResponsePexels>>

    init {
        wallpaperList = MutableLiveData()
        getWallpaper("nature")

    }
    fun getWallpaper(s : String){
        viewModelScope.launch {
            val response = repository.getWallpaper(s)
            wallpaperList.postValue(response)
        }
    }

}