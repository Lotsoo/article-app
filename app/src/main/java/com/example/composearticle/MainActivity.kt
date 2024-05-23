package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun ArticleApp(modifier: Modifier = Modifier) {
    ArticleCard(
        image = painterResource(R.drawable.bg_compose_background),
        title = "Jetpack Compose Tutorial",
        shortDescription = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
        longDescription = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name."
    )
}

@Composable
fun ArticleCard(image: Painter, title: String, shortDescription: String, longDescription: String, modifier: Modifier = Modifier) {
    Column(modifier) {
        Image(painter = image, contentDescription = null)
        Text(
            modifier = Modifier.padding(16.dp),
            text = title,
            fontSize = 24.sp,
        )
        Text(
            modifier = Modifier.padding(start = 16.dp, end =  16.dp),
            textAlign = TextAlign.Justify,
            text = shortDescription
        )
        Text(
            text = longDescription
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ArticleAppPreview() {
    ArticleApp()
}
