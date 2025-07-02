package com.nls.game.solitaire2.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color.Companion.White
import com.nls.game.solitaire2.ui.data.strings.StringCommon

//val defaultBackIcon
//    @Composable get() =
//        Icons.AutoMirrored.Filled.ArrowBack //else Icons.AutoMirrored.Filled.ArrowForward

@Composable
fun BackIcon() = Icon(
    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
    contentDescription = StringCommon.BACK.getString(),
    tint = White
)

//@Composable
//fun <T> ColoredCircleIcon(element: SettingOption<T>, defaultColor: Color = Color.Black) = Icon(
//    Icons.Default.Circle,
//    contentDescription = null,
//    tint = element.color ?: defaultColor
//)