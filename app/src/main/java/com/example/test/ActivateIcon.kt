package com.example.test

import androidx.compose.foundation.Image
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

sealed class AdaptiveIcon {
    abstract fun content(color: Color): @Composable () -> Unit

    private data class ResIcon(val icon: Int) : AdaptiveIcon() {
        override fun content(color: Color): @Composable () -> Unit = {
            Icon(
                painter = painterResource(id = icon),
                contentDescription = null,
                tint = color
            )
        }
    }

    private data class ImageVectorIcon(val icon: ImageVector) : AdaptiveIcon() {
        override fun content(color: Color): @Composable () -> Unit = {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = color
            )
        }
    }

    private data class Image(val imageId: Int) : AdaptiveIcon() {
        override fun content(color: Color): @Composable () -> Unit = {
            Image(
                painter = painterResource(id = imageId),
                contentDescription = null,
                contentScale = ContentScale.Fit,
            )
        }
    }

    private data class Custom(val content: @Composable () -> Unit) : AdaptiveIcon() {
        override fun content(color: Color): @Composable () -> Unit = content
    }

    companion object {
        fun icon(icon: Int): AdaptiveIcon = ResIcon(icon)
        fun icon(icon: ImageVector): AdaptiveIcon = ImageVectorIcon(icon)
        fun image(imageId: Int): AdaptiveIcon = Image(imageId)
        fun custom(content: @Composable () -> Unit): AdaptiveIcon = Custom(content)
    }
}

