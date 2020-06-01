package com.example.retrofit

import retrofit2.http.GET
import retrofit2.http.Query

interface Data {


    @GET("frontsite/trans/SearchShowAction.do")  //HTTP 使用GET請求
    fun getJsonData(
        @Query("method") method: String,
        @Query("category") category: String
    ): retrofit2.Call<List<DataBean>>

}