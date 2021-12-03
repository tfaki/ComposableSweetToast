package com.android.composablesweettoast

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import com.talhafaki.composablesweettoast.util.SweetToastUtil.SweetSuccess

/**
 * Created by stekinarslan on 02,December,2021
 */

@Composable
fun MainScreen() {
    var openDialogSuccess by remember { mutableStateOf(false) }

    Button(onClick = {
        openDialogSuccess = true
    }) {
        Text("Sweet Toast Success")
    }

    if (openDialogSuccess) {
        SweetSuccess(message = "Success Text!")
    }
}