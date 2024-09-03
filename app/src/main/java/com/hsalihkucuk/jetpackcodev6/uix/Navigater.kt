package com.hsalihkucuk.jetpackcodev6.uix

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigater(selectedPage : String){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = selectedPage){
        composable("getirMainPage"){
            GetirMainPage()
        }
        composable("getirSearchPage"){

        }
        composable("getirAccountPage"){

        }
        composable("getirOffersPage"){

        }
    }
}