package com.sekhgmainuddin.instagramclone.core.styles.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.sekhgmainuddin.instagramclone.R

// Define the Inter font family with all weights and italics
val Inter = FontFamily(
    Font(R.font.inter_thin, FontWeight.Thin),
    Font(R.font.inter_thin_italic, FontWeight.Thin, style = FontStyle.Italic),
    Font(R.font.inter_extralight, FontWeight.ExtraLight),
    Font(R.font.inter_extralight_italic, FontWeight.ExtraLight, style = FontStyle.Italic),
    Font(R.font.inter_light, FontWeight.Light),
    Font(R.font.inter_light_italic, FontWeight.Light, style = FontStyle.Italic),
    Font(R.font.inter_regular, FontWeight.Normal),
    Font(R.font.inter_regular_italic, FontWeight.Normal, style = FontStyle.Italic),
    Font(R.font.inter_medium, FontWeight.Medium),
    Font(R.font.inter_medium_italic, FontWeight.Medium, style = FontStyle.Italic),
    Font(R.font.inter_semibold, FontWeight.SemiBold),
    Font(R.font.inter_semibold_italic, FontWeight.SemiBold, style = FontStyle.Italic),
    Font(R.font.inter_bold, FontWeight.Bold),
    Font(R.font.inter_bold_italic, FontWeight.Bold, style = FontStyle.Italic),
    Font(R.font.inter_extrabold, FontWeight.ExtraBold),
    Font(R.font.inter_extrabold_italic, FontWeight.ExtraBold, style = FontStyle.Italic),
    Font(R.font.inter_black, FontWeight.Black),
    Font(R.font.inter_black_italic, FontWeight.Black, style = FontStyle.Italic),
)

// Define the Typography object using the Inter font family
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Normal,
        fontSize = 28.sp,
        lineHeight = 42.sp,
        color = AppColors.Black,
    ),
    bodyMedium = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
        lineHeight = 30.sp,
        color = AppColors.Black,
    ),
    bodySmall = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        color = AppColors.Black,
    ),
    labelLarge = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        lineHeight = 21.sp,
        color = AppColors.Black,
    ),
    labelMedium = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.SemiBold,
        fontSize = 12.sp,
        lineHeight = 18.sp,
        color = AppColors.Black,
    ),
    labelSmall = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.SemiBold,
        fontSize = 10.sp,
        lineHeight = 15.sp,
        color = AppColors.Black,
    ),
)
