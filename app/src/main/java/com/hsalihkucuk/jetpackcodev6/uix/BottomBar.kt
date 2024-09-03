//Vectors and icons by SVG Repo "https://www.svgrepo.com"

package com.hsalihkucuk.jetpackcodev6.uix

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hsalihkucuk.jetpackcodev6.R
import com.hsalihkucuk.jetpackcodev6.ui.theme.AppBarColor
import com.hsalihkucuk.jetpackcodev6.ui.theme.GrayColor
import com.hsalihkucuk.jetpackcodev6.ui.theme.LightGrayColor
import com.hsalihkucuk.jetpackcodev6.ui.theme.MainColor
import com.hsalihkucuk.jetpackcodev6.ui.theme.SecondColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomBar(){
    val selectedPage = remember { mutableStateOf(0) }
    Scaffold(
        topBar = { CenterAlignedTopAppBar(title = { Text(text = "getir", fontSize = 24.sp, fontWeight = FontWeight.Bold) }, colors = TopAppBarColors(containerColor = MainColor, titleContentColor = SecondColor, actionIconContentColor = Color.Transparent, scrolledContainerColor = Color.Transparent, navigationIconContentColor = Color.Transparent)) },
        floatingActionButton = {
            Box {
                FloatingActionButton(shape = CircleShape, containerColor = MainColor, contentColor = SecondColor, onClick = {},
                    modifier = Modifier
                        .align(Alignment.Center)
                        .size(60.dp)
                        .offset(y = 50.dp)
                        .border(border = BorderStroke(3.dp, color = LightGrayColor), shape = CircleShape)) {
                    Icon(modifier = Modifier.size(33.dp), painter = painterResource(id = R.drawable.fab_btn_icon), contentDescription = "Center Button")
                }
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        bottomBar = { BottomAppBar(modifier = Modifier
            .height(53.dp)
            .border(border = BorderStroke(0.5.dp, color = LightGrayColor)), containerColor = Color.White, contentColor = AppBarColor, content = {
        NavigationBarItem(
            selected = selectedPage.value == 0,
            onClick = { selectedPage.value = 0 },
            icon = { Icon(modifier = Modifier.size(33.dp), painter = painterResource(id = R.drawable.home_icon), contentDescription = "Home Button") },
            colors = NavigationBarItemDefaults.colors(selectedIconColor = MainColor, unselectedIconColor = GrayColor, indicatorColor = Color.White))
        NavigationBarItem(
            selected = selectedPage.value == 1,
            onClick = { selectedPage.value = 1 },
            icon = { Icon(modifier = Modifier.size(33.dp), painter = painterResource(id = R.drawable.search_icon), contentDescription = "Search Button") },
            colors = NavigationBarItemDefaults.colors(selectedIconColor = MainColor, unselectedIconColor = GrayColor, indicatorColor = Color.White))
            Spacer(Modifier.weight(1f, true))
        NavigationBarItem(
            selected = selectedPage.value == 2,
            onClick = { selectedPage.value = 2 },
            icon = { Icon(modifier = Modifier.size(30.dp), painter = painterResource(id = R.drawable.account_icon), contentDescription = "Account Button") },
            colors = NavigationBarItemDefaults.colors(selectedIconColor = MainColor, unselectedIconColor = GrayColor, indicatorColor = Color.White))
        NavigationBarItem(
            selected = selectedPage.value == 3,
            onClick = { selectedPage.value = 3 },
            icon = { Icon(modifier = Modifier.size(30.dp), painter = painterResource(id = R.drawable.offer_icon), contentDescription = "Offer Button") },
            colors = NavigationBarItemDefaults.colors(selectedIconColor = MainColor, unselectedIconColor = GrayColor, indicatorColor = Color.White))
    })
    }) { paddingValues ->
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues), verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally) {

            when(selectedPage.value){
                0 -> Navigater("getirMainPage")
                1 -> Navigater("getirSearchPage")
                2 -> Navigater("getirAccountPage")
                3 -> Navigater("getirOffersPage")
            }
        }
    }
}