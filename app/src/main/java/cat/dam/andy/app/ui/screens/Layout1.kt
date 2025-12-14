package cat.dam.andy.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cat.dam.andy.app.ui.theme.AppTheme
import androidx.compose.foundation.isSystemInDarkTheme

@Composable
fun Layout1(isDarkMode: Boolean = isSystemInDarkTheme()) {

    val backgroundColor = if (isDarkMode) Color.Black else Color.White
    val mainTextColor = if (isDarkMode) Color.White else Color.Black
    val secondaryTextColor = if (isDarkMode) Color.Gray else Color.DarkGray
    val avatarColor = if (isDarkMode) Color.DarkGray else Color.LightGray

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Qui està mirant?",
            color = mainTextColor,
            fontSize = 24.sp,
            modifier = Modifier.padding(bottom = 40.dp)
        )

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            ProfileItem("Usuari 1", avatarColor, mainTextColor)
            ProfileItem("Usuari 2", avatarColor, mainTextColor)
        }

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            ProfileItem("Usuari 3", avatarColor, mainTextColor)
            ProfileItem("Infantil", avatarColor, mainTextColor)
        }

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "Gestionar perfils",
            color = secondaryTextColor,
            fontSize = 14.sp
        )
    }
}


@Composable
fun ProfileItem(name: String, avatarColor: Color, textColor: Color) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(90.dp)
                .clip(CircleShape)
                .background(avatarColor),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = name.first().toString(),
                color = textColor,
                fontSize = 28.sp
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = name,
            color = textColor,
            fontSize = 14.sp
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF000000)
@Composable
fun PreviewLayout1Dark() {
    AppTheme {
        Layout1(isDarkMode = true)
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
fun PreviewLayout1Light() {
    AppTheme {
        Layout1(isDarkMode = false)
    }
}