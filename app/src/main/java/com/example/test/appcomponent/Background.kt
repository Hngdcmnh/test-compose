package com.example.test.appcomponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import coil.compose.rememberAsyncImagePainter
import com.example.test.R
import com.example.test.ui.theme.background

@Composable
fun Background(
    modifier: Modifier = Modifier,
    painter: Painter = rememberAsyncImagePainter(model = R.drawable.funny_burp),
    contentScale: ContentScale = ContentScale.Crop,
    alpha: Float = 1f,
    contentDescription: String = "",
    content: @Composable () -> Unit
) {
    Box(modifier = modifier
        .fillMaxSize()
        .background(color = background)) {
        Image(
            painter = painter,
            contentScale = contentScale,
            modifier = Modifier.matchParentSize(),
            alpha = alpha,
            contentDescription = contentDescription
        )
        content()
    }

}