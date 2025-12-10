package cat.dam.andy.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cat.dam.andy.app.ui.theme.AppTheme

@Composable
fun Layout2() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(8.dp)
    ) {

        Text(
            text = "NETFLIX",
            color = Color.Red,
            fontSize = 28.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Banner simple
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(Color.DarkGray)
                .padding(8.dp),
            contentAlignment = Alignment.BottomStart
        ) {
            Text(text = "Sèrie destacada", color = Color.White)
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Tendències", color = Color.White, fontSize = 20.sp)

        LazyRow (
            modifier = Modifier.padding(vertical = 8.dp)
        ) {
            items(10) {
                Pelicules("Pelicula $it")
            }
        }

        Text(text = "Top 10", color = Color.White, fontSize = 20.sp)

        LazyRow(
            modifier = Modifier.padding(vertical = 8.dp)
        ) {
            items(10) {
                Pelicules("Top $it")
            }
        }
    }
}

@Composable
fun Pelicules(title: String) {
    Column(
        modifier = Modifier
            .width(110.dp)
            .padding(end = 8.dp)
    ) {
        Box(
            modifier = Modifier
                .height(150.dp)
                .fillMaxWidth()
                .background(Color.Gray)
        )
        Text(
            text = title,
            color = Color.White,
            fontSize = 12.sp
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF000000)
@Composable
fun PreviewLayout2() {
    Layout2()
}
