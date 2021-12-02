package com.talhafaki.composablesweettoast.toasttypes

import androidx.compose.ui.graphics.Color
import com.talhafaki.composablesweettoast.util.SweetToastProperty
import com.android.composablesweettoast.ui.theme.colorInfo
import com.talhafaki.composablesweettoast.R

class Info : SweetToastProperty {
    override fun getResourceId(): Int = R.drawable.ic_info
    override fun getBackgroundColor(): Color = colorInfo
}