package com.halil.wallpapermvvm.Repository

import com.halil.wallpapermvvm.Api.RetrofitInstance

class RepositoryWallpaper {

    suspend fun  getWallpaper(query : String)= RetrofitInstance.api.getWallpaper(query)
}