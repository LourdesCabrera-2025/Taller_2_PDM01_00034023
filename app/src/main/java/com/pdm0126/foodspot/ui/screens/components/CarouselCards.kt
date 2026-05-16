package com.pdm0126.foodspot.ui.screens.components


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.pdm0126.foodspot.data.model.Restaurant

@Composable
fun CarouselRestaurant(
    title: String,
    modifier: Modifier = Modifier,
    restaurants: List<Restaurant>
) {
    Column(
        modifier = Modifier.fillMaxWidth()
            .padding(10.dp)
    ) {
        Text(
            text = title,
            color = Color.Black,
            modifier = Modifier.padding(start = 16.dp, top = 8.dp, bottom = 8.dp)
        )

        LazyRow(
            contentPadding = PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(restaurants) {restaurant ->
                CardRestaurants(restaurant = restaurant)
            }
        }
    }
}
