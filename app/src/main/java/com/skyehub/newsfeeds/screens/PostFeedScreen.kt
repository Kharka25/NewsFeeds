package com.skyehub.newsfeeds.screens

import androidx.compose.runtime.Composable
import com.skyehub.newsfeeds.screens.ui.PostFeeds
import com.skyehub.newsfeeds.viewmodel.PostViewModel

@Composable
fun PostFeedScreen(viewModel: PostViewModel) {
    val posts = viewModel.posts
    PostFeeds(posts);
}