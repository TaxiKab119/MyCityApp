package com.example.mycityapp.data

import com.example.mycityapp.model.Recommendation

data class MyCityUiState (
    /** Selected Category*/
    val currentCategory: Recommendation = DataSource.defaultRecommendation,
    val recommendationList: List<Recommendation> = emptyList(),
    val isShowingListPage: Boolean = true
)