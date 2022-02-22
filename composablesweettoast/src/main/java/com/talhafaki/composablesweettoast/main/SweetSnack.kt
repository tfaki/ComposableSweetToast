package com.talhafaki.composablesweettoast.main

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Snackbar
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun SweetSnack() {


    val visible = remember { mutableStateOf(true) }
    
    Box(modifier = Modifier.fillMaxSize(), Alignment.TopCenter) {
        AnimatedVisibility(visible = visible.value) {
            Snackbar(
                action = { TextButton(onClick = { visible.value = false }) {
                    Text(text = "Hide")
                }},
                content = {
                    Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                        Icon(imageVector = Icons.Filled.ShoppingCart, contentDescription = "Shopping Cart")
                        Text(text = "Hello", fontWeight = FontWeight.Bold)
                    }
                },
                backgroundColor = Color.Cyan,
                modifier = Modifier.padding(12.dp),
                contentColor = Color.White
            )
        }
    }


//    Box(modifier = Modifier.fillMaxSize()) {
//        SnackbarHost(
//            modifier = Modifier.align(Alignment.BottomCenter),
//            hostState = snackbarHostState,
//            snackbar = { snackbarData: SnackbarData ->
//                Card(
//                    shape = RoundedCornerShape(8.dp),
//                    border = BorderStroke(2.dp, Color.White),
//                    modifier = Modifier
//                        .padding(16.dp)
//                        .wrapContentSize()
//                ) {
//                    Column(
//                        modifier = Modifier.padding(8.dp),
//                        verticalArrangement = Arrangement.spacedBy(4.dp),
//                        horizontalAlignment = Alignment.CenterHorizontally
//                    ) {
//                        Icon(imageVector = Icons.Default.Notifications, contentDescription = "")
//                        Text(text = snackbarData.message)
//                    }
//                }
//            }
//        )
//    }
}