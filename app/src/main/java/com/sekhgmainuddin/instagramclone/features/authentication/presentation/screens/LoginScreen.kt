package com.sekhgmainuddin.instagramclone.features.authentication.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sekhgmainuddin.instagramclone.R
import com.sekhgmainuddin.instagramclone.core.components.AppTextField
import com.sekhgmainuddin.instagramclone.core.components.PrimaryButton
import com.sekhgmainuddin.instagramclone.core.styles.app_texts.AppTextBold12
import com.sekhgmainuddin.instagramclone.core.styles.app_texts.AppTextStyle
import com.sekhgmainuddin.instagramclone.core.styles.theme.AppColors
import com.sekhgmainuddin.instagramclone.features.authentication.presentation.components.OrSeparator
import com.sekhgmainuddin.instagramclone.features.authentication.presentation.components.PasswordField

@Preview
@Composable
fun LoginScreen() {
    var userName by remember { mutableStateOf(TextFieldValue()) }
    var password by remember { mutableStateOf(TextFieldValue()) }
    val signUpText = buildAnnotatedString {
        withStyle(style = AppTextStyle.semiBold12.copy(color = AppColors.TextColor3).toSpanStyle()) {
            append(stringResource(R.string.dont_have_an_account))
        }
        withStyle(style = AppTextStyle.semiBold12.copy(color = AppColors.SecondaryBlue).toSpanStyle()) {
            append(" ")
            append(stringResource(R.string.sign_up))
        }
    }

    Scaffold(
        bottomBar = {
            Column(
                modifier = Modifier.fillMaxWidth().padding(
                    bottom = 10.dp,
                ),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                HorizontalDivider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            horizontal = 20.dp,
                        ),
                    color = AppColors.Black.copy(
                        alpha = 0.22f
                    ),
                    thickness = 0.5.dp
                )

                ClickableText(
                    modifier = Modifier.padding(vertical = 20.dp, horizontal = 20.dp),
                    text = signUpText
                ) {

                }
            }
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it.calculateTopPadding())
                .padding(horizontal = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.instagram_text_image),
                contentDescription = "Instagram Logo",
                modifier = Modifier.width(230.dp),
                contentScale = ContentScale.FillWidth
            )
            AppTextField(
                text = userName,
                onValueChange = { text ->
                    userName = text
                },
                label = stringResource(R.string.phone_username_or_email_label),
                modifier = Modifier.padding(vertical = 20.dp)
            )
            PasswordField(
                text = password,
                onValueChange = { text ->
                    password = text
                },
                label = stringResource(R.string.password),
            )
            TextButton(
                modifier = Modifier
                    .offset(x = (10).dp)
                    .align(Alignment.End),
                onClick = {},
            ) {
                AppTextBold12(
                    text = stringResource(R.string.forgot_password),
                    color = AppColors.SecondaryBlue
                )
            }
            PrimaryButton(
                modifier = Modifier
                    .padding(
                        top = 5.dp,
                    ),
                text = stringResource(R.string.log_in),
                onClick = {}
            )
            OrSeparator(
                modifier = Modifier.padding(top = 35.dp, bottom = 25.dp)
            )

            TextButton(onClick = {}) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.facebook_icon),
                        contentDescription = "Facebook Logo",
                        modifier = Modifier.padding(end = 8.dp)
                    )
                    AppTextBold12(
                        text = stringResource(R.string.log_in_with_facebook),
                        color = AppColors.SecondaryBlue
                    )
                }
            }
        }

    }
}

