package com.example.test.component.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.test.component.dimens.HakiBorder
import com.example.test.component.dimens.HakiButtonColor
import com.example.test.component.dimens.HakiElevation
import com.example.test.ui.theme.montserrat

@Composable
fun MainButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String = "",
    textStyle: TextStyle = TextStyle.Default,
    textPadding: PaddingValues? = PaddingValues(2.dp),
    enabled: Boolean = true,
    shape: Shape = HakiButtonDefaults.shape,
    colors: HakiButtonColor = HakiButtonDefaults.mainButtonColors(),
    elevations: HakiElevation = HakiButtonDefaults.mainButtonElevation(),
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
        textStyle = textStyle,
        textPadding = textPadding,
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
    textStyle: TextStyle = TextStyle.Default,
    textPadding: PaddingValues? = PaddingValues(2.dp),
    enabled: Boolean = true,
    shape: Shape = HakiButtonDefaults.shape,
    colors: HakiButtonColor = HakiButtonDefaults.outlinedButtonColors(),
    elevations: HakiElevation = HakiButtonDefaults.outlinedButtonElevations(),
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
        textStyle = textStyle,
        textPadding = textPadding,
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
    textStyle: TextStyle = TextStyle.Default,
    textPadding: PaddingValues? = PaddingValues(2.dp),
    enabled: Boolean = true,
    shape: Shape = HakiButtonDefaults.shape,
    colors: HakiButtonColor = HakiButtonDefaults.elevatedButtonColors(),
    elevations: HakiElevation = HakiButtonDefaults.elevatedButtonElevations(),
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
        textStyle = textStyle,
        textPadding = textPadding,
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
    textStyle: TextStyle? = null,
    textPadding: PaddingValues? = null,
    enabled: Boolean = true,
    shape: Shape = HakiButtonDefaults.shape,
    colors: HakiButtonColor = HakiButtonDefaults.mainButtonColors(),
    elevations: HakiElevation = HakiButtonDefaults.mainButtonElevation(),
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
        Row(
            modifier = Modifier.padding(contentPadding),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (leadingIcon != null) leadingIcon()
            Text(
                modifier = Modifier.padding(textPadding?: PaddingValues(2.dp)),
                text = text,
                style = (textStyle ?: TextStyle.Default).copy(
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = montserrat,
                    color = colors.contentColor
                )
            )
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