package com.skyehub.newsfeeds.api

import com.skyehub.newsfeeds.model.Post
import retrofit2.http.GET

interface PostService {
    @GET("posts")
    suspend fun getPosts(): List<Post>
}
