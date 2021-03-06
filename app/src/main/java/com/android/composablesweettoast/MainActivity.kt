package com.android.composablesweettoast

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.android.composablesweettoast.ui.theme.ComposableSweetToastTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposableSweetToastTheme {
                MainScreen()
            }
        }
    }
}