package com.talhafaki.composablesweettoast.main

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.*
import androidx.lifecycle.*
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
import androidx.savedstate.ViewTreeSavedStateRegistryOwner
import com.talhafaki.composablesweettoast.util.SweetToastProperty
import com.talhafaki.composablesweettoast.util.SweetToastUtil

class SweetToast(context: Context) : Toast(context) {

    @Composable
    fun MakeTest(
        message: String,
        duration: Int = LENGTH_LONG,
        type: SweetToastProperty,
        padding: PaddingValues,
        contentAlignment: Alignment
    ) {
        val context = LocalContext.current

        val views = ComposeView(context)
        views.setContent {
            SweetToastUtil.SetView(
                messageTxt = message,
                resourceIcon = type.getResourceId(),
                backgroundColor = type.getBackgroundColor(),
                padding = padding,
                contentAlignment = contentAlignment
            )
        }

        ViewTreeLifecycleOwner.set(views, LocalLifecycleOwner.current)
        ViewTreeViewModelStoreOwner.set(views, LocalViewModelStoreOwner.current)
        ViewTreeSavedStateRegistryOwner.set(views, LocalSavedStateRegistryOwner.current)

        this.duration = duration
        this.view = views
    }
}