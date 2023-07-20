package com.example.test

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.test.button.ElevateButton
import com.example.test.button.HakiButton
import com.example.test.button.HakiButtonColor
import com.example.test.button.HakiButtonDefaults
import com.example.test.button.HakiButtonElevation
import com.example.test.button.MainButton
import com.example.test.button.OutlineButton
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
        HakiButton(
            onClick = {},
            colors = HakiButtonDefaults.mainButtonColors().copy(containerColor = Color.Black),
            trailingIcon = {
                Icon(
                    imageVector = Icons.Filled.Face,
                    contentDescription = null,
                    tint = Color.Red
                )
            }
        )
        Box(modifier = Modifier.size(300.dp)) {
            MainButton(onClick = {  }, text = "Test align", modifier = Modifier.align(Alignment.BottomCenter))
        }
        MainButton(
            text = "Main Button",
            onClick = { Toast.makeText(context, "Main Button", Toast.LENGTH_LONG).show() },
            colors = HakiButtonDefaults.mainButtonColors(containerColor = Color.Red)
        )
        ElevateButton(
            text = "Elevate Button",
            onClick = { Toast.makeText(context, "Elevated Button", Toast.LENGTH_LONG).show() })
        OutlineButton(
            text = "Outline Button",
            onClick = { Toast.makeText(context, "Outline Button", Toast.LENGTH_LONG).show() })
    }
    HakiButton(
        onClick = {},
        colors = HakiButtonDefaults.mainButtonColors().copy(containerColor = Color.Black),
        trailingIcon = AdaptiveIcon.icon(Icons.Filled.Face).content(Color.Red)
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TestTheme {

    }
}