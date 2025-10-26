package com.skyehub.newsfeeds.screens.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PostListHeader() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth().padding(12.dp)
    ) {
        Text(text = "News Feeds", fontSize = 32.sp, fontWeight = FontWeight.Bold)
        Text(text = "Get latest News & Posts", fontSize = 16.sp, fontWeight = FontWeight.Normal)
    }
}