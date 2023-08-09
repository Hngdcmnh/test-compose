package com.example.test.appcomponent

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.test.component.button.HakiButtonDefaults
import com.example.test.ui.theme.background
import com.example.test.ui.theme.containerColor

@Composable
fun IconBack(modifier: Modifier = Modifier, onClick: (() -> Unit) = {}) =
    IconButton(
        onClick = onClick, contentPadding = PaddingValues(4.dp),
        colors = HakiButtonDefaults.mainButtonColors().copy(
            containerColor = background
        ),
        elevations = HakiButtonDefaults.elevatedButtonElevations().copy(
            defaultElevation = 0.dp, pressedElevation = 0.dp
        ), contentMargin = PaddingValues(0.dp)
    ) {
        val context = LocalContext.current
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "BACK",
            modifier = modifier
                .size(24.dp)
        )
    }
