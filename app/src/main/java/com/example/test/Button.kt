//package com.example.test
//
//import androidx.compose.foundation.BorderStroke
//import androidx.compose.foundation.border
//import androidx.compose.foundation.interaction.MutableInteractionSource
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.PaddingValues
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.RowScope
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Favorite
//import androidx.compose.material3.Button
//import androidx.compose.material3.ButtonDefaults
//import androidx.compose.material3.ButtonElevation
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.remember
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.Shape
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//
//
//sealed class HakiButtonStyle(val colors: ButtonColors) {
//
//    data class Simple(
//        val color: ButtonColors = ButtonColors(
//            leadingIconColor = Color.White,
//            trailingIconColor = Color.White,
//            titleColor = Color.Red
//        ),
//
//        ) :
//        HakiButtonStyle(colors = color)
//
//    data class Complex(
//        val color: ButtonColors = ButtonColors(
//            leadingIconColor = Color.White,
//            trailingIconColor = Color.White,
//            titleColor = Color.Black
//        )
//    ) :
//        HakiButtonStyle(colors = color)
//
//    data class Default(
//        val color: ButtonColors = ButtonColors(
//            leadingIconColor = Color.White,
//            trailingIconColor = Color.White,
//            titleColor = Color.Black
//        )
//    ) :
//        HakiButtonStyle(colors = color)
//}
//
//@Composable
//fun MainButton(
//    onClick: () -> Unit,
//    modifier: Modifier = Modifier,
//    enabled: Boolean = true,
//    shape: ButtonShape = HakiButtonDefault.shape(),
//    colors: Color = MaterialTheme.colorScheme.onPrimary,
////    elevation: ButtonElevation? = HakiButtonDefault.buttonElevation(),
//    border: ButtonBorder? = HakiButtonDefault.border(),
//    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
//    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
//    content: @Composable RowScope.() -> Unit
//) {
//
//
//
//
//}
//
//
//@Composable
//fun HakiButton(
//    modifier: Modifier = Modifier,
//    background: ButtonBackground = HakiButtonDefault.background(),
//    colors: ButtonColors = HakiButtonDefault.colors(),
//    border: ButtonBorder = HakiButtonDefault.border(),
//    dimens: ButtonDimens = HakiButtonDefault.dimens(),
//    enabled: Boolean = true,
//    textStyle: ButtonTextStyle = HakiButtonDefault.textStyle(),
//    text: String,
//    onClick: () -> Unit,
//    leadingIcon: AdaptiveIcon? = null,
//    trailingIcon: AdaptiveIcon? = null,
//) {
//
//    val backgroundModifier = background.content()
//
//    val borderModifier = if (border.width > 0.dp) {
//        Modifier.border(
//            width = border.width,
//            color = border.color,
//            shape = RoundedCornerShape(percent = dimens.radiusPercent)
//        )
//    } else {
//        Modifier
//    }
//
//    Row(
//        modifier = modifier
//            .clip(shape = RoundedCornerShape(percent = dimens.radiusPercent))
//            .backgroundModifier()
//            .then(borderModifier)
//            .clickable(enabled = enabled) {
//                onClick()
//            },
//        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.SpaceEvenly
//    ) {
//        Spacer(modifier = Modifier.width(16.dp))
//        Box(
//            modifier = Modifier
//                .size(24.dp),
//            contentAlignment = Alignment.Center,
//        ) {
//            if (leadingIcon != null) leadingIcon.content(colors.leadingIconColor).invoke()
//        }
//
//        Box(
//            modifier = Modifier
//                .padding(
//                    top = dimens.paddingTop,
//                    bottom = dimens.paddingBottom,
//                    start = dimens.paddingStart,
//                    end = dimens.paddingEnd
//                )
//                .weight(1f),
//        ) {
//
//            val textAlignmentModifier = remember {
//                if (textStyle.position == TextPosition.CENTER) Modifier.align(Alignment.Center)
//                else Modifier.align(
//                    Alignment.CenterStart
//                )
//            }
//
//            Text(
//                text = text,
//                color = colors.titleColor,
//                style = textStyle.style,
//                modifier = textAlignmentModifier.padding(horizontal = 8.dp)
//            )
//        }
//
//        Box(
//            modifier = Modifier
//                .size(24.dp),
//            contentAlignment = Alignment.Center,
//        ) {
//            if (trailingIcon != null) trailingIcon.content(colors.trailingIconColor).invoke()
//        }
//
//        Spacer(modifier = Modifier.width(16.dp))
//
//    }
//
//    Button() {
//
//    }
//
//}
//
//
//@Composable
//fun MinhButton(style: HakiButtonStyle) {
//    HakiButton(text = "", onClick = { /*TODO*/ }, colors = style.colors)
//}
//
////@Composable
////fun Example(){
////    Column(){
////        MinhButton(style = HakiButtonStyle.Complex().copy(color = ButtonColors()))
////    }
////}
//
//
//@Preview
//@Composable
//private fun HakiButtonPreview() {
//
////    HakiButton(
////        modifier = Modifier.width(256.dp),
////        text = "Save",
////        leadingIcon = AdaptiveIcon.icon(Icons.Default.Favorite),
////        trailingIcon = AdaptiveIcon.icon(Icons.Default.Favorite),
////        onClick = { }
////    )
//
//}