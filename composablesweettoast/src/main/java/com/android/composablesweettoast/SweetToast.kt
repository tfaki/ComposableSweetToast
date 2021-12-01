package com.android.composablesweettoast

import android.content.Context
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.lifecycle.*
import androidx.savedstate.ViewTreeSavedStateRegistryOwner

class SweetToast(mContext: Context) : Toast(mContext) {

    companion object {
        @Composable
        fun makeTest(
            context: ComponentActivity,
            message: String,
            duration: Int = LENGTH_SHORT,
            type: SweetToastProperty
        ): SweetToast {
            val sweetToast = SweetToast(context)
            val views = ComposeView(context)
            views.setContent {
                SweetToastUtil.SetView(
                    messageTxt = message,
                    resourceIcon = type.getResourceId(),
                    backgroundColor = type.getBackgroundColor()
                )
            }
            ViewTreeLifecycleOwner.set(views, context)
            ViewTreeViewModelStoreOwner.set(views, context)
            ViewTreeSavedStateRegistryOwner.set(views, context)
            sweetToast.duration = duration
            sweetToast.view = views
            return sweetToast
        }
    }
}