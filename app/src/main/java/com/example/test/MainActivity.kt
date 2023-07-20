package com.example.test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.test.item.ItemCircle
import com.example.test.item.ItemSquareTextIn
import com.example.test.item.ItemSquareTextOut
import com.example.test.ui.theme.TestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }

}

@Composable
fun Greeting() {
    val context = LocalContext.current
    Column() {
        ItemSquareTextIn(onClick = { /*TODO*/ }, text =  "Item name", icon = {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = null,
                modifier = Modifier
                    .height(100.dp)
                    .background(Color(0xFFFFFFFF)),
                contentScale = ContentScale.Crop,
            )
        }, addIcon = {
            Icon(
                imageVector = Icons.Filled.Face,
                contentDescription = null,
                tint = Color.Red
            )
        })

        ItemSquareTextOut(onClick = { /*TODO*/ }, text =  "Item name", icon = {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = null,
                modifier = Modifier
                    .height(100.dp)
                    .background(Color(0xFFFFFFFF)),
                contentScale = ContentScale.Crop,
            )
        }, addIcon = {
            Icon(
                imageVector = Icons.Filled.Face,
                contentDescription = null,
                tint = Color.Red
            )
        })

        ItemCircle(onClick = { /*TODO*/ }, text =  "Item name", icon = {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = null,
                modifier = Modifier
                    .height(100.dp)
                    .background(Color(0xFFFFFFFF)),
                contentScale = ContentScale.Crop,
            )
        }, addIcon = {
            Icon(
                imageVector = Icons.Filled.Face,
                contentDescription = null,
                tint = Color.Red
            )
        })
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TestTheme {

    }
}