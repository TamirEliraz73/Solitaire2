package com.nls.game.solitaire2.ui.dsl.helpers

import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun buttonColors(
    containerColor: Color = Color.Unspecified,
    contentColor: Color = Color.Unspecified,
    disabledContainerColor: Color = Color.Unspecified,
    disabledContentColor: Color = Color.Unspecified
): ButtonColors = ButtonDefaults.buttonColors(
    containerColor = containerColor,
    contentColor = contentColor,
    disabledContainerColor = disabledContainerColor,
    disabledContentColor = disabledContentColor
)