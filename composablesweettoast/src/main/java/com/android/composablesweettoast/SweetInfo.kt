package com.android.composablesweettoast

import androidx.compose.ui.graphics.Color
import com.android.composablesweettoast.ui.theme.colorInfo

class Info : SweetToastProperty {
    override fun getResourceId(): Int = R.drawable.ic_info
    override fun getBackgroundColor(): Color = colorInfo
}