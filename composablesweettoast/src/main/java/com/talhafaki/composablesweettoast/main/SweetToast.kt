package com.talhafaki.composablesweettoast.main

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.*
import androidx.lifecycle.*
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
import androidx.savedstate.ViewTreeSavedStateRegistryOwner
import com.talhafaki.composablesweettoast.util.SweetToastProperty
import com.talhafaki.composablesweettoast.util.SweetToastUtil

class SweetToast(context: Context) : Toast(context) {

    companion object {
        @Composable
        fun MakeTest(
            message: String,
            duration: Int = LENGTH_SHORT,
            type: SweetToastProperty
        ): SweetToast {
            val context = LocalContext.current

            val sweetToast = SweetToast(context)
            val views = ComposeView(context)
            views.setContent {
                SweetToastUtil.SetView(
                    messageTxt = message,
                    resourceIcon = type.getResourceId(),
                    backgroundColor = type.getBackgroundColor()
                )
            }

            ViewTreeLifecycleOwner.set(views, LocalLifecycleOwner.current)
            ViewTreeViewModelStoreOwner.set(views, LocalViewModelStoreOwner.current)
            ViewTreeSavedStateRegistryOwner.set(views, LocalSavedStateRegistryOwner.current)

            sweetToast.duration = duration
            sweetToast.view = views
            return sweetToast
        }
    }
}