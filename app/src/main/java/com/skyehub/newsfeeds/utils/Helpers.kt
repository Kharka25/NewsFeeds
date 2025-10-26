package com.skyehub.newsfeeds.utils

import androidx.compose.ui.graphics.Color
import kotlin.random.Random

class Helpers {
    fun generateRandomColor(): Color {
        val red = Random.nextInt()
        val green = Random.nextInt()
        val blue = Random.nextInt()

        return Color(red, green, blue)
    }
}