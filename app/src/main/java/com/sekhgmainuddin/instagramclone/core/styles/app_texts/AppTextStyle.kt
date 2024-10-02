package com.sekhgmainuddin.instagramclone.core.styles.app_texts

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.sekhgmainuddin.instagramclone.core.styles.theme.AppColors

object AppTextStyle {
    // Regular
    val regular14 = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        color = AppColors.TextColor1
    )

    // Medium
    val medium14 = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
        color = AppColors.TextColor1
    )

    // Semi Bold
    val semiBold12 = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.SemiBold,
        color = AppColors.TextColor1
    )
    val semiBold14 = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.SemiBold,
        color = AppColors.TextColor1
    )

    // Bold
    val bold12 = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
        color = AppColors.TextColor1
    )
    val bold14 = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        color = AppColors.TextColor1
    )
    val bold18 = TextStyle(
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        color = AppColors.TextColor1
    )

    // Extra Bold
    val extraBold14 = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.ExtraBold,
        color = AppColors.TextColor1
    )
}