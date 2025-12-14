package cat.dam.andy.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cat.dam.andy.app.ui.theme.AppTheme
import androidx.compose.foundation.isSystemInDarkTheme


@Composable
fun Layout3(isDarkMode: Boolean = isSystemInDarkTheme()) {

    // Colors segons el mode
    val backgroundColor = if (isDarkMode) Color.Black else Color.White
    val mainTextColor = if (isDarkMode) Color.White else Color.Black
    val labelTextColor = if (isDarkMode) Color.Gray else Color.DarkGray
    val optionBoxColor = if (isDarkMode) Color.DarkGray else Color(0xFFE0E0E0)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp)
    ) {

        Text(
            text = "Mi cuenta",
            color = mainTextColor,
            fontSize = 26.sp,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        Text(text = "Nom d'usuari:", color = labelTextColor)
        Text(text = "Usuari 1", color = mainTextColor, fontSize = 18.sp)
        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Correu electrònic:", color = labelTextColor)
        Text(text = "usuari@example.com", color = mainTextColor, fontSize = 18.sp)
        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Pla:", color = labelTextColor)
        Text(text = "Premium UHD", color = mainTextColor, fontSize = 18.sp)
        Spacer(modifier = Modifier.height(24.dp))

        Text(text = "Opcions:", color = labelTextColor)

        Spacer(modifier = Modifier.height(8.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(optionBoxColor)
                .padding(12.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            Text(text = "Canviar contrasenya", color = mainTextColor)
        }

        Spacer(modifier = Modifier.height(8.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(optionBoxColor)
                .padding(12.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            Text(text = "Tancar sessió", color = mainTextColor)
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF000000)
@Composable
fun PreviewLayout3Dark() {
    AppTheme {
        Layout3(isDarkMode = true)
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
fun PreviewLayout3Light() {
    AppTheme {
        Layout3(isDarkMode = false)
    }
}