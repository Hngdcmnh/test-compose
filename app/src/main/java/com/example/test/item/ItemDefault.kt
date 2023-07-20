package com.example.test.item

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import com.example.test.dimens.HakiBorder
import com.example.test.dimens.HakiItemColor
import com.example.test.dimens.HakiElevation
import com.example.test.ui.theme.textDark
import com.example.test.ui.theme.textLight
object HakiItemDefaults {
    //Padding
    val ContentPadding =
        PaddingValues(
            start = HakiItemTokens.ItemHorizontalPadding,
            top = HakiItemTokens.ItemVerticalPadding,
            end = HakiItemTokens.ItemHorizontalPadding,
            bottom = HakiItemTokens.ItemVerticalPadding
        )

    //Margin
    val ContentMargin =
        PaddingValues(
            start = HakiItemTokens.ItemHorizontalMargin,
            top = HakiItemTokens.ItemVerticalMargin,
            end = HakiItemTokens.ItemHorizontalMargin,
            bottom = HakiItemTokens.ItemVerticalMargin
        )

    //Shape(rounded corner)
    val shape: Shape @Composable get() = RoundedCornerShape(HakiItemTokens.ItemCornerShape)

    //Border
    @Composable
    fun itemBorders(
        width: Dp = HakiItemTokens.BorderWidth,
        color: Color = HakiItemTokens.BorderColor
    ): HakiBorder = HakiBorder(width = width, color = color)

    //Color
    @Composable
    fun itemColorsTextIn(
        containerColor: Color = HakiItemTokens.ContainerColor,
        contentColor: Color = textLight,
        disabledContainerColor: Color = HakiItemTokens.DisabledContainerColor.copy(alpha = HakiItemTokens.DisabledContainerOpacity),
        disabledContentColor: Color = HakiItemTokens.DisabledLabelTextColor.copy(alpha = HakiItemTokens.DisabledLabelTextOpacity),
        backgroundImageColor: Color = HakiItemTokens.BackgroundImageColor
    ): HakiItemColor = HakiItemColor(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor,
        backgroundImageColor = backgroundImageColor
    )

    @Composable
    fun itemColorsTextOut(
        containerColor: Color = HakiItemTokens.ContainerColor,
        contentColor: Color = textDark,
        disabledContainerColor: Color = HakiItemTokens.DisabledContainerColor.copy(alpha = HakiItemTokens.DisabledContainerOpacity),
        disabledContentColor: Color = HakiItemTokens.DisabledLabelTextColor.copy(alpha = HakiItemTokens.DisabledLabelTextOpacity),
        backgroundImageColor: Color = HakiItemTokens.BackgroundImageColor
    ): HakiItemColor = HakiItemColor(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor,
        backgroundImageColor = backgroundImageColor
    )

    //Elevation
    @Composable
    fun itemElevation(
        defaultElevation: Dp = HakiItemTokens.ContainerElevation,
        pressedElevation: Dp = HakiItemTokens.PressedContainerElevation,
        focusedElevation: Dp = HakiItemTokens.FocusContainerElevation,
        hoveredElevation: Dp = HakiItemTokens.HoverContainerElevation,
        disabledElevation: Dp = HakiItemTokens.DisabledContainerElevation
    ): HakiElevation = HakiElevation(
        defaultElevation = defaultElevation,
        pressedElevation = pressedElevation,
        focusedElevation = focusedElevation,
        hoveredElevation = hoveredElevation,
        disabledElevation = disabledElevation
    )

}
