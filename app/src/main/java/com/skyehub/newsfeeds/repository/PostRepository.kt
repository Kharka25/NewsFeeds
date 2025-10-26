package com.skyehub.newsfeeds.repository

import com.skyehub.newsfeeds.api.PostService
import com.skyehub.newsfeeds.api.RetrofitInstance
import com.skyehub.newsfeeds.model.Post

class PostRepository {
    private val apiInstance = RetrofitInstance.getInstance().create(PostService::class.java);

    suspend fun fetchPosts(): List<Post> {
        return apiInstance.getPosts();
    }
}