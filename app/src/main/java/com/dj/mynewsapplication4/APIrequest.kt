    package com.dj.mynewsapplication4


import com.dj.mynewsapplication3.api.NewsApiJSON
import retrofit2.http.GET

interface APIrequest {

    // Use API KEY below after " = "
    @GET("/v2/top-headlines?sources=techcrunch&apiKey=")
    suspend fun getNews(): NewsApiJSON

}