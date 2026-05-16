package com.pdm0126.foodspot.ui.screens.components


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.pdm0126.foodspot.R
import com.pdm0126.foodspot.data.model.Restaurant


@Composable
fun CardRestaurants (restaurant: Restaurant) {

    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFF6F6F6)
        ),
        modifier = Modifier
            .size(width = 240.dp, height = 250.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        )
    ) {
        Column {
            AsyncImage(
                model =  restaurant.imageUrl,
                contentDescription = restaurant.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(140.dp),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier.padding(12.dp)
            ) {
                Text(
                    text = restaurant.name,
                    color = Color.Black,
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.plusjakartasans_medium))
                )
                Text(
                    text = restaurant.description,
                    color = Color.Black,
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.plusjakartasans_light))
                )
            }
        }
    }
}
