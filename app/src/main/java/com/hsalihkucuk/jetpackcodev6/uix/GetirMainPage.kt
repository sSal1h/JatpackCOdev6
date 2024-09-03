package com.hsalihkucuk.jetpackcodev6.uix

import android.app.Activity
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hsalihkucuk.jetpackcodev6.R
import com.hsalihkucuk.jetpackcodev6.data.entity.GetirCards
import com.hsalihkucuk.jetpackcodev6.ui.theme.LightGrayColor
import com.hsalihkucuk.jetpackcodev6.ui.theme.MainColor

@Composable
fun GetirMainPage(){
    val cardList = remember { mutableStateListOf<GetirCards>() }

    LaunchedEffect(key1 = true) {
        val f1 = GetirCards(1, "Süper İkili", "super_duo")
        val f2 = GetirCards(2, "İndirimler", "discounts")
        val f3 = GetirCards(4, "Kazandıranlar", "winners")
        val f4 = GetirCards(5, "Şımart Kendini", "pamper_yourself")
        val f5 = GetirCards(6, "Su & İçecek", "water_drink")
        val f6 = GetirCards(6, "Meyve & Sebze", "fruit_vegetable")
        val f7 = GetirCards(6, "Süt Ürünleri", "milk_products")
        val f8 = GetirCards(6, "Fırından", "oven")
        val f9 = GetirCards(6, "Atıştırmalık", "snack")
        val f10 = GetirCards(6, "Dondurma", "ice_cream")
        val f11 = GetirCards(6, "Temel Gıda", "staple_food")
        val f12 = GetirCards(6, "Kahvaltılık", "breakfast")
        val f13 = GetirCards(6, "Yiyecek", "food")
        val f14 = GetirCards(6, "Fit & Form", "fit_form")
        val f15 = GetirCards(6, "Kişisel Bakım", "personal_care")
        val f16 = GetirCards(6, "Ev Bakım", "home_care")
        val f17 = GetirCards(6, "Ev & Yaşam", "home_life")
        val f18 = GetirCards(6, "Evcil Hayvan", "pet")
        val f19 = GetirCards(6, "Bebek", "baby")
        val f20 = GetirCards(6, "Cinsel Yaşam", "sexual_health")

        cardList.add(f1)
        cardList.add(f2)
        cardList.add(f3)
        cardList.add(f4)
        cardList.add(f5)
        cardList.add(f6)
        cardList.add(f7)
        cardList.add(f8)
        cardList.add(f9)
        cardList.add(f10)
        cardList.add(f11)
        cardList.add(f12)
        cardList.add(f13)
        cardList.add(f14)
        cardList.add(f15)
        cardList.add(f16)
        cardList.add(f17)
        cardList.add(f18)
        cardList.add(f19)
        cardList.add(f20)

    }

    Column(modifier = Modifier
        .fillMaxSize(), verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally) {
        Row(modifier = Modifier.fillMaxWidth().size(35.dp).border(border = BorderStroke(0.3.dp, Color.LightGray)).clickable {  }, verticalAlignment = Alignment.CenterVertically) {
            Text(text = " İş,", fontSize = 18.sp, color = MainColor, fontWeight = FontWeight.Bold, modifier = Modifier.weight(8f))
            Text(text = "Cumhuriyet Mah. İstiklal Cad. 1 Sok. No: 0 Ankara", fontSize = 18.sp, maxLines = 1, overflow = TextOverflow.Ellipsis, color = Color.Black, modifier = Modifier.weight(72f))
            Icon(modifier = Modifier.size(33.dp), painter = painterResource(id = R.drawable.down_arrow_icon), contentDescription = "Adres Button", tint = MainColor)
        }
        Box(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Image(modifier = Modifier.align(alignment = Alignment.Center).clip(RoundedCornerShape(10.dp)), painter = painterResource(id = R.drawable.getir_banner), contentDescription = "Getir Banner")
        }
        LazyVerticalGrid(columns = GridCells.Fixed(count = 4), modifier = Modifier.fillMaxSize()) {
            items(count = cardList.count(), itemContent = {
                val card = cardList[it]

                Card(Modifier.padding(all = 5.dp)){
                    Column(modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                        .clickable {

                        }) {
                        val activity = (LocalContext.current as Activity)
                        Image(modifier = Modifier.background(color = LightGrayColor).fillMaxWidth().height(83.dp), bitmap = ImageBitmap.imageResource(id = activity.resources.getIdentifier(card.cardImage, "drawable", activity.packageName)), contentDescription = "${card.cardName} Image")
                        Text(modifier = Modifier.align(alignment = Alignment.CenterHorizontally), text = card.cardName, fontSize = 14.sp, color = Color.Black, maxLines = 1, overflow = TextOverflow.Ellipsis)

                    }
                }
            })
        }
    }
}