package com.pdm0126.foodspot.ui.screens.home


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
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
import com.pdm0126.foodspot.ui.screens.components.FoodStopBar
import com.pdm0126.foodspot.viewmodel.RestauranteViewModel


@Composable
fun HomeScreen(modifier: Modifier = Modifier, viewModel: RestauranteViewModel = viewModel()) {

    Scaffold(
        topBar = {
            FoodStopBar()
        }
    ) { innerPadding ->

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(Color(0xFFE1E5E8))
                .padding(innerPadding)
        ) {
            Column {
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
                        focusedBorderColor = Color(0xFF7E00FA),
                        unfocusedBorderColor = Color(0xFF2D3F54),
                        focusedLabelColor = Color(0xFF7E00FA),
                        unfocusedLabelColor = Color(0xFF2D3F54),
                        focusedLeadingIconColor = Color(0xFF7E00FA),
                        unfocusedLeadingIconColor = Color(0xFF2D3F54),
                        focusedTextColor = Color(0xFF2D3F54)
                    )
                )

                Card(

                ) { }
            }
        }
    }

}



