package com.example.test.button

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.test.ui.theme.primary
import com.example.test.ui.theme.secondary
import com.example.test.ui.theme.textDark
import com.example.test.ui.theme.textLight

object HakiButtonTokens {
    // Padding Button
    val ButtonHorizontalPadding = 24.dp
    val ButtonVerticalPadding = 8.dp

    // Margin Button
    val ButtonHorizontalMargin = 8.dp
    val ButtonVerticalMargin = 8.dp

    // Rounded Corner
    val ButtonCornerShape = 10.dp
}

object HakiMainButtonTokens {
    //Color
    var ContainerColor: Color = primary
    val DisabledContainerColor = Color.Red
    val DisabledLabelTextColor = Color.Red
    val LabelTextColor = textLight

    //Border
    val OutlineWidth = 0.dp
    val OutlineColor = Color.Transparent

    val ContainerElevation = 0.dp
    val DisabledContainerElevation = 0.dp
    const val DisabledContainerOpacity = 0.1f
    const val DisabledLabelTextOpacity = 0.38f
    val FocusContainerElevation = 0.dp
    val HoverContainerElevation = 0.dp
    val PressedContainerElevation = 0.dp
}

object HakiElevatedButtonTokens {
    //Color
    var ContainerColor: Color = primary
    val DisabledContainerColor = Color.Red
    val DisabledLabelTextColor = Color.Red
    val LabelTextColor = textLight

    //Border
    val OutlineWidth = 0.dp
    val OutlineColor = Color.Transparent

    val ContainerElevation = 4.dp
    val DisabledContainerElevation = 0.dp
    const val DisabledContainerOpacity = 0.1f
    const val DisabledLabelTextOpacity = 0.38f
    val FocusContainerElevation = 0.dp
    val HoverContainerElevation = 0.dp
    val PressedContainerElevation = 0.dp
}

object HakiOutlinedButtonTokens {
    //Color
    var ContainerColor = Color.White
    val DisabledContainerColor = Color.White
    val DisabledLabelTextColor = Color.White
    val LabelTextColor = textDark

    //Border
    val OutlineWidth = 2.dp
    val OutlineColor = secondary

    val ContainerElevation = 0.dp
    val DisabledContainerElevation = 0.dp
    const val DisabledContainerOpacity = 0.1f
    const val DisabledLabelTextOpacity = 0.38f
    val FocusContainerElevation = 0.dp
    val HoverContainerElevation = 0.dp
    val PressedContainerElevation = 0.dp
}