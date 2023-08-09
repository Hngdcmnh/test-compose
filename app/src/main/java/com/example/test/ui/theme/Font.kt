package com.example.test.ui.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.test.R

val montserrat = FontFamily(
    Font(resId = R.font.montserrat_black, weight = FontWeight.Black),
    Font(resId = R.font.montserrat_extra_bold, weight = FontWeight.ExtraBold),
    Font(resId = R.font.montserrat_bold, weight = FontWeight.Bold),
    Font(resId = R.font.montserrat_semi_bold, weight = FontWeight.SemiBold),
    Font(resId = R.font.montserrat_medium, weight = FontWeight.Medium),
    Font(resId = R.font.montserrat_light, weight = FontWeight.Light),
    Font(resId = R.font.montserrat_extra_light, weight = FontWeight.ExtraLight),
    Font(resId = R.font.montserrat_thin, weight = FontWeight.Thin),
)

val roboto = FontFamily(
    Font(resId = R.font.roboto_black, weight = FontWeight.Black),
    Font(resId = R.font.roboto_bold, weight = FontWeight.Bold),
    Font(resId = R.font.roboto_medium, weight = FontWeight.Medium),
    Font(resId = R.font.roboto_light, weight = FontWeight.Light),
    Font(resId = R.font.roboto_thin, weight = FontWeight.Thin),
)