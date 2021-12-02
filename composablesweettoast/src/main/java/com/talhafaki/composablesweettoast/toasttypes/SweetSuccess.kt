package com.talhafaki.composablesweettoast.toasttypes

import androidx.compose.ui.graphics.Color
import com.talhafaki.composablesweettoast.R
import com.talhafaki.composablesweettoast.util.SweetToastProperty
import com.android.composablesweettoast.ui.theme.colorSuccess


class Success : SweetToastProperty {
    override fun getResourceId(): Int = R.drawable.ic_success
    override fun getBackgroundColor(): Color = colorSuccess
}