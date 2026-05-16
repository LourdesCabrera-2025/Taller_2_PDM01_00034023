package com.pdm0126.foodspot.viewmodel

import androidx.lifecycle.ViewModel
import com.pdm0126.foodspot.data.model.Restaurant
import com.pdm0126.foodspot.data.repository.RestaurantRepository


class RestauranteViewModel : ViewModel() {

    private val repository = RestaurantRepository()

    val restaurants : List<Restaurant> = repository.getRestaurants()

    val restaurantByCategory : Map<String, List<Restaurant>>
        get() = restaurants
            .flatMap { it.categories }
            .distinct()
            .associateWith { categoria -> restaurants.filter { it.categories.contains(categoria) } }
}