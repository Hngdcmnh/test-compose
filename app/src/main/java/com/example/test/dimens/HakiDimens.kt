package com.example.test.dimens

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

data class HakiBorder constructor(
    val width: Dp,
    val color: Color
)

data class HakiElevation constructor(
    val defaultElevation: Dp,
    val pressedElevation: Dp,
    val focusedElevation: Dp,
    val hoveredElevation: Dp,
    val disabledElevation: Dp,
)

data class HakiButtonColor constructor(
    val containerColor: Color,
    val contentColor: Color,
    val disabledContainerColor: Color,
    val disabledContentColor: Color,
)

data class HakiItemColor constructor(
    val containerColor: Color,
    val contentColor: Color,
    val disabledContainerColor: Color,
    val disabledContentColor: Color,
    val backgroundImageColor: Color
)


