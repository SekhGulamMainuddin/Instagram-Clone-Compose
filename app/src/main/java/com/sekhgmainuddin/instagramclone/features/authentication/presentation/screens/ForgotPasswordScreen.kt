package com.sekhgmainuddin.instagramclone.features.authentication.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sekhgmainuddin.instagramclone.R
import com.sekhgmainuddin.instagramclone.core.components.AppTextField
import com.sekhgmainuddin.instagramclone.core.components.PrimaryButton
import com.sekhgmainuddin.instagramclone.core.styles.app_texts.AppTextBold14
import com.sekhgmainuddin.instagramclone.core.styles.app_texts.AppTextBold18
import com.sekhgmainuddin.instagramclone.core.styles.app_texts.AppTextSemiBold14
import com.sekhgmainuddin.instagramclone.core.styles.theme.AppColors
import com.sekhgmainuddin.instagramclone.features.authentication.presentation.components.OrSeparator

@Preview
@Composable
fun ForgotPasswordScreen() {
    val emailPhone = remember {
        mutableStateOf(TextFieldValue())
    }

    Scaffold {
        Column(
            modifier = Modifier
                .padding(it)
                .padding(horizontal = 20.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Image(
                modifier = Modifier.size(100.dp),
                painter = painterResource(R.drawable.forgot_password_icon),
                contentDescription = stringResource(R.string.forgot_password_icon),
            )
            AppTextBold18(
                modifier = Modifier.padding(top = 15.dp, bottom = 10.dp),
                text = stringResource(R.string.trouble_logging_in),
                color = AppColors.TextColor2,
            )
            AppTextSemiBold14(
                modifier = Modifier.padding(
                    start = 30.dp,
                    end = 30.dp,
                    bottom = 30.dp,
                ),
                text = "Enter your email, phone, or username and we’ll send you a link to get back into your account.",
            )
            AppTextField(
                text = emailPhone.value,
                onValueChange = { value ->
                    emailPhone.value = value
                },
                label = stringResource(R.string.phone_username_or_email_label),
            )

            PrimaryButton(
                modifier = Modifier.padding(
                    top = 20.dp
                ),
                text = stringResource(R.string.send_login_link),
                onClick = {}
            )

            OrSeparator(
                modifier = Modifier.padding(top = 35.dp, bottom = 45.dp)
            )

            TextButton(
                modifier = Modifier.height(30.dp),
                onClick = {},
                contentPadding = PaddingValues(0.dp),
            ) {
                AppTextBold14(
                    text = stringResource(R.string.create_new_account),
                )
            }

            TextButton(
                modifier = Modifier.height(30.dp),
                onClick = {},
                contentPadding = PaddingValues(0.dp),
            ) {
                AppTextBold14(
                    text = stringResource(R.string.back_to_login),
                )
            }
        }
    }
}