package com.dj.mynewsapplication3.api

import com.dj.mynewsapplication3.api.Article

data class NewsApiJSON(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)