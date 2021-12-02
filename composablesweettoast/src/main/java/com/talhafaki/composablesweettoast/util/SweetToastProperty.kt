package com.talhafaki.composablesweettoast.util

import androidx.compose.ui.graphics.Color

interface SweetToastProperty {
    fun getResourceId(): Int
    fun getBackgroundColor(): Color
}
