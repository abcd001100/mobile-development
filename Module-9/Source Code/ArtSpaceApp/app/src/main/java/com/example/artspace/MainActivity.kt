package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpaceTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtSpaceApp()
                }
            }
        }
    }
}

private data class Artwork(
    val imageRes: Int,
    val title: String,
    val artist: String,
    val year: String
)

private val artworks = listOf(
    Artwork(R.drawable.artwork_one, "Fragments of Noon", "A. Taju", "2024"),
    Artwork(R.drawable.artwork_two, "Golden Hour Static", "A. Taju", "2024"),
    Artwork(R.drawable.artwork_three, "Horizon Bands", "A. Taju", "2025")
)

@Composable
fun ArtSpaceApp() {
    var currentIndex by remember { mutableIntStateOf(0) }
    val artwork = artworks[currentIndex]

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        ArtworkWall(imageRes = artwork.imageRes, modifier = Modifier.weight(1f))
        Spacer(modifier = Modifier.height(24.dp))
        ArtworkDescriptor(
            title = artwork.title,
            artist = artwork.artist,
            year = artwork.year
        )
        Spacer(modifier = Modifier.height(24.dp))
        DisplayController(
            onPrevious = {
                currentIndex = if (currentIndex == 0) artworks.lastIndex else currentIndex - 1
            },
            onNext = {
                currentIndex = if (currentIndex == artworks.lastIndex) 0 else currentIndex + 1
            }
        )
    }
}

@Composable
fun ArtworkWall(imageRes: Int, modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier
            .fillMaxWidth(),
        shadowElevation = 8.dp,
        border = BorderStroke(1.dp, Color.LightGray)
    ) {
        Image(
            painter = painterResource(imageRes),
            contentDescription = null,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        )
    }
}

@Composable
fun ArtworkDescriptor(title: String, artist: String, year: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(Color(0xFFF5F5F5))
            .padding(16.dp)
    ) {
        Text(text = title, fontWeight = FontWeight.Light, fontSize = 24.sp)
        Row {
            Text(text = artist, fontWeight = FontWeight.Bold)
            Text(text = "  ($year)")
        }
    }
}

@Composable
fun DisplayController(onPrevious: () -> Unit, onNext: () -> Unit, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Button(onClick = onPrevious, shape = RoundedCornerShape(4.dp)) {
            Text("Previous")
        }
        Button(onClick = onNext, shape = RoundedCornerShape(4.dp)) {
            Text("Next")
        }
    }
}

@Preview(showBackground = true, heightDp = 640)
@Composable
fun ArtSpaceAppPreview() {
    ArtSpaceTheme {
        ArtSpaceApp()
    }
}
