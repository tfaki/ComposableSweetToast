package com.talhafaki.composablesweettoast.toasttypes

import androidx.compose.ui.graphics.Color
import com.talhafaki.composablesweettoast.util.SweetToastProperty
import com.talhafaki.composablesweettoast.R
import com.talhafaki.composablesweettoast.theme.colorWarning

class Warning : SweetToastProperty {
    override fun getResourceId(): Int = R.drawable.ic_warning
    override fun getBackgroundColor(): Color = colorWarning
}