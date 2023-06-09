package com.example.mycityapp.model

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons

data class Category(
    @StringRes val titleResourceId: Int,
    val icon: Icons
)
