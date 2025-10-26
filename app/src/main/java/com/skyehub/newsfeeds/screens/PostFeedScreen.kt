package com.skyehub.newsfeeds.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.safeContent
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.skyehub.newsfeeds.screens.ui.PostFeeds
import com.skyehub.newsfeeds.screens.ui.PostListHeader
import com.skyehub.newsfeeds.viewmodel.PostViewModel

@Composable
fun PostFeedScreen(viewModel: PostViewModel) {
    val posts = viewModel.posts
    Column(
        modifier = Modifier.windowInsetsPadding(WindowInsets.statusBars)) {
        PostListHeader()
        PostFeeds(posts);
    }
}