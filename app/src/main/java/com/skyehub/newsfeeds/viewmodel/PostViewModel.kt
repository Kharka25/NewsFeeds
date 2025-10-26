package com.skyehub.newsfeeds.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.skyehub.newsfeeds.model.Post
import com.skyehub.newsfeeds.repository.PostRepository
import kotlinx.coroutines.launch

class PostViewModel: ViewModel() {
    private  val postRepository = PostRepository()

    var posts by mutableStateOf<List<Post>>(emptyList())
        private set // prevents state modification by external objects, promoting internal controlled state management

    init {
        viewModelScope.launch {
            // Fetch posts data
            val fetchedPosts = postRepository.fetchPosts();
            // Update local state
            // Any update to 'post' will trigger
            // a recomposition of any composable reading this state
            posts = fetchedPosts
        }
    }
}