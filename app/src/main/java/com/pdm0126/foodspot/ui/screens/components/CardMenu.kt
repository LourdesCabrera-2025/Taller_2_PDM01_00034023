package com.pdm0126.foodspot.ui.screens.components

import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.pdm0126.foodspot.R
import com.pdm0126.foodspot.data.model.Menus


@Composable
fun CardMenu(
    menus: Menus,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {

    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFFFFBF7)
        ),
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        )
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            AsyncImage(
                model = menus.imageUrl,
                contentDescription = menus.description,
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
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(
                    text = menus.name,
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.plusjakartasans_bold)),
                    color = Color(0xFFF24405)
                )
                Text(
                    text = menus.description,
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.plusjakartasans_regular)),
                    color = Color.DarkGray
                )
                Spacer(modifier.height(4.dp))

                var quantity by remember { mutableIntStateOf(0) }
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(
                        onClick = {
                            if (quantity > 1) quantity --
                        }
                    ) {
                        Text("-")
                    }


                    Text(
                        text = quantity.toString(),
                        fontSize = 14.sp
                    )

                    IconButton(
                        onClick = {
                            quantity ++
                        }
                    ) {
                        Text("+")
                    }

                    Button(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(10.dp)),
                        colors = ButtonDefaults.buttonColors(
                          containerColor = Color(0xFFE04700)
                        ),
                        onClick = {
                            onClick()
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Add,
                            contentDescription = "añadir",
                            tint = Color.White
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = "Añadir",
                            fontSize = 14.sp,
                            fontFamily = FontFamily(Font(R.font.plusjakartasans_medium)),
                            color = Color.White
                        )
                    }
                }

            }

        }
    }
    Spacer(modifier = Modifier.height(10.dp))

}