package com.sekhgmainuddin.instagramclone.core.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sekhgmainuddin.instagramclone.core.styles.app_texts.AppTextBold14
import com.sekhgmainuddin.instagramclone.core.styles.app_texts.AppTextRegular14
import com.sekhgmainuddin.instagramclone.core.styles.app_texts.AppTextStyle
import com.sekhgmainuddin.instagramclone.core.styles.theme.AppColors

@Composable
fun AppTextField(
    modifier: Modifier = Modifier,
    label: String = "Hello",
    text: TextFieldValue?,
    onValueChange: (TextFieldValue) -> Unit
) {
    TextField(
        modifier = modifier
            .border(
                width = 1.dp,
                color = AppColors.TextFieldBorderColor,
                shape = RoundedCornerShape(6.dp)
            )
            .height(
                50.dp,
            )
            .fillMaxWidth(),
        value = text ?: TextFieldValue(""),
        onValueChange = onValueChange,
        label = { AppTextRegular14(text = label) },
        textStyle = AppTextStyle.medium14,
        shape = RoundedCornerShape(6.dp),
        colors = TextFieldDefaults.colors(
            unfocusedContainerColor = AppColors.TextFieldBackgroundColor,
            focusedContainerColor = AppColors.TextFieldBackgroundColor,
            errorContainerColor = AppColors.TextFieldBackgroundColor,
            disabledContainerColor = AppColors.TextFieldBackgroundColor,
            focusedIndicatorColor = AppColors.Transparent,
            errorIndicatorColor = AppColors.Transparent,
            disabledIndicatorColor = AppColors.Transparent,
            unfocusedIndicatorColor = AppColors.Transparent,
        ),
        singleLine = true,
    )
}

@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    height: Dp = 42.dp,
    width: Dp? = null,
    text: String = "Hello",
    textColor: Color = AppColors.White,
    onClick: () -> Unit,
    content: @Composable (() -> Unit?)? = null,
) {
    Button(
        modifier = modifier
            .then(
                if (width != null) Modifier.width(width) else Modifier.fillMaxWidth()
            )
            .height(height),
        onClick = onClick,
        shape = RoundedCornerShape(6.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = AppColors.PrimaryVariantBlue,
        ),
    ) {
        if (content != null)
            content()
        else
            AppTextBold14(
                text = text,
                color = textColor,
            )
    }
}
