package com.android.composablesweettoast

import android.content.Context
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
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.*
import androidx.savedstate.ViewTreeSavedStateRegistryOwner
import com.android.composablesweettoast.ui.theme.*

class SweetToast(mContext: Context) : Toast(mContext) {

    companion object {
        @Composable
        fun makeTest(
            context: ComponentActivity,
            message: String,
            duration: Int = LENGTH_SHORT,
            type: SweetToastType = SweetToastType.INFO
        ): SweetToast {
            val sweetToast = SweetToast(context)
            val views = ComposeView(context)
            when (type) {

                SweetToastType.SUCCESS -> {
                    views.setContent {
                        Surface(modifier = Modifier.wrapContentSize(), color = Color.Transparent) {
                            Row(
                                modifier = Modifier
                                    .background(
                                        color = colorSuccess,
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
                                    painter = painterResource(id = R.drawable.ic_success),
                                    contentDescription = "",
                                )
                                Text(
                                    text = message,
                                    textAlign = TextAlign.Center,
                                    fontSize = 16.sp,
                                    style = TextStyle(color = whiteBackground),
                                    modifier = Modifier.padding(0.dp, 0.dp, 8.dp, 0.dp)
                                )
                            }
                        }
                    }
                }

                SweetToastType.WARNING -> {
                    views.setContent {
                        Surface(modifier = Modifier.wrapContentSize(), color = Color.Transparent) {
                            Row(
                                modifier = Modifier
                                    .background(
                                        color = colorWarning,
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
                                    painter = painterResource(id = R.drawable.ic_warning),
                                    contentDescription = "",
                                )
                                Text(
                                    text = message,
                                    textAlign = TextAlign.Center,
                                    fontSize = 16.sp,
                                    style = TextStyle(color = whiteBackground),
                                    modifier = Modifier.padding(0.dp, 0.dp, 8.dp, 0.dp)
                                )
                            }
                        }
                    }
                }

                SweetToastType.INFO -> {
                    views.setContent {
                        Surface(modifier = Modifier.wrapContentSize(), color = Color.Transparent) {
                            Row(
                                modifier = Modifier
                                    .background(
                                        color = colorInfo,
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
                                    painter = painterResource(id = R.drawable.ic_info),
                                    contentDescription = "",
                                )
                                Text(
                                    text = message,
                                    textAlign = TextAlign.Center,
                                    fontSize = 16.sp,
                                    style = TextStyle(color = whiteBackground),
                                    modifier = Modifier.padding(0.dp, 0.dp, 8.dp, 0.dp)
                                )
                            }
                        }
                    }

                }

                SweetToastType.ERROR -> {
                    views.setContent {
                        Surface(modifier = Modifier.wrapContentSize(), color = Color.Transparent) {
                            Row(
                                modifier = Modifier
                                    .background(
                                        color = colorError,
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
                                    painter = painterResource(id = R.drawable.ic_error),
                                    contentDescription = "",
                                )
                                Text(
                                    text = message,
                                    textAlign = TextAlign.Center,
                                    fontSize = 16.sp,
                                    style = TextStyle(color = whiteBackground),
                                    modifier = Modifier.padding(0.dp, 0.dp, 8.dp, 0.dp)
                                )
                            }
                        }
                    }
                }
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