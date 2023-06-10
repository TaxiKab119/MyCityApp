package com.example.mycityapp.data

import com.example.mycityapp.model.Category
import com.example.mycityapp.model.Recommendation

data class MyCityUiState (
    /** Selected Category*/
    val currentCategory: Category = DataSource.defaultCategory,
    val currentRecommendation: Recommendation = DataSource.defaultRecommendation,
    val categoryList: List<Category> = DataSource.getCategoryData(),
    val recommendationList: List<Recommendation> = emptyList(),
    val isShowingListPage: Boolean = true
)