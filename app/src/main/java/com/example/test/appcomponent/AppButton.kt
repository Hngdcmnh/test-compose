package com.example.test.appcomponent

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
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
import com.example.test.component.button.HakiButton
import com.example.test.component.button.HakiButtonDefaults
import com.example.test.component.dimens.HakiBorder
import com.example.test.component.dimens.HakiButtonColor
import com.example.test.component.dimens.HakiElevation
import com.example.test.ui.theme.montserrat
import com.example.test.ui.theme.primary
import com.example.test.ui.theme.textLight
import com.example.test.ui.theme.white

@Composable
fun CircleRoundedButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String = "",
    textStyle: TextStyle? = null,
    textPadding: PaddingValues? = PaddingValues(2.dp),
    enabled: Boolean = true,
    shape: Shape = RoundedCornerShape(50.dp),
    colors: HakiButtonColor = HakiButtonDefaults.mainButtonColors().copy(
        containerColor = primary,
        contentColor = textLight,
    ),
    elevations: HakiElevation = HakiButtonDefaults.mainButtonElevation().copy(
        defaultElevation = 4.dp,
        pressedElevation = 4.dp,
    ),
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
fun RectangleRoundedButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String = "",
    textStyle: TextStyle? = null,
    textPadding: PaddingValues? = PaddingValues(2.dp),
    enabled: Boolean = true,
    shape: Shape = RoundedCornerShape(10.dp),
    colors: HakiButtonColor = HakiButtonDefaults.mainButtonColors().copy(
        containerColor = primary,
        contentColor = textLight,
    ),
    elevations: HakiElevation = HakiButtonDefaults.mainButtonElevation().copy(
        defaultElevation = 4.dp,
        pressedElevation = 4.dp,
    ),
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
        contentPadding = contentPadding,
        contentMargin = contentMargin,
        interactionSource = interactionSource,
        trailingIcon = trailingIcon,
        leadingIcon = leadingIcon,
    )
}

@Composable
fun AddButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String = "",
    textStyle: TextStyle? = null,
    textPadding: PaddingValues? = PaddingValues(2.dp),
    enabled: Boolean = true,
    shape: Shape = RoundedCornerShape(10.dp),
    colors: HakiButtonColor = HakiButtonDefaults.mainButtonColors().copy(
        containerColor = primary,
        contentColor = textLight,
    ),
    elevations: HakiElevation = HakiButtonDefaults.mainButtonElevation().copy(
        defaultElevation = 4.dp,
        pressedElevation = 4.dp,
    ),
    contentPadding: PaddingValues = HakiButtonDefaults.ContentPadding,
    contentMargin: PaddingValues = HakiButtonDefaults.ContentMargin,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    trailingIcon: (@Composable () -> Unit)? = null,
    leadingIcon: (@Composable () -> Unit)? = {
        Icon(imageVector = Icons.Filled.Add, "", tint = white)
    }
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
        contentPadding = contentPadding,
        contentMargin = contentMargin,
        interactionSource = interactionSource,
        trailingIcon = trailingIcon,
        leadingIcon = leadingIcon,
    )
}

@Composable
fun IconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: HakiButtonColor = HakiButtonDefaults.mainButtonColors().copy(
        containerColor = primary,
        contentColor = textLight,
    ),
    elevations: HakiElevation = HakiButtonDefaults.mainButtonElevation().copy(
        defaultElevation = 4.dp,
        pressedElevation = 4.dp,
    ),
    contentPadding: PaddingValues = PaddingValues(20.dp),
    contentMargin: PaddingValues = HakiButtonDefaults.ContentMargin,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    icon: (@Composable () -> Unit)? = {
        Icon(imageVector = Icons.Filled.Add, "", tint = white)
    }
) {
    HakiButton(
        onClick = onClick,
        modifier = modifier,
        text = "",
        textPadding = PaddingValues(0.dp),
        enabled = enabled,
        shape = CircleShape,
        colors = colors,
        elevations = elevations,
        contentPadding = contentPadding,
        contentMargin = contentMargin,
        interactionSource = interactionSource,
        leadingIcon = icon,
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RectangleFillButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String = "",
    textStyle: TextStyle? = null,
    textPadding: PaddingValues? = PaddingValues(2.dp),
    enabled: Boolean = true,
    shape: Shape = RoundedCornerShape(50.dp),
    colors: HakiButtonColor = HakiButtonDefaults.mainButtonColors().copy(
        containerColor = primary,
        contentColor = textLight,
    ),
    elevations: HakiElevation = HakiButtonDefaults.mainButtonElevation().copy(
        defaultElevation = 4.dp,
        pressedElevation = 4.dp,
    ),
    borders: HakiBorder = HakiButtonDefaults.mainButtonBorders(),
    contentPadding: PaddingValues = HakiButtonDefaults.ContentPadding,
    contentMargin: PaddingValues = HakiButtonDefaults.ContentMargin,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    trailingIcon: (@Composable () -> Unit)? = null,
    leadingIcon: (@Composable () -> Unit)? = null
) {
    Surface(
        onClick = {
            if (enabled) onClick()
        },
        modifier = modifier
            .fillMaxWidth()
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CircleFillButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String = "",
    textStyle: TextStyle? = null,
    textPadding: PaddingValues? = PaddingValues(2.dp),
    enabled: Boolean = true,
    shape: Shape = RoundedCornerShape(50.dp),
    colors: HakiButtonColor = HakiButtonDefaults.mainButtonColors().copy(
        containerColor = primary,
        contentColor = textLight,
    ),
    elevations: HakiElevation = HakiButtonDefaults.mainButtonElevation().copy(
        defaultElevation = 4.dp,
        pressedElevation = 4.dp,
    ),
    borders: HakiBorder = HakiButtonDefaults.mainButtonBorders(),
    contentPadding: PaddingValues = HakiButtonDefaults.ContentPadding,
    contentMargin: PaddingValues = HakiButtonDefaults.ContentMargin,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    trailingIcon: (@Composable () -> Unit)? = null,
    leadingIcon: (@Composable () -> Unit)? = null
) {
    Surface(
        onClick = {
            if (enabled) onClick()
        },
        modifier = modifier
            .fillMaxWidth()
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
fun previewAppButton() {
    Column() {
        CircleRoundedButton(onClick = { /*TODO*/ }, text = "Click me")
        RectangleRoundedButton(onClick = { /*TODO*/ }, text = "Click me")
        AddButton(onClick = { /*TODO*/ }, text = "Click me")
        IconButton(onClick = { /*TODO*/ })
    }
}