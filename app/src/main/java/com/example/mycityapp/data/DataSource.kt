package com.example.mycityapp.data

import com.example.mycityapp.R
import com.example.mycityapp.model.Recommendation

/*
*  Recommendation data
* */

object DataSource {
    val defaultRecommendation: Recommendation = getRestaurantData()[0]

    private fun getRestaurantData(): List<Recommendation> {
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
}