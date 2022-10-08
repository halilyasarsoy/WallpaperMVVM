package com.halil.wallpapermvvm.Api

import com.halil.wallpapermvvm.Model.ResponsePexels
import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiInterface {
    @Headers()
    @GET("search")

    suspend fun getWallpaper(
        @Query("query") query: String="nature",
        @Query("per_page") perpage : Int = 80
    ) : retrofit2.Response<ResponsePexels>

}