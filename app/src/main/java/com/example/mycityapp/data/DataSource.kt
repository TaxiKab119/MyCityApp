package com.example.mycityapp.data

import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import com.example.mycityapp.R
import com.example.mycityapp.model.Category
import com.example.mycityapp.model.Recommendation

/*
*  Recommendation data
* */

object DataSource {
    val defaultRecommendation: Recommendation = getRestaurantData()[0]

    fun getRestaurantData(): List<Recommendation> {
        return listOf(
            Recommendation(
                id = 1,
                titleResourceId = R.string.yasmines_title,
                addressResourceId = R.string.yasmines_address,
                descriptionResourceId = R.string.yasmines_description,
                imageResourceId = R.drawable.restaurant1
            ),
            Recommendation(
                id = 2,
                titleResourceId = R.string._168_title,
                addressResourceId = R.string._168_address,
                descriptionResourceId = R.string._168_description,
                imageResourceId = R.drawable.restaurant2,
            ),
            Recommendation(
                id = 3,
                titleResourceId = R.string.beertown_title,
                addressResourceId = R.string.beertown_address,
                descriptionResourceId = R.string.beertown_description,
                imageResourceId = R.drawable.restaurant3
            ),
            Recommendation(
                id = 4,
                titleResourceId = R.string.spageddy_title,
                addressResourceId = R.string.spageddy_address,
                descriptionResourceId = R.string.spageddy_description,
                imageResourceId = R.drawable.restaurant4,
            )
        )
    }
    /*TODO*/
    fun getGroceryData(): List<Recommendation> {
        return listOf(

        )
    }
    /*TODO*/
    fun getWesternData(): List<Recommendation> {
        return listOf()
    }
    /*TODO*/
    fun getMustSeeData(): List<Recommendation> {
        return listOf()
    }

    val defaultCategory: Category = getCategoryData()[0]
    fun getCategoryData(): List<Category> {
        return listOf(
            Category(
                titleResourceId = R.string.restaurant_category,
                icon = R.drawable.restaurant_icon
            ),
            Category(
                titleResourceId = R.string.grocery_category,
                icon = R.drawable.grocery_icon
            ),
            Category(
                titleResourceId = R.string.western_category,
                icon = R.drawable.school_icon
            ),
            Category(
                titleResourceId = R.string.must_see_category,
                icon = R.drawable.must_see_icon
            )
        )
    }
}