package com.example.test.appcomponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
import com.example.test.component.item.HakiItemDefaults
import com.example.test.component.item.CircleItem
import com.example.test.component.item.SquareTextOutItem
import com.example.test.ui.theme.tertiaryBackground

@Composable
fun CircleImageItem(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String = "",
    textStyle: TextStyle = TextStyle(textAlign = TextAlign.Center),
    textPadding: PaddingValues = PaddingValues(4.dp),
    enabled: Boolean = true,
    colors: HakiItemColor = HakiItemDefaults.itemColorsTextOut()
        .copy(containerColor = tertiaryBackground),
    elevations: HakiElevation = HakiItemDefaults.itemElevation(),
    borders: HakiBorder = HakiItemDefaults.itemBorders()
        .copy(width = 0.dp, color = Color.Transparent),
    contentPadding: PaddingValues = HakiItemDefaults.ContentPadding,
    contentMargin: PaddingValues = HakiItemDefaults.ContentMargin,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    image: (@Composable () -> Unit)? = null,
    addIcon: (@Composable () -> Unit)? = null
) {
    CircleItem(
        onClick = onClick,
        modifier = modifier,
        text = text,
        textStyle = textStyle,
        textPadding = textPadding,
        enabled = enabled,
        colors = colors,
        elevations = elevations,
        borders = borders,
        contentPadding = contentPadding,
        contentMargin = contentMargin,
        interactionSource = interactionSource,
        icon = image,
        addIcon = addIcon,
    )
}

@Composable
fun SquareImageItem(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String = "",
    textStyle: TextStyle = TextStyle(textAlign = TextAlign.Center),
    textPadding: PaddingValues = PaddingValues(4.dp),
    enabled: Boolean = true,
    shape: Shape = RoundedCornerShape(24.dp),
    colors: HakiItemColor = HakiItemDefaults.itemColorsTextOut()
        .copy(containerColor = tertiaryBackground),
    elevations: HakiElevation = HakiItemDefaults.itemElevation(),
    borders: HakiBorder = HakiItemDefaults.itemBorders()
        .copy(width = 0.dp, color = Color.Transparent),
    contentPadding: PaddingValues = HakiItemDefaults.ContentPadding,
    contentMargin: PaddingValues = HakiItemDefaults.ContentMargin,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    image: (@Composable () -> Unit)? = null,
    iconSize: Dp = 40.dp,
    addIcon: (@Composable () -> Unit)? = null
) {
    SquareTextOutItem(
        onClick = onClick,
        modifier = modifier,
        text = text,
        textStyle = textStyle,
        textPadding = textPadding,
        enabled = enabled,
        colors = colors,
        shape = shape,
        elevations = elevations,
        borders = borders,
        contentPadding = contentPadding,
        contentMargin = contentMargin,
        interactionSource = interactionSource,
        icon = image,
        iconSize = iconSize,
        addIcon = addIcon,
    )
}


@Preview
@Composable
fun previewItem() {
    Column() {
        CircleImageItem(onClick = { /*TODO*/ }, text = "Item", image = {
            Image(
                painter = painterResource(id = R.drawable.funny_burp),
                contentDescription = "",
                contentScale = ContentScale.Crop
            )
        }, addIcon = {
            Image(
                painter = painterResource(id = R.drawable.funny_burp),
                contentDescription = "",
                contentScale = ContentScale.Crop
            )
        })
    }
}