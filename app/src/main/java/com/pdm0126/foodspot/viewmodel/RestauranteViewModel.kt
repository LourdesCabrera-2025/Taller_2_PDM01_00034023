package com.pdm0126.foodspot.viewmodel

import androidx.lifecycle.ViewModel
import com.pdm0126.foodspot.data.model.CategoryMenu
import com.pdm0126.foodspot.data.model.Menus
import com.pdm0126.foodspot.data.model.Restaurant
import com.pdm0126.foodspot.data.repository.RestaurantRepository


class RestauranteViewModel : ViewModel() {

    private val repository = RestaurantRepository()

    val restaurants : List<Restaurant> = repository.getRestaurants()
    val menus: List<Menus> = repository.getMenus()


    val restaurantByCategory : Map<String, List<Restaurant>>
        get() = restaurants
            .flatMap { it.categories }
            .distinct()
            .associateWith { categoria -> restaurants.filter { it.categories.contains(categoria) } }

    val menuByCategory : Map<CategoryMenu, List<Menus>>
        get() = menus.groupBy { it.categoria }

    fun  getRestaurantById(id:Int): Restaurant? {
        return repository.getRestaurantById(id)
    }
}