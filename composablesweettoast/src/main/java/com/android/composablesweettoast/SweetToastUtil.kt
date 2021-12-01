package com.android.composablesweettoast

import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.android.composablesweettoast.ui.theme.whiteBackground

object SweetToastUtil {
    @Composable
    fun ComponentActivity.SweetSuccess(message: String) {
        val sweetToast = SweetToast.makeTest(
            this,
            message,
            duration = Toast.LENGTH_LONG,
            type = Success()
        )
        sweetToast.show()
    }

    @Composable
    fun ComponentActivity.SweetError(message: String) {
        val sweetToast = SweetToast.makeTest(
            this,
            message,
            duration = Toast.LENGTH_LONG,
            type = Error()
        )
        sweetToast.show()
    }

    @Composable
    fun ComponentActivity.SweetInfo(message: String) {
        val sweetToast = SweetToast.makeTest(
            this,
            message,
            duration = Toast.LENGTH_LONG,
            type = Info()
        )
        sweetToast.show()
    }

    @Composable
    fun ComponentActivity.SweetWarning(message: String) {
        val sweetToast = SweetToast.makeTest(
            this,
            message,
            duration = Toast.LENGTH_LONG,
            type = Warning()
        )
        sweetToast.show()
    }

    @Composable
    fun SetView(messageTxt: String, resourceIcon: Int, backgroundColor: Color) {
        Surface(modifier = Modifier.wrapContentSize(), color = Color.Transparent) {
            Row(
                modifier = Modifier
                    .background(
                        color = backgroundColor,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .wrapContentWidth()
                    .wrapContentHeight()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier.padding(8.dp, 0.dp, 8.dp, 0.dp),
                    painter = painterResource(id = resourceIcon),
                    contentDescription = "",
                )
                Text(
                    text = messageTxt,
                    textAlign = TextAlign.Center,
                    fontSize = 16.sp,
                    style = TextStyle(color = whiteBackground),
                    modifier = Modifier.padding(0.dp, 0.dp, 8.dp, 0.dp)
                )
            }
        }
    }
}