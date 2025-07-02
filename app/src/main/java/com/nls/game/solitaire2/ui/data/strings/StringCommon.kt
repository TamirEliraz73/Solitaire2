package com.nls.game.solitaire2.ui.data.strings

import androidx.annotation.StringRes
import com.nls.game.solitaire2.R
import com.nls.game.solitaire2.ui.dsl.core.interfaces.IRString

enum class StringCommon(@StringRes override val stringResId: Int) : IRString {
    NEXT(R.string.next),
    BACK(R.string.back),
    SAVE(R.string.save),
    PRESS(R.string.press)
}