package com.pdm0126.foodspot.ui.screens.components

import android.widget.Space
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
fun CardResult (
    restaurant: Restaurant,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
){
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFFFFBF7)
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp)
            .clickable{onClick()},
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        )
    ) {
        Row(
            modifier = modifier
                .padding(8.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            AsyncImage(
                model = restaurant.imageUrl,
                contentDescription = restaurant.description,
                modifier = Modifier
                    .height(90.dp)
                    .width(110.dp)
                    .clip(RoundedCornerShape(20.dp)),
                contentScale = ContentScale.Crop,
                alignment = Alignment.Center
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                Text(
                    text = restaurant.name,
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.plusjakartasans_medium)),
                    color = Color(0xFFF24405)
                )
                Text(
                    text = restaurant.description,
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font(R.font.plusjakartasans_regular)),
                    color = Color.DarkGray,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.height(2.dp))

                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFFF9B54)
                    )
                ) {
                    Row(
                        modifier = Modifier.padding(16.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text(
                            text = restaurant.categories.joinToString (", "),
                            fontSize = 12.sp,
                            fontFamily = FontFamily(Font(R.font.plusjakartasans_bold)),
                            color =  Color(0xFFB83600)
                        )
                    }
                }
            }
        }
    }
    Spacer(modifier = Modifier.height(8.dp))
}