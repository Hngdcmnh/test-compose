//package com.example.test
//
//
//import androidx.compose.foundation.background
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Brush
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.unit.Dp
//import androidx.compose.ui.unit.dp
//
//
//object HakiButtonDefault {
//    @Composable
//    fun background(color: Color = MaterialTheme.colorScheme.primary): ButtonBackground =
//        ButtonBackground.Color(color)
//
//    @Composable
//    fun background(brush: Brush): ButtonBackground = ButtonBackground.Brush(brush)
//
//    @Composable
//    fun border(
//        color: Color = MaterialTheme.colorScheme.primary,
//        width: Dp = 0.dp
//    ) = ButtonBorder(color, width)
//
//    @Composable
//    fun contentPadding() =
//
//    @Composable
//    fun colors(
//        titleColor: Color = MaterialTheme.colorScheme.onPrimary,
//        leadingIconColor: Color = MaterialTheme.colorScheme.onPrimary,
//        trailingIconColor: Color = MaterialTheme.colorScheme.onPrimary
//    ) = ButtonColors(
//        titleColor = titleColor,
//        leadingIconColor = leadingIconColor,
//        trailingIconColor = trailingIconColor
//    )
//
//    fun dimens(
//        radiusPercent: Int = 50,
//        paddingTop: Dp = 16.dp,
//        paddingStart: Dp = 4.dp,
//        paddingEnd: Dp = 4.dp,
//        paddingBottom: Dp = 16.dp,
//    ) = ButtonDimens(
//        radiusPercent = radiusPercent,
//        paddingTop = paddingTop,
//        paddingStart = paddingStart,
//        paddingEnd = paddingEnd,
//        paddingBottom = paddingBottom
//    )
//
//    @Composable
//    fun textStyle(
//        position: TextPosition = TextPosition.CENTER,
//        style: TextStyle = MaterialTheme.typography.labelLarge,
//    ) = ButtonTextStyle(
//        position = position,
//        style = style
//    )
//
//    fun shape(roundedCircle:Int = 20) = ButtonShape(roundedCircle = roundedCircle)
//}
//
//data class ButtonShape(val roundedCircle:Int)
//
//data class ButtonColors(
//    val titleColor: Color,
//    val leadingIconColor: Color,
//    val trailingIconColor: Color
//)
//
//data class ButtonDimens(
//    val radiusPercent: Int,
//    val paddingTop: Dp,
//    val paddingStart: Dp,
//    val paddingEnd: Dp,
//    val paddingBottom: Dp,
//)
//
//sealed class ButtonBackground {
//
//    abstract fun content(): Modifier.() -> Modifier
//    data class Color(val color: androidx.compose.ui.graphics.Color) : ButtonBackground() {
//        override fun content(): Modifier.() -> Modifier = { background(color = color) }
//    }
//
//    data class Brush(val brush: androidx.compose.ui.graphics.Brush) : ButtonBackground() {
//        override fun content(): Modifier.() -> Modifier = { background(brush = brush) }
//    }
//}
//
//data class ButtonBorder(
//    val color: Color,
//    val width: Dp,
//)
//
//data class ButtonTextStyle(
//    val position: TextPosition,
//    val style: TextStyle,
//)