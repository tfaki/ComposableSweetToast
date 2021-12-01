package com.android.composablesweettoast

import androidx.compose.ui.graphics.Color
import com.android.composablesweettoast.ui.theme.colorSuccess


class Success : SweetToastProperty {
    override fun getResourceId(): Int = R.drawable.ic_success
    override fun getBackgroundColor(): Color = colorSuccess
}