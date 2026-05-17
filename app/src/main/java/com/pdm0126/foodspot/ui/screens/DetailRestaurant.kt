package com.pdm0126.foodspot.ui.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ShoppingBag
import androidx.compose.material.icons.filled.Stars
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.pdm0126.foodspot.R
import com.pdm0126.foodspot.ui.screens.components.FoodStopBar
import com.pdm0126.foodspot.ui.screens.components.NavTab
import com.pdm0126.foodspot.viewmodel.RestauranteViewModel

@Composable
fun DetailRestaurant(
    navController: NavController,
    restaurantId: Int,
    viewModel: RestauranteViewModel = viewModel(),
) {
    val restaurants = viewModel.getRestaurantById(restaurantId)
    var selectedProducts by remember { mutableStateOf(setOf<Int>()) }
    val badgeCount = selectedProducts.size

    if (restaurants == null) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Restaurante no encontrado",
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.plusjakartasans_bold))
            )
        }
        return
    }
    Scaffold(
        containerColor = Color(0xFFE1E5E8),
        topBar = {
            FoodStopBar(
                title = restaurants.name,
                navigationIcon = {
                    IconButton(
                        onClick = {
                            navController.popBackStack()
                        }
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                },
                actions = {
                    IconButton(
                        onClick = {

                        }
                    ) {
                        BadgedBox(
                            badge = {
                                if (badgeCount > 0) {
                                    Badge {
                                        Text(text = badgeCount.toString())
                                    }
                                }
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Filled.ShoppingBag,
                                contentDescription = "Shopping"
                            )
                        }
                    }
                }
            )

        }
    )
    { innerPadding ->

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(300.dp)
                ) {
                    AsyncImage(
                        model = restaurants.imageUrl,
                        contentDescription = restaurants.name,
                        modifier = Modifier.matchParentSize(),
                        contentScale = ContentScale.FillHeight
                    )
                    Box(
                        modifier = Modifier
                            .matchParentSize()
                            .background(Color.Black.copy(alpha = 0.3f))
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFFFA464).copy(alpha = 0.3f)
                    )
                ) {
                    Row(
                        modifier = Modifier.padding(16.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Stars,
                            contentDescription = "star",
                            tint = Color(0xFFB83600),
                        )
                        Text(
                            text = "${restaurants.description}",
                            fontSize = 14.sp,
                            fontFamily = FontFamily(Font(R.font.plusjakartasans_light)),
                            color = Color.Black
                        )
                    }
                }
                NavTab(
                    restaurant = restaurants,
                    onAddProduct = {
                        menuId-> selectedProducts  =  selectedProducts + menuId
                    }
                )
            }
        }
    }

}