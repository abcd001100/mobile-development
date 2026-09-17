package my.edu.aiu.app.mybusinesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import my.edu.aiu.app.mybusinesscard.ui.theme.MyBusinessCardTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            MyBusinessCardTheme {
                BusinessCard()
            }
        }
    }
}

@Composable
fun BusinessCard() {

    val darkBlue = Color(0xFF073B4C)
    val green = Color(0xFF3DDC84)
    val purple = Color(0xFF3700B3)
    val white = Color.White
    val divider = Color(0xFF41616C)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(darkBlue)
    ) {

        // Purple bar at the top
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(24.dp)
                .background(purple)
        )

        // Main content
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            // Android logo
            Image(
                painter = painterResource(
                    id = R.drawable.android_logo
                ),
                contentDescription = "Android logo",
                modifier = Modifier.size(105.dp)
            )

            Spacer(
                modifier = Modifier.height(8.dp)
            )

            // Name
            Text(
                text = "Gentil Pinto",
                color = white,
                fontSize = 45.sp,
                fontWeight = FontWeight.Normal
            )

            Spacer(
                modifier = Modifier.height(4.dp)
            )

            // Job
            Text(
                text = "Software Developer",
                color = green,
                fontSize = 23.sp
            )
        }

        // Phone
        ContactRow(
            icon = "☎",
            text = "+60 XXX-XXX-XXX",
            green = green,
            white = white,
            divider = divider
        )

        // Social media
        ContactRow(
            icon = "●",
            text = "@gentil__pinto",
            green = green,
            white = white,
            divider = divider
        )

        // Email
        ContactRow(
            icon = "✉",
            text = "gentil.pinto.dev@gmail.com",
            green = green,
            white = white,
            divider = divider
        )
    }
}

@Composable
fun ContactRow(
    icon: String,
    text: String,
    green: Color,
    white: Color,
    divider: Color
) {

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {

        // Horizontal divider
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(divider)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp)
                .padding(horizontal = 48.dp),

            verticalAlignment = Alignment.CenterVertically
        ) {

            // Icon
            Text(
                text = icon,
                color = green,
                fontSize = 21.sp,
                modifier = Modifier.width(28.dp)
            )

            Spacer(
                modifier = Modifier.width(24.dp)
            )

            // Contact information
            Text(
                text = text,
                color = white,
                fontSize = 14.sp
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun BusinessCardPreview() {

    MyBusinessCardTheme {
        BusinessCard()
    }
}
