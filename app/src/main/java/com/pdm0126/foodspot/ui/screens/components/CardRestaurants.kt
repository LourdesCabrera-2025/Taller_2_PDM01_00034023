package com.pdm0126.foodspot.ui.screens.components


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.pdm0126.foodspot.R
import com.pdm0126.foodspot.data.model.Restaurant



@Composable
fun CardRestaurants(
    navController: NavController,
    restaurant: Restaurant,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
) {


    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFF6F6F6)
        ),
        modifier = modifier
            .size(width = 200.dp , height = 200.dp)
            .clickable{onClick()},
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        onClick = {
            navController.navigate("detailrestaurant/${restaurant.id}")
        }
    ) {
        Column (
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            AsyncImage(
                model = restaurant.imageUrl,
                contentDescription = restaurant.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(90.dp)
                    .background(Color(0xFFE5E7EB), RoundedCornerShape(4.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = restaurant.name,
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.plusjakartasans_medium)),
                color = Color(0xFFF24405),
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.height(2.dp))

            Text(
                text = restaurant.description,
                fontSize = 12.sp,
                fontFamily = FontFamily(Font(R.font.plusjakartasans_regular)),
                color = Color(0xFF6E6E6E)
            )
        }
    }
}
