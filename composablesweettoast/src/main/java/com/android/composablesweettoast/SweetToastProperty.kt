package com.android.composablesweettoast

import androidx.compose.ui.graphics.Color

interface SweetToastProperty {
    fun getResourceId(): Int
    fun getBackgroundColor(): Color
}
