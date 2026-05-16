package com.pdm0126.foodspot.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pdm0126.foodspot.ui.screens.home.DetailRestaurant
import com.pdm0126.foodspot.ui.screens.home.HomeScreen
import com.pdm0126.foodspot.ui.screens.home.SearchRestaurant

@Composable
fun NavManager(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = "homescreen"
    ) {
        composable ("homescreen"){
            HomeScreen(navController)
        }
        composable ("detailrestaurant"){
            DetailRestaurant(navController)
        }
        composable ("searchrestaurant"){
            SearchRestaurant(navController)
        }
    }
}