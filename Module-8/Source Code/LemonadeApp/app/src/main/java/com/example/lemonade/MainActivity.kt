package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LemonadeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LemonadeApp()
                }
            }
        }
    }
}

@Composable
fun LemonadeApp() {
    var currentStep by remember { mutableIntStateOf(1) }
    var squeezeCount by remember { mutableIntStateOf(0) }
    var squeezeTarget by remember { mutableIntStateOf((2..4).random()) }

    when (currentStep) {
        1 -> LemonTextAndImage(
            textLabel = stringResource(R.string.lemon_select),
            imageRes = R.drawable.lemon_tree,
            contentDesc = stringResource(R.string.lemon_tree_content_description),
            onImageClick = {
                currentStep = 2
                squeezeTarget = (2..4).random()
                squeezeCount = 0
            }
        )

        2 -> LemonTextAndImage(
            textLabel = stringResource(R.string.lemon_squeeze),
            imageRes = R.drawable.lemon_squeeze,
            contentDesc = stringResource(R.string.lemon_content_description),
            onImageClick = {
                squeezeCount++
                if (squeezeCount >= squeezeTarget) {
                    currentStep = 3
                }
            }
        )

        3 -> LemonTextAndImage(
            textLabel = stringResource(R.string.lemon_drink),
            imageRes = R.drawable.lemon_drink,
            contentDesc = stringResource(R.string.lemonade_content_description),
            onImageClick = { currentStep = 4 }
        )

        else -> LemonTextAndImage(
            textLabel = stringResource(R.string.lemon_empty_glass),
            imageRes = R.drawable.lemon_restart,
            contentDesc = stringResource(R.string.empty_glass_content_description),
            onImageClick = { currentStep = 1 }
        )
    }
}

@Composable
fun LemonTextAndImage(
    textLabel: String,
    imageRes: Int,
    contentDesc: String,
    onImageClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    ) {
        Image(
            painter = painterResource(imageRes),
            contentDescription = contentDesc,
            modifier = Modifier
                .clickable(onClick = onImageClick)
                .border(2.dp, Color(0xFF69CDD8), RoundedCornerShape(4.dp))
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = textLabel, fontSize = 18.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun LemonadeAppPreview() {
    LemonadeTheme {
        LemonadeApp()
    }
}
