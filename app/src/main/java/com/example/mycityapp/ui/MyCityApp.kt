package com.example.mycityapp.ui

import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mycityapp.ui.utils.MyCityAppContentType

enum class MyCityScreen() {
    CATEGORY,
    RECOMMENDATION,
    DETAIL
}

@Composable
fun MyCityApp(
    windowSize: WindowWidthSizeClass,
    modifier: Modifier = Modifier
) {
    val viewModel: MyCityViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()

    /** show content based on the window size **/
    val contentType = when (windowSize) {
        WindowWidthSizeClass.Compact,
        WindowWidthSizeClass.Medium -> MyCityAppContentType.LIST_ONLY
        WindowWidthSizeClass.Expanded -> MyCityAppContentType.LIST_AND_DETAIL
        else -> MyCityAppContentType.LIST_ONLY
    }
}