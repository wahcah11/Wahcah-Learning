package com.wahcah.wahcahlearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wahcah.wahcahlearning.ui.theme.WahcahLearningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Composable
fun wahcah() {
    Text(text = "wahyu cahyo utomo")
    Text(text = "belajar jetpack compose")
}

@Composable
fun komponenSurface() {
    Surface {
        Text(text = "wahyu cahyo utomo")
        Text(text = "belajar jetpack compose")
    }
}

@Composable
@Preview(showBackground = true)
fun belajarKolom() {
    Column {
        Text(text = "Wahyu Cahyo Utomo")
        Text(text = "Mastering apps on Mobile Application")
    }
}

@Composable
fun belajarBaris() {
    Row {
        Text(text = "Wahyu Cahyo Utomo")
        Text(text = "Mastering apps on Mobile Application")
    }
}

@Composable
fun belajarBox() {
    Box {
        Text(text = "Wahyu Cahyo Utomo")
        Text(text = "Mastering apps on Mobile Application")
    }
}
@Preview(showBackground = true, device = "id:Nexus One")
@Composable
fun deepBelajarKolom() {
    Column(
        modifier = Modifier
            .padding(2.dp)
            .border(2.dp, Color.Blue)
            .padding(2.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        Text(text = "Wahyu Cahyo Utomo")
        Text(text = "Mastering apps on Mobile Application")
    }
}
