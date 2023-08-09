package com.example.test.component.item

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.test.R
import com.example.test.component.dimens.HakiBorder
import com.example.test.component.dimens.HakiElevation
import com.example.test.component.dimens.HakiItemColor


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SquareTextInItem(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String = "",
    textStyle: TextStyle = TextStyle(textAlign = TextAlign.Center),
    textPadding: PaddingValues = PaddingValues(4.dp),
    enabled: Boolean = true,
    shape: Shape = HakiItemDefaults.shape,
    colors: HakiItemColor = HakiItemDefaults.itemColorsTextIn(),
    elevations: HakiElevation = HakiItemDefaults.itemElevation(),
    borders: HakiBorder = HakiItemDefaults.itemBorders(),
    contentPadding: PaddingValues = HakiItemDefaults.ContentPadding,
    contentMargin: PaddingValues = HakiItemDefaults.ContentMargin,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    icon: (@Composable () -> Unit)? = null,
    iconSize: Dp = 40.dp,
    addIcon: (@Composable () -> Unit)? = null
) {
    Box(
        modifier = modifier
            .wrapContentSize()
            .padding(contentMargin),
    ) {
        Surface(
            onClick = {
                if (enabled) onClick()
            },
            modifier = Modifier,
            shape = shape,
            color = colors.containerColor,
            tonalElevation = elevations.defaultElevation,
            shadowElevation = elevations.defaultElevation,
            border = BorderStroke(borders.width, borders.color),
            interactionSource = interactionSource
        ) {
            Column(
                modifier = Modifier.padding(contentPadding),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                if (icon != null) icon() else {
                    Image(
                        painter = painterResource(id = R.drawable.ic_launcher_background),
                        contentDescription = null,
                        modifier = Modifier
                            .height(100.dp)
                            .background(HakiItemTokens.BackgroundImageColor),
                        contentScale = ContentScale.Crop,
                    )
                }
                Text(
                    text = text,
                    modifier = Modifier.padding(textPadding),
                    style = textStyle.copy(color = colors.contentColor)
                )
            }
        }
        if (addIcon != null)
            Box(modifier = Modifier
                .align(Alignment.TopEnd)
                .size(iconSize)) {
                addIcon()
            }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SquareTextOutItem(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String = "",
    textStyle: TextStyle = TextStyle(textAlign = TextAlign.Center),
    textPadding: PaddingValues = PaddingValues(4.dp),
    enabled: Boolean = true,
    shape: Shape = HakiItemDefaults.shape,
    colors: HakiItemColor = HakiItemDefaults.itemColorsTextOut(),
    elevations: HakiElevation = HakiItemDefaults.itemElevation(),
    borders: HakiBorder = HakiItemDefaults.itemBorders(),
    contentPadding: PaddingValues = HakiItemDefaults.ContentPadding,
    contentMargin: PaddingValues = HakiItemDefaults.ContentMargin,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    icon: (@Composable () -> Unit)? = null,
    iconSize: Dp = 40.dp,
    addIcon: (@Composable () -> Unit)? = null
) {
    Column(
        modifier = modifier
            .wrapContentSize()
            .padding(contentMargin), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box() {
            Surface(
                onClick = {
                    if (enabled) onClick()
                },
                modifier = Modifier
                    .wrapContentSize()
                    .padding(contentPadding).aspectRatio(1f),
                shape = shape,
                color = colors.containerColor,
                tonalElevation = elevations.defaultElevation,
                shadowElevation = elevations.defaultElevation,
                border = BorderStroke(borders.width, borders.color),
                interactionSource = interactionSource
            ) {
                if (icon != null) icon() else {
                    Image(
                        painter = painterResource(id = R.drawable.ic_launcher_background),
                        contentDescription = null,
                        modifier = Modifier
                            .height(100.dp)
                            .background(HakiItemTokens.BackgroundImageColor),
                        contentScale = ContentScale.Crop,
                    )
                }
            }
            if (addIcon != null)
                Box(modifier = Modifier
                    .align(Alignment.TopEnd)
                    .size(iconSize)) {
                    addIcon()
                }
        }
        Text(
            text = text,
            modifier = Modifier.padding(textPadding),
            style = textStyle.copy(color = colors.contentColor)
        )
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CircleItem(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String = "",
    textStyle: TextStyle = TextStyle(textAlign = TextAlign.Center),
    textPadding: PaddingValues = PaddingValues(4.dp),
    enabled: Boolean = true,
    shape: Shape = CircleShape,
    colors: HakiItemColor = HakiItemDefaults.itemColorsTextOut(),
    elevations: HakiElevation = HakiItemDefaults.itemElevation(),
    borders: HakiBorder = HakiItemDefaults.itemBorders(),
    contentPadding: PaddingValues = HakiItemDefaults.ContentPadding,
    contentMargin: PaddingValues = HakiItemDefaults.ContentMargin,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    icon: (@Composable () -> Unit)? = null,
    iconSize: Dp = 40.dp,
    addIcon: (@Composable () -> Unit)? = null
) {
    Column(
        modifier = modifier
            .wrapContentSize()
            .padding(contentMargin), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box() {
            Surface(
                onClick = {
                    if (enabled) onClick()
                },
                modifier = Modifier
                    .wrapContentSize()
                    .padding(contentPadding).aspectRatio(1f),
                shape = shape,
                color = colors.containerColor,
                tonalElevation = elevations.defaultElevation,
                shadowElevation = elevations.defaultElevation,
                border = BorderStroke(borders.width, borders.color),
                interactionSource = interactionSource
            ) {
                if (icon != null) icon() else {
                    Image(
                        painter = painterResource(id = R.drawable.ic_launcher_background),
                        contentDescription = null,
                        modifier = Modifier
                            .height(100.dp)
                            .background(HakiItemTokens.BackgroundImageColor),
                        contentScale = ContentScale.Crop,
                    )
                }
            }
            if (addIcon != null)
                Box(modifier = Modifier
                    .align(Alignment.TopEnd)
                    .size(iconSize)) {
                    addIcon()
                }
        }
        Text(
            text = text,
            modifier = Modifier.padding(textPadding),
            style = textStyle.copy(color = colors.contentColor)
        )
    }
}


@Preview
@Composable
fun previewItem() {
    Column() {
        SquareTextInItem(onClick = { /*TODO*/ })

        SquareTextOutItem(onClick = { /*TODO*/ })

        CircleItem(onClick = { /*TODO*/ })
    }
}