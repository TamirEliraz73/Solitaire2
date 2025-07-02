package com.nls.game.solitaire2.ui.data.strings

import androidx.annotation.StringRes
import androidx.compose.ui.graphics.Color
import com.nls.game.solitaire2.R
import com.nls.game.solitaire2.ui.dsl.core.interfaces.IRString

enum class StringColors(@StringRes override val stringResId: Int, color: Color) : IRString {
    GREEN(R.string.green, Color.Green),
    BLUE(R.string.blue, Color.Blue),
    RED(R.string.red, Color.Red)
}