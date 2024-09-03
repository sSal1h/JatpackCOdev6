package com.hsalihkucuk.jetpackcodev6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hsalihkucuk.jetpackcodev6.ui.theme.JetpackCOdev6Theme
import com.hsalihkucuk.jetpackcodev6.uix.BottomBar
import com.hsalihkucuk.jetpackcodev6.uix.GetirMainPage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackCOdev6Theme {
                BottomBar()
            }
        }
    }
}