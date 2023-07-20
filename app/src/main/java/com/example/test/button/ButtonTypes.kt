package com.example.test.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MainButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String = "",
    enabled: Boolean = true,
    shape: Shape = HakiButtonDefaults.shape,
    colors: HakiButtonColor = HakiButtonDefaults.mainButtonColors(),
    elevations: HakiButtonElevation = HakiButtonDefaults.mainButtonElevation(),
    borders: HakiBorder = HakiButtonDefaults.mainButtonBorders(),
    contentPadding: PaddingValues = HakiButtonDefaults.ContentPadding,
    contentMargin: PaddingValues = HakiButtonDefaults.ContentMargin,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    trailingIcon: (@Composable () -> Unit)? = null,
    leadingIcon: (@Composable () -> Unit)? = null
) {
    HakiButton(
        onClick = onClick,
        modifier = modifier,
        text = text,
        enabled = enabled,
        shape = shape,
        colors = colors,
        elevations = elevations,
        borders = borders,
        contentPadding = contentPadding,
        contentMargin = contentMargin,
        interactionSource = interactionSource,
        trailingIcon = trailingIcon,
        leadingIcon = leadingIcon,
    )
}

@Composable
fun OutlineButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String = "",
    enabled: Boolean = true,
    shape: Shape = HakiButtonDefaults.shape,
    colors: HakiButtonColor = HakiButtonDefaults.outlinedButtonColors(),
    elevations: HakiButtonElevation = HakiButtonDefaults.outlinedButtonElevations(),
    borders: HakiBorder = HakiButtonDefaults.outlinedButtonBorders(),
    contentPadding: PaddingValues = HakiButtonDefaults.ContentPadding,
    contentMargin: PaddingValues = HakiButtonDefaults.ContentMargin,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    trailingIcon: (@Composable () -> Unit)? = null,
    leadingIcon: (@Composable () -> Unit)? = null
) {
    HakiButton(
        onClick = onClick,
        modifier = modifier,
        text = text,
        enabled = enabled,
        shape = shape,
        colors = colors,
        elevations = elevations,
        borders = borders,
        contentPadding = contentPadding,
        contentMargin = contentMargin,
        interactionSource = interactionSource,
        trailingIcon = trailingIcon,
        leadingIcon = leadingIcon,
    )
}

@Composable
fun ElevateButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String = "",
    enabled: Boolean = true,
    shape: Shape = HakiButtonDefaults.shape,
    colors: HakiButtonColor = HakiButtonDefaults.elevatedButtonColors(),
    elevations: HakiButtonElevation = HakiButtonDefaults.elevatedButtonElevations(),
    borders: HakiBorder = HakiButtonDefaults.elevatedButtonBorders(),
    contentPadding: PaddingValues = HakiButtonDefaults.ContentPadding,
    contentMargin: PaddingValues = HakiButtonDefaults.ContentMargin,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    trailingIcon: (@Composable () -> Unit)? = null,
    leadingIcon: (@Composable () -> Unit)? = null
) {
    HakiButton(
        onClick = onClick,
        modifier = modifier,
        text = text,
        enabled = enabled,
        shape = shape,
        colors = colors,
        elevations = elevations,
        borders = borders,
        contentPadding = contentPadding,
        contentMargin = contentMargin,
        interactionSource = interactionSource,
        trailingIcon = trailingIcon,
        leadingIcon = leadingIcon,
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HakiButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String = "",
    enabled: Boolean = true,
    shape: Shape = HakiButtonDefaults.shape,
    colors: HakiButtonColor = HakiButtonDefaults.mainButtonColors(),
    elevations: HakiButtonElevation = HakiButtonDefaults.mainButtonElevation(),
    borders: HakiBorder = HakiButtonDefaults.mainButtonBorders(),
    contentPadding: PaddingValues = HakiButtonDefaults.ContentPadding,
    contentMargin: PaddingValues = HakiButtonDefaults.ContentMargin,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    trailingIcon: (@Composable () -> Unit)? = null,
    leadingIcon: (@Composable () -> Unit)? = null,
) {
    Surface(
        onClick = {
            if (enabled) onClick()
        },
        modifier = modifier
            .wrapContentSize()
            .padding(contentMargin),
        shape = shape,
        color = colors.containerColor,
        tonalElevation = elevations.defaultElevation,
        shadowElevation = elevations.defaultElevation,
        border = BorderStroke(borders.width, borders.color),
        interactionSource = interactionSource
    ) {
        Row(modifier = Modifier.padding(contentPadding)) {
            if (leadingIcon != null) leadingIcon()
            Text(text, style = TextStyle(color = colors.contentColor))
            if (trailingIcon != null) trailingIcon()
        }
    }
}


@Preview
@Composable
fun previewButton() {
    Column() {
        MainButton(onClick = { /*TODO*/ }, text = "Main button")
        ElevateButton(onClick = { /*TODO*/ }, text = "Elevate button")
        OutlineButton(onClick = { /*TODO*/ }, text = "Outline button")
    }
}