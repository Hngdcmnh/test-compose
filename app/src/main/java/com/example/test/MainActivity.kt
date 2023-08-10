package com.example.test

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.test.ui.theme.TestTheme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "home"
                ) {
                    composable("home") { home_(navController) }
                }
            }
        }
    }

}

var i =0
@Composable
fun home_(navController:NavHostController){
    i++
    val context = LocalContext.current
    LaunchedEffect(key1 = Unit, block = {
        delay(3000)
        Log.i("Effect","Launched Effect")
        context.shortToast("Effect: Launched Effect")
    })

    SideEffect {
        Log.i("Effect","Side Effect")
        context.shortToast("Effect: Side Effect")
    }

    DisposableEffect(key1 = Unit, effect = {
        context.shortToast("Effect: Side Effect")
        Log.i("Effect","Disposable Effect")

        onDispose {
            Log.i("Effect","Dispose Effect")
            context.shortToast("Effect: Disposable Effect")
        }
    })

    context.shortToast("Effect: Out Effect")
    Log.i("Effect","Out Effect")

    Button(onClick = {context.shortToast("$i")}){
        Text("Click me")
    }
}

fun Context.shortToast(msg:String = "Coming soon!"){
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}

fun Context.longToast(msg:String){
    Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
}
