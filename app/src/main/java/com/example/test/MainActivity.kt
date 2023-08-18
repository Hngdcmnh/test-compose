package com.example.test

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
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
import kotlinx.coroutines.launch

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

@Composable
fun home_(navController:NavHostController){
    val context = LocalContext.current
    Column(){
        Box(modifier = Modifier.weight(1f)){
            Button(onClick = {
                context.shortToast()
            }){
                Text("Click me")
            }
            Surface( modifier = Modifier.fillMaxSize(),color = Color(0xFFFFFF)) {
            }
        }
        Box(modifier = Modifier.weight(1f)){
            Button(onClick = {
                context.shortToast()
            }){
                Text("Click me")
            }
            Box(modifier = Modifier.fillMaxSize().background(Color(0x60833232)).pointerInput(Unit) {  }){
                Text("")
            }
        }
    }
}

//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//private fun DemoPullToRefresh() {
//    val coroutineScope = rememberCoroutineScope()
//    val listItems = remember { mutableListOf("Item 1") }
//    var isRefreshing by remember { mutableStateOf(false) }
//    val pullRefreshState = rememberPullRefreshState(
//        refreshing = isRefreshing,
//        onRefresh = {
//            isRefreshing = true
//            coroutineScope.launch {
//                listItems.add("Item ${listItems.size + 1}")
//                isRefreshing = false
//            }
//        }
//    )
//    Scaffold(
//        topBar = { TopAppBar(title = { Text("Items") }) }
//    ) { padding ->
//        Box(
//            modifier = Modifier
//                .padding(padding)
//                .pullRefresh(pullRefreshState)
//        ) {
//            LazyColumn(Modifier.fillMaxSize()) {
//                items(listItems) {
//                    ListItem(headlineContent = { Text(text = it) })
//                }
//            }
//
//            PullRefreshIndicator(
//                refreshing = isRefreshing,
//                state = pullRefreshState,
//                modifier = Modifier.align(Alignment.TopCenter)
//            )
//        }
//    }
//}

fun Context.shortToast(msg:String = "Coming soon!"){
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}

fun Context.longToast(msg:String){
    Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
}
