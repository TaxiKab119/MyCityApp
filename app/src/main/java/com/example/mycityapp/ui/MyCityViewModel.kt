package com.example.mycityapp.ui

import androidx.lifecycle.ViewModel
import com.example.mycityapp.data.DataSource
import com.example.mycityapp.data.MyCityUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MyCityViewModel : ViewModel() {

    /**
     * This first block sets up the ui state to be mutable and initializes category list
     * */
    private val _uiState = MutableStateFlow(MyCityUiState(categoryList = DataSource.getCategoryData()))
    val uiState: StateFlow<MyCityUiState> = _uiState.asStateFlow()


    /**
     * Set the category that is clicked by the user
     * */
    /* TODO */
    fun setCategory() {

    }

    /**
     * Set the recommendation that is clicked by the user
     * */
    /* TODO */
    fun setRecommendation() {

    }
}