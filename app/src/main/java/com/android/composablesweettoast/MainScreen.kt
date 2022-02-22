package com.android.composablesweettoast

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.talhafaki.composablesweettoast.util.SweetToastUtil.SweetError
import com.talhafaki.composablesweettoast.util.SweetToastUtil.SweetInfo
import com.talhafaki.composablesweettoast.util.SweetToastUtil.SweetSuccess
import com.talhafaki.composablesweettoast.util.SweetToastUtil.SweetWarning

/**
 * Created by stekinarslan on 02,December,2021
 */

@Composable
fun MainScreen() {
    var openDialogSuccess by remember { mutableStateOf(false) }
    var openDialogError by remember { mutableStateOf(false) }
    var openDialogWarning by remember { mutableStateOf(false) }
    var openDialogInfo by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(modifier = Modifier.padding(12.dp), onClick = {
            openDialogSuccess = true
        }) {
            Text("Sweet Toast Success")
        }

        Button(modifier = Modifier.padding(12.dp), onClick = {
            openDialogError = true
        }) {
            Text("Sweet Toast Error")
        }

        Button(modifier = Modifier.padding(12.dp), onClick = {
            openDialogWarning = true
        }) {
            Text("Sweet Toast Warning")
        }

        Button(modifier = Modifier.padding(12.dp), onClick = {
            openDialogInfo = true
        }) {
            Text("Sweet Toast Info")
        }
    }

    if (openDialogSuccess) {
        openDialogSuccess = false
        SweetSuccess(message = "Success Text!", duration = Toast.LENGTH_SHORT, padding = PaddingValues(top = 16.dp), contentAlignment = Alignment.TopCenter)
    }

    if (openDialogError) {
        openDialogError = false
        SweetError(message = "Error Text!")
    }

    if (openDialogWarning) {
        openDialogWarning = false
        SweetWarning(message = "Warning Text!")
    }

    if (openDialogInfo) {
        openDialogInfo = false
        SweetInfo(message = "Info Text!")
    }

}