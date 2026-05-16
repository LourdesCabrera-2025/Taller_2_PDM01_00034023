package com.pdm0126.foodspot.viewmodel

import androidx.lifecycle.ViewModel
import com.pdm0126.foodspot.data.repository.RestaurantRepository


class RestauranteViewModel : ViewModel() {

    private val repository = RestaurantRepository()

    val restaurants = repository.getRestaurants()
}