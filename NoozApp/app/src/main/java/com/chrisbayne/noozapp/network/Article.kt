package com.chrisbayne.noozapp.network

data class Article(
    val title: String
)

data class ArticleResponse(
    val results: List<Article>
)