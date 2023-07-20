package com.example.test.button

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.test.ui.theme.primary
import com.example.test.ui.theme.textLight

object HakiButtonTokens {
    val ButtonHorizontalPadding = 24.dp
    val ButtonVerticalPadding = 8.dp
    val ButtonHorizontalMargin = 8.dp
    val ButtonVerticalMargin = 8.dp
    val ButtonCornerShape = 10.dp
}

object HakiMainButtonTokens {
    var ContainerColor: Color = primary
    val ContainerElevation = 0.dp
    val DisabledContainerColor = Color.Red
    val DisabledContainerElevation = 0.dp
    const val DisabledContainerOpacity = 0.1f
    val DisabledLabelTextColor = Color.Red
    const val DisabledLabelTextOpacity = 0.38f
    val FocusContainerElevation = 0.dp
    val HoverContainerElevation = 0.dp
    val LabelTextColor = textLight
    val PressedContainerElevation = 0.dp
    val OutlineWidth = 0.dp
    val OutlineColor = Color.Transparent
}

object HakiElevatedButtonTokens {
    var ContainerColor: Color = primary
    val ContainerElevation = 4.dp
    val DisabledContainerColor = Color.Red
    val DisabledContainerElevation = 0.dp
    const val DisabledContainerOpacity = 0.1f
    val DisabledLabelTextColor = Color.Red
    const val DisabledLabelTextOpacity = 0.38f
    val FocusContainerElevation = 0.dp
    val HoverContainerElevation = 0.dp
    val LabelTextColor = textLight
    val PressedContainerElevation = 0.dp
    val OutlineWidth = 0.dp
    val OutlineColor = Color.Transparent
}

object HakiOutlinedButtonTokens {
    var ContainerColor: Color = Color.White
    val ContainerElevation = 0.dp
    val DisabledContainerColor = Color.White
    val DisabledContainerElevation = 0.dp
    const val DisabledContainerOpacity = 0.1f
    val DisabledLabelTextColor = Color.Red
    const val DisabledLabelTextOpacity = 0.38f
    val FocusContainerElevation = 0.dp
    val HoverContainerElevation = 0.dp
    val LabelTextColor = Color.Black
    val PressedContainerElevation = 0.dp
    val OutlineWidth = 2.dp
    val OutlineColor = primary
}