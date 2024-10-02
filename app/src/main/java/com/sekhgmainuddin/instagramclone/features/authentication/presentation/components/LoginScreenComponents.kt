package com.sekhgmainuddin.instagramclone.features.authentication.presentation.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sekhgmainuddin.instagramclone.R
import com.sekhgmainuddin.instagramclone.core.styles.app_texts.AppTextExtraBold14
import com.sekhgmainuddin.instagramclone.core.styles.app_texts.AppTextRegular14
import com.sekhgmainuddin.instagramclone.core.styles.app_texts.AppTextStyle
import com.sekhgmainuddin.instagramclone.core.styles.theme.AppColors

@Preview(
    showBackground = true,
    backgroundColor = 0xFFFFFFFF,
)
@Composable
fun PasswordField(
    modifier: Modifier = Modifier,
    label: String = "Hello",
    text: TextFieldValue? = null,
    onValueChange: (TextFieldValue) -> Unit = {}
) {
    var passwordIsVisible by remember { mutableStateOf(false) }
    val visualTransformation = if (passwordIsVisible) {
        VisualTransformation.None
    } else {
        PasswordVisualTransformation()
    }


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
        visualTransformation = visualTransformation,
        trailingIcon = {
            IconButton(onClick = { passwordIsVisible = !passwordIsVisible }) {
                Icon(
                    painter = painterResource(id = if (passwordIsVisible) R.drawable.baseline_visibility_24 else R.drawable.baseline_visibility_off_24),
                    contentDescription = "Toggle Password Visibility",
                    tint = AppColors.TextColor1
                )
            }
        },
    )
}

@Composable
fun OrSeparator(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .padding(top = 35.dp, bottom = 25.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        HorizontalDivider(
            modifier = Modifier.weight(1f),
            color = AppColors.Black.copy(
                alpha = 0.22f
            ),
            thickness = 0.5.dp
        )
        AppTextExtraBold14(
            modifier = Modifier.padding(horizontal = 10.dp),
            text = stringResource(R.string.or)
        )
        HorizontalDivider(
            modifier = Modifier.weight(1f),
            color = AppColors.Black.copy(
                alpha = 0.22f
            ),
            thickness = 0.5.dp
        )
    }
}