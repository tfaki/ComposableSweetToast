package com.android.composablesweettoast

import androidx.compose.ui.graphics.Color
import com.android.composablesweettoast.ui.theme.colorWarning

class Warning : SweetToastProperty {
    override fun getResourceId(): Int = R.drawable.ic_warning
    override fun getBackgroundColor(): Color = colorWarning
}