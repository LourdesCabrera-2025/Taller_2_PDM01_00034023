package com.pdm0126.foodspot.ui.screens.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pdm0126.foodspot.data.model.CategoryMenu
import com.pdm0126.foodspot.data.model.Restaurant
import kotlin.collections.forEachIndexed
@Composable
fun NavTab(
    modifier: Modifier = Modifier,
    restaurant: Restaurant
) {
    val categories = CategoryMenu.entries
    var selectedTabIndex by remember { mutableIntStateOf(0) }

    Column(modifier = modifier) {
        ScrollableTabRow(
            selectedTabIndex = selectedTabIndex
        ) {
            categories.forEachIndexed {index, category ->

                Tab(
                    selected = selectedTabIndex == index,
                    onClick = {
                        selectedTabIndex = index
                    },
                    text = {
                        Text(text = category.name)
                    }
                )
            }
        }

        val selectedCategory = categories[selectedTabIndex]

        val filteredMenu = restaurant.menu.filter { menu->
            menu.categoria == selectedCategory
        }

        Column(
            modifier = Modifier.padding(12.dp)
        ) {
            filteredMenu.forEach { menu->
                Text(text = menu.name)
                Text(text = menu.description)
            }
        }
    }
}
