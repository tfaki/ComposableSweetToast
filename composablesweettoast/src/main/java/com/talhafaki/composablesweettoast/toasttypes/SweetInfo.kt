package com.talhafaki.composablesweettoast.toasttypes

import androidx.compose.ui.graphics.Color
import com.talhafaki.composablesweettoast.util.SweetToastProperty
import com.talhafaki.composablesweettoast.R
import com.talhafaki.composablesweettoast.theme.colorInfo

class Info : SweetToastProperty {
    override fun getResourceId(): Int = R.drawable.ic_info
    override fun getBackgroundColor(): Color = colorInfo
}