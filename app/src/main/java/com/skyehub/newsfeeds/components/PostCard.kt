package com.skyehub.newsfeeds.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.skyehub.newsfeeds.model.Post
import com.skyehub.newsfeeds.utils.Helpers

@Composable
fun PostCard(post: Post) {
    val backgroundColor = Helpers().generateRandomColor();
    Card(
        colors = CardDefaults.cardColors(containerColor = backgroundColor),
        elevation = CardDefaults.cardElevation(8.dp),
        modifier = Modifier.padding(12.dp).fillMaxWidth()) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = post.title, style = MaterialTheme.typography.labelLarge)
            Text(text = post.body, style = MaterialTheme.typography.bodySmall)
        }
    }
}