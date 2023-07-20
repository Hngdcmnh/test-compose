package com.example.test.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import com.example.test.button.HakiButtonTokens.ButtonCornerShape
import com.example.test.button.HakiButtonTokens.ButtonHorizontalMargin
import com.example.test.button.HakiButtonTokens.ButtonHorizontalPadding
import com.example.test.button.HakiButtonTokens.ButtonVerticalMargin
import com.example.test.button.HakiButtonTokens.ButtonVerticalPadding

object HakiButtonDefaults {
    //Padding
    val ContentPadding =
        PaddingValues(
            start = ButtonHorizontalPadding,
            top = ButtonVerticalPadding,
            end = ButtonHorizontalPadding,
            bottom = ButtonVerticalPadding
        )

    //Margin
    val ContentMargin =
        PaddingValues(
            start = ButtonHorizontalMargin,
            top = ButtonVerticalMargin,
            end = ButtonHorizontalMargin,
            bottom = ButtonVerticalMargin
        )

    //Shape(rounded corner)
    val shape: Shape @Composable get() = RoundedCornerShape(ButtonCornerShape)

    //Border
    @Composable
    fun mainButtonBorders(
        width: Dp = HakiMainButtonTokens.OutlineWidth,
        color: Color = HakiMainButtonTokens.OutlineColor
    ): HakiBorder = HakiBorder(width = width, color = color)

    @Composable
    fun outlinedButtonBorders(
        width: Dp = HakiOutlinedButtonTokens.OutlineWidth,
        color: Color = HakiOutlinedButtonTokens.OutlineColor
    ): HakiBorder = HakiBorder(width = width, color = color)

    @Composable
    fun elevatedButtonBorders(
        width: Dp = HakiElevatedButtonTokens.OutlineWidth,
        color: Color = HakiElevatedButtonTokens.OutlineColor
    ): HakiBorder = HakiBorder(width = width, color = color)

    //Color
    @Composable
    fun mainButtonColors(
        containerColor: Color = HakiMainButtonTokens.ContainerColor,
        contentColor: Color = HakiMainButtonTokens.LabelTextColor,
        disabledContainerColor: Color = HakiMainButtonTokens.DisabledContainerColor.copy(alpha = HakiMainButtonTokens.DisabledContainerOpacity),
        disabledContentColor: Color = HakiMainButtonTokens.DisabledLabelTextColor.copy(alpha = HakiMainButtonTokens.DisabledLabelTextOpacity),
    ): HakiButtonColor = HakiButtonColor(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    fun elevatedButtonColors(
        containerColor: Color = HakiElevatedButtonTokens.ContainerColor,
        contentColor: Color = HakiElevatedButtonTokens.LabelTextColor,
        disabledContainerColor: Color = HakiElevatedButtonTokens.DisabledContainerColor.copy(alpha = HakiElevatedButtonTokens.DisabledContainerOpacity),
        disabledContentColor: Color = HakiElevatedButtonTokens.DisabledLabelTextColor.copy(alpha = HakiElevatedButtonTokens.DisabledLabelTextOpacity),
    ): HakiButtonColor = HakiButtonColor(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    fun outlinedButtonColors(
        containerColor: Color = HakiOutlinedButtonTokens.ContainerColor,
        contentColor: Color = HakiOutlinedButtonTokens.LabelTextColor,
        disabledContainerColor: Color = HakiOutlinedButtonTokens.DisabledContainerColor,
        disabledContentColor: Color = HakiOutlinedButtonTokens.DisabledLabelTextColor.copy(alpha = HakiOutlinedButtonTokens.DisabledLabelTextOpacity),
    ): HakiButtonColor = HakiButtonColor(
        containerColor = containerColor,
        contentColor = contentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    //Elevation
    @Composable
    fun mainButtonElevation(
        defaultElevation: Dp = HakiMainButtonTokens.ContainerElevation,
        pressedElevation: Dp = HakiMainButtonTokens.PressedContainerElevation,
        focusedElevation: Dp = HakiMainButtonTokens.FocusContainerElevation,
        hoveredElevation: Dp = HakiMainButtonTokens.HoverContainerElevation,
        disabledElevation: Dp = HakiMainButtonTokens.DisabledContainerElevation
    ): HakiButtonElevation = HakiButtonElevation(
        defaultElevation = defaultElevation,
        pressedElevation = pressedElevation,
        focusedElevation = focusedElevation,
        hoveredElevation = hoveredElevation,
        disabledElevation = disabledElevation
    )

    @Composable
    fun elevatedButtonElevations(
        defaultElevation: Dp = HakiElevatedButtonTokens.ContainerElevation,
        pressedElevation: Dp = HakiElevatedButtonTokens.PressedContainerElevation,
        focusedElevation: Dp = HakiElevatedButtonTokens.FocusContainerElevation,
        hoveredElevation: Dp = HakiElevatedButtonTokens.HoverContainerElevation,
        disabledElevation: Dp = HakiElevatedButtonTokens.DisabledContainerElevation
    ): HakiButtonElevation = HakiButtonElevation(
        defaultElevation = defaultElevation,
        pressedElevation = pressedElevation,
        focusedElevation = focusedElevation,
        hoveredElevation = hoveredElevation,
        disabledElevation = disabledElevation
    )

    @Composable
    fun outlinedButtonElevations(
        defaultElevation: Dp = HakiOutlinedButtonTokens.ContainerElevation,
        pressedElevation: Dp = HakiOutlinedButtonTokens.PressedContainerElevation,
        focusedElevation: Dp = HakiOutlinedButtonTokens.FocusContainerElevation,
        hoveredElevation: Dp = HakiOutlinedButtonTokens.HoverContainerElevation,
        disabledElevation: Dp = HakiOutlinedButtonTokens.DisabledContainerElevation
    ): HakiButtonElevation = HakiButtonElevation(
        defaultElevation = defaultElevation,
        pressedElevation = pressedElevation,
        focusedElevation = focusedElevation,
        hoveredElevation = hoveredElevation,
        disabledElevation = disabledElevation
    )

}

data class HakiBorder constructor(
    val width: Dp,
    val color: Color
)

data class HakiButtonColor constructor(
    val containerColor: Color,
    val contentColor: Color,
    val disabledContainerColor: Color,
    val disabledContentColor: Color,
)

data class HakiButtonElevation constructor(
    val defaultElevation: Dp,
    val pressedElevation: Dp,
    val focusedElevation: Dp,
    val hoveredElevation: Dp,
    val disabledElevation: Dp,
)


