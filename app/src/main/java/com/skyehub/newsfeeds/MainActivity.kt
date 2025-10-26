package com.skyehub.newsfeeds

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.skyehub.newsfeeds.screens.PostFeedScreen
import com.skyehub.newsfeeds.ui.theme.NewsFeedsTheme
import com.skyehub.newsfeeds.viewmodel.PostViewModel

class MainActivity : ComponentActivity() {
    private val postViewModel: PostViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NewsFeedsTheme {
                PostFeedScreen(viewModel = postViewModel)
            }
        }
    }
}
