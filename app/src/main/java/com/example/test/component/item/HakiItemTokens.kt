package com.example.test.component.item

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.test.ui.theme.primary
import com.example.test.ui.theme.secondary

object HakiItemTokens {
    //Padding item
    val ItemHorizontalPadding = 0.dp
    val ItemVerticalPadding = 0.dp

    //Margin Item
    val ItemHorizontalMargin = 8.dp
    val ItemVerticalMargin = 8.dp

    //Rounded Corner
    val ItemCornerShape = 10.dp

    //Border
    val BorderWidth = 2.dp
    val BorderColor = secondary

    //Color
    val BackgroundImageColor = primary
    var ContainerColor: Color = primary
    val DisabledContainerColor = Color.Red
    val DisabledLabelTextColor = Color.Red

    // Elevation
    val ContainerElevation = 0.dp
    val DisabledContainerElevation = 0.dp
    const val DisabledContainerOpacity = 0.1f
    const val DisabledLabelTextOpacity = 0.38f
    val FocusContainerElevation = 0.dp
    val HoverContainerElevation = 0.dp
    val PressedContainerElevation = 0.dp

}