package com.android.composablesweettoast

import androidx.compose.ui.graphics.Color
import com.android.composablesweettoast.ui.theme.colorError

class Error : SweetToastProperty {
    override fun getResourceId(): Int = R.drawable.ic_error
    override fun getBackgroundColor(): Color = colorError
}