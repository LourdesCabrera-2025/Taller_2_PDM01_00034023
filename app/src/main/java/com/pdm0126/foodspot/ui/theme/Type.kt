package com.pdm0126.foodspot.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.pdm0126.foodspot.R


val PlusJakartaSans = FontFamily(

    Font(
        R.font.plusjakartasans_light,
        FontWeight.Light
    ),
    Font(
        R.font.plusjakartasans_regular,
        FontWeight.Normal
    ),
    Font(
        R.font.plusjakartasans_medium,
        FontWeight.Medium
    ),
    Font(
        R.font.plusjakartasans_bold,
        FontWeight.Bold
    )
)

val  Typography = Typography (

    headlineLarge = TextStyle(
        fontFamily = PlusJakartaSans,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp
    ),
    titleLarge = TextStyle(
        fontFamily = PlusJakartaSans,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = PlusJakartaSans,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)