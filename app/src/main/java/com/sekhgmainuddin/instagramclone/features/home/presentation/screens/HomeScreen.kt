package com.sekhgmainuddin.instagramclone.features.home.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sekhgmainuddin.instagramclone.R
import com.sekhgmainuddin.instagramclone.core.styles.theme.AppColors

@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
fun HomeScreen() {
    Column(modifier = Modifier.fillMaxSize().background(AppColors.BackgroundColor)) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(start = 15.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.instagram_text_image),
                contentDescription = "Instagram Logo",
                modifier = Modifier.height(30.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            IconButton(
                onClick = {},
            ) {
                Icon(
                    painter = painterResource(R.drawable.favourite_icon),
                    contentDescription = "Search",
                    modifier = Modifier.size(24.dp)
                )
            }

            IconButton(
                onClick = {},
            ) {
                Icon(
                    painter = painterResource(R.drawable.message_icon),
                    contentDescription = "Search",
                    modifier = Modifier.size(20.dp)
                )
            }
        }
    }
}

