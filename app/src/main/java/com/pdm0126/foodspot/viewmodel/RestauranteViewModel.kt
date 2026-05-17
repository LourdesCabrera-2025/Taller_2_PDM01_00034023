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

    fun  getRestaurantById(id:Int): Restaurant? {
        return repository.getRestaurantById(id)
    }

    fun searchRestaurants(query: String) : List<Restaurant> {
        return restaurants.filter { restaurant ->
        restaurant.name.contains(query, ignoreCase = true) ||
        restaurant.menu.any {menu->
            menu.name.contains(query, ignoreCase = true)
        }}
    }
}