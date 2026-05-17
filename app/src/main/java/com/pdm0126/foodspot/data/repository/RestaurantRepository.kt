package com.pdm0126.foodspot.data.repository

import com.pdm0126.foodspot.data.dummy.sampleRestaurant
import com.pdm0126.foodspot.data.model.Menus
import com.pdm0126.foodspot.data.model.Restaurant

class RestaurantRepository {

    fun getRestaurants() : List<Restaurant> {
        return sampleRestaurant
    }

    fun getMenus () : List<Menus> {
        return sampleRestaurant.flatMap { it.menu }
    }

    fun getRestaurantById(id: Int): Restaurant? {
        return sampleRestaurant.find { it.id == id }
    }

}
