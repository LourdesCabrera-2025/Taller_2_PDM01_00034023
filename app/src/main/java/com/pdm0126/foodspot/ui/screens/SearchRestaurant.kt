package com.pdm0126.foodspot.ui.screens


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.pdm0126.foodspot.R
import com.pdm0126.foodspot.ui.screens.components.CardResult
import com.pdm0126.foodspot.ui.screens.components.FoodStopBar
import com.pdm0126.foodspot.viewmodel.RestauranteViewModel

@Composable
fun SearchRestaurant(
    navController: NavController,
    initialQuery: String,
    viewModel: RestauranteViewModel = viewModel(),
) {
    val restaurant = viewModel.searchRestaurants(initialQuery)
    var searchText by remember { mutableStateOf("") }
    Scaffold(
        containerColor = Color(0xFFE1E5E8),
        topBar = {
            FoodStopBar(
                title = "Busqueda",
                navigationIcon = {
                    IconButton(
                        onClick = {navController.popBackStack()}
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                }
            )
        }
    ) { innerPaddding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPaddding)
                .padding(16.dp)
        ) {
            if (restaurant.isEmpty()) {
                Text(
                    text = "No se encontraron resultados",
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.plusjakartasans_bold)),
                    color = Color.Black
                )
            }else {
                OutlinedTextField(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth(),
                    value = searchText,
                    onValueChange = {
                        searchText= it
                    },
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
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Search
                    ),

                    keyboardActions= KeyboardActions (
                        onSearch = {
                            if (searchText.isNotBlank()) {
                                navController.navigate("searchrestaurant/$searchText")
                            }
                        }
                    ),
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
                restaurant.forEach {restaurant->
                    CardResult(
                        restaurant  = restaurant,
                        onClick = {
                            navController.navigate("detailrestaurant/${restaurant.id}")
                        }
                    )
                }
            }
        }
    }
}