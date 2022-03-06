package com.talhafaki.composablesweettoast.main

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.*
import androidx.compose.material.Snackbar
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
fun SweetSnack(
    snackbarRootModifier: Modifier = Modifier,
    contentModifier: Modifier = Modifier,
    backgroundColor: Color = Color.Black,
    actionButtonTextColor: Color = Color.White,
    actionButtonText: String = "Hide",
    snackBarText: String = "Hello SweetSnack!",
    snackBarTextColor: Color = Color.White,
    snackBarTextMaxLines: Int = 1,
    snackBarTextOverflow: TextOverflow = TextOverflow.Ellipsis,
    contentAlignment: Alignment = Alignment.TopCenter
) {
    val visible = remember {
        mutableStateOf(true)
    }
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = contentAlignment
    ) {
        AnimatedVisibility(visible = visible.value) {
            Snackbar(
                action = {
                    TextButton(onClick = { visible.value = false }) {
                        Text(
                            text = actionButtonText,
                            color = actionButtonTextColor
                        )
                    }
                },
                content = {
                    SnackBarContent(
                        modifier = contentModifier,
                        text = snackBarText,
                        color = snackBarTextColor,
                        maxLines = snackBarTextMaxLines,
                        textOverflow = snackBarTextOverflow
                    )
                },
                backgroundColor = backgroundColor,
                modifier = snackbarRootModifier
            )
        }
    }
}

@Composable
fun SnackBarContent(
    modifier: Modifier = Modifier,
    text: String = "Hello SweetSnack!",
    color: Color = Color.White,
    maxLines: Int = 1,
    textOverflow: TextOverflow = TextOverflow.Ellipsis
) {
    Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
        Text(
            text = text,
            modifier = modifier,
            color = color,
            maxLines = maxLines,
            overflow = textOverflow
        )
    }
}