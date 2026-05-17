package com.pdm0126.foodspot.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pdm0126.foodspot.ui.screens.DetailRestaurant
import com.pdm0126.foodspot.ui.screens.HomeScreen
import com.pdm0126.foodspot.ui.screens.SearchRestaurant

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
        composable ("detailrestaurant/{restaurantId}"){
           backStackEntry ->
            val restaurantId = backStackEntry.arguments
                ?.getString("restaurantId")
                ?.toIntOrNull() ?:0

            DetailRestaurant(
                navController = navController,
                restaurantId = restaurantId
            )
        }

        composable ("searchrestaurant/{query}"){ backStackEntry ->
            val query = backStackEntry.arguments
                ?.getString("query") ?: ""

            SearchRestaurant(
                navController = navController,
                initialQuery = query
            )
        }

    }
}