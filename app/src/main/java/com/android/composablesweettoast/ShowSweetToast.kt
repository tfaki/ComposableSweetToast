package com.android.composablesweettoast

import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable

object ShowSweetToast {
    @Composable
    fun Show(activity: ComponentActivity, message: String, types: SweetToastType) {
        val sweetToast = SweetToast.makeTest(
            activity,
            message,
            duration = Toast.LENGTH_LONG,
            type = types
        )
        sweetToast.show()
    }
}