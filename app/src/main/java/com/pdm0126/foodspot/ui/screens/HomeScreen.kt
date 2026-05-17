package com.pdm0126.foodspot.ui.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pdm0126.foodspot.ui.screens.components.CarouselRestaurant
import com.pdm0126.foodspot.ui.screens.components.FoodStopBar
import com.pdm0126.foodspot.viewmodel.RestauranteViewModel


@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    viewModel: RestauranteViewModel = viewModel(),
) {

    Scaffold(
        topBar = {
            FoodStopBar("FoodSpot")
        }
    ) { innerPadding ->

        Box(
            modifier = modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color(0xFFE1E5E8))
                .padding(innerPadding)
        ) {
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .verticalScroll(rememberScrollState())
            ){
                OutlinedTextField(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth(),
                    state = rememberTextFieldState(),
                    label = {
                        Text(
                            text = "FoodSpot ",
                        )
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Search",
                        )
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFFF2F0F),
                        unfocusedBorderColor = Color(0xFF2D3F54),
                        focusedLabelColor = Color(0xFFFF2F0F),
                        unfocusedLabelColor = Color(0xFF2D3F54),
                        focusedLeadingIconColor = Color(0xFFFF2F0F),
                        unfocusedLeadingIconColor = Color(0xFF2D3F54),
                        focusedTextColor = Color(0xFF2D3F54),
                        cursorColor = Color(0xFFFF2F0F)
                    )
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    val categoria = viewModel.restaurantByCategory

                    categoria.forEach { (categoria, listrestaurants) ->
                        CarouselRestaurant(
                            title = " $categoria",
                            restaurants = listrestaurants,
                            navController = navController
                        )
                    }
                }
            }
        }
    }

}



