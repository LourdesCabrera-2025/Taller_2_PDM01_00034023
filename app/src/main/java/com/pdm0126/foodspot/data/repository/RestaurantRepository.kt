package com.pdm0126.foodspot.data.repository

import com.pdm0126.foodspot.data.dummy.sampleRestaurant
import com.pdm0126.foodspot.data.model.Restaurant

class RestaurantRepository {

    fun getRestaurants() : List<Restaurant> {
        return sampleRestaurant
    }

}
