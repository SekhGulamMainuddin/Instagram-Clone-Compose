package com.sekhgmainuddin.instagramclone.features.authentication.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sekhgmainuddin.instagramclone.R
import com.sekhgmainuddin.instagramclone.core.components.AppTextField
import com.sekhgmainuddin.instagramclone.core.components.PrimaryButton
import com.sekhgmainuddin.instagramclone.core.styles.app_texts.AppTextBold14
import com.sekhgmainuddin.instagramclone.core.styles.app_texts.AppTextSemiBold14
import com.sekhgmainuddin.instagramclone.core.styles.app_texts.AppTextStyle
import com.sekhgmainuddin.instagramclone.core.styles.theme.AppColors
import com.sekhgmainuddin.instagramclone.features.authentication.presentation.components.OrSeparator

@Preview
@Composable
fun SignUpScreen() {
    val email = remember {
        mutableStateOf(TextFieldValue())
    }
    val fullName = remember {
        mutableStateOf(TextFieldValue())
    }
    val userName = remember {
        mutableStateOf(TextFieldValue())
    }
    val password = remember {
        mutableStateOf(TextFieldValue())
    }

    Scaffold {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .padding(horizontal = 20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = painterResource(id = R.drawable.instagram_text_image),
                contentDescription = "Instagram Logo",
                modifier = Modifier.width(230.dp),
                contentScale = ContentScale.FillWidth
            )

            AppTextSemiBold14(
                modifier = Modifier
                    .width(220.dp)
                    .padding(vertical = 5.dp),
                text = stringResource(R.string.sign_up_desc),
                textAlign = TextAlign.Center
            )

            PrimaryButton(modifier = Modifier.padding(top = 10.dp), onClick = {}) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(R.drawable.facebook_white_icon),
                        contentDescription = stringResource(R.string.facebook_icon),
                        modifier = Modifier
                            .padding(end = 15.dp)
                            .size(22.dp)
                    )
                    AppTextBold14(
                        text = stringResource(R.string.log_in_with_facebook),
                        color = AppColors.White
                    )
                }
            }

            OrSeparator(
                modifier = Modifier.padding(vertical = 20.dp)
            )

            AppTextField(
                modifier = Modifier.padding(vertical = 9.dp),
                text = email.value,
                onValueChange = { value ->
                    email.value = value
                },
                label = stringResource(R.string.email_label),
            )
            AppTextField(
                modifier = Modifier.padding(vertical = 9.dp),
                text = fullName.value,
                onValueChange = { value ->
                    fullName.value = value
                },
                label = stringResource(R.string.full_name_label),
            )
            AppTextField(
                modifier = Modifier.padding(vertical = 9.dp),
                text = userName.value,
                onValueChange = { value ->
                    userName.value = value
                },
                label = stringResource(R.string.username_label),
            )
            AppTextField(
                modifier = Modifier.padding(vertical = 9.dp),
                text = password.value,
                onValueChange = { value ->
                    password.value = value
                },
                label = stringResource(R.string.password_label),
            )

            PrimaryButton(
                modifier = Modifier.padding(top = 9.dp),
                text = stringResource(R.string.sign_up_button_text),
                onClick = {},
            )

            Text(
                modifier = Modifier.padding(start = 50.dp, end = 50.dp, top = 20.dp),
                text = buildAnnotatedString {
                    append("By signing up, you agree to our ")
                    withStyle(AppTextStyle.bold14.toSpanStyle()) {
                        append("Terms")
                    }
                    append(", ")
                    withStyle(AppTextStyle.bold14.toSpanStyle()) {
                        append("Data Policy")
                    }
                    append(" and ")
                    withStyle(AppTextStyle.bold14.toSpanStyle()) {
                        append("Cookie Policy")
                    }
                    append(".")
                },
                style = AppTextStyle.medium14,
                textAlign = TextAlign.Center,
            )
        }
    }
}