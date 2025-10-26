package com.skyehub.newsfeeds.screens.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.skyehub.newsfeeds.components.PostCard
import com.skyehub.newsfeeds.model.Post

@Composable
fun PostFeeds(posts: List<Post>) {
    LazyColumn {
        items(posts) {
            post -> PostCard(post = post)
        }
    }
}