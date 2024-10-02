package com.sekhgmainuddin.instagramclone.core.styles.app_texts

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import com.sekhgmainuddin.instagramclone.core.styles.theme.AppColors

// Regular
@Composable
fun AppTextRegular14(modifier: Modifier = Modifier, text: String) {
    Text(
        text = text,
        style = AppTextStyle.regular14,
        modifier = modifier
    )
}

// Medium
@Composable
fun AppTextMedium14(modifier: Modifier = Modifier, text: String) {
    Text(
        text = text,
        style = AppTextStyle.medium14,
        modifier = modifier
    )
}

// SemiBold
@Composable
fun AppTextSemiBold14(modifier: Modifier = Modifier, text: String, textAlign: TextAlign? = null) {
    Text(
        text = text,
        style = AppTextStyle.semiBold14,
        modifier = modifier,
        textAlign = textAlign
    )
}

// Bold
@Composable
fun AppTextBold12(modifier: Modifier = Modifier, text: String, color: Color? = null) {
    Text(
        text = text,
        style = AppTextStyle.bold12.copy(
            color = color ?: AppColors.TextColor1
        ),
        modifier = modifier
    )
}
@Composable
fun AppTextBold14(modifier: Modifier = Modifier, text: String, color: Color? = null) {
    Text(
        text = text,
        style = AppTextStyle.bold14.copy(
            color = color ?: AppColors.TextColor1
        ),
        modifier = modifier
    )
}
@Composable
fun AppTextBold18(modifier: Modifier = Modifier, text: String, color: Color? = null) {
    Text(
        text = text,
        style = AppTextStyle.bold18.copy(
            color = color ?: AppColors.TextColor1
        ),
        modifier = modifier
    )
}

// Extra Bold
@Composable
fun AppTextExtraBold14(modifier: Modifier = Modifier, text: String) {
    Text(
        text = text,
        style = AppTextStyle.extraBold14,
        modifier = modifier
    )
}