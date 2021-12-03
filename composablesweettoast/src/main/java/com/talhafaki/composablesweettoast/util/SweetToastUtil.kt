package com.talhafaki.composablesweettoast.util

import android.widget.Toast
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.talhafaki.composablesweettoast.main.SweetToast
import com.talhafaki.composablesweettoast.theme.whiteBackground
import com.talhafaki.composablesweettoast.toasttypes.Error
import com.talhafaki.composablesweettoast.toasttypes.Info
import com.talhafaki.composablesweettoast.toasttypes.Success
import com.talhafaki.composablesweettoast.toasttypes.Warning

object SweetToastUtil {

    @Composable
    fun SweetSuccess(message: String, duration: Int = Toast.LENGTH_LONG) {
        val sweetSuccessToast = SweetToast(LocalContext.current)
        sweetSuccessToast.MakeTest(message = message, duration = duration, type = Success())
        sweetSuccessToast.show()
    }

    @Composable
    fun SweetError(message: String, duration: Int = Toast.LENGTH_LONG) {
        val sweetErrorToast = SweetToast(LocalContext.current)
        sweetErrorToast.MakeTest(message = message, duration = duration, type = Error())
        sweetErrorToast.show()
    }

    @Composable
    fun SweetInfo(message: String, duration: Int = Toast.LENGTH_LONG) {
        val sweetInfoToast = SweetToast(LocalContext.current)
        sweetInfoToast.MakeTest(message = message, duration = duration, type = Info())
        sweetInfoToast.show()
    }

    @Composable
    fun SweetWarning(message: String, duration: Int = Toast.LENGTH_LONG) {
        val sweetWarningToast = SweetToast(LocalContext.current)
        sweetWarningToast.MakeTest(message = message, duration = duration, type = Warning())
        sweetWarningToast.show()
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