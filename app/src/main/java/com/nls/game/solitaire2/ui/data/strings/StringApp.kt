package com.nls.game.solitaire2.ui.data.strings

import androidx.annotation.StringRes
import com.nls.game.solitaire2.R
import com.nls.game.solitaire2.ui.dsl.core.interfaces.IRString

enum class StringApp(@StringRes override val stringResId: Int) : IRString {
    APP_NAME(R.string.app_name),
    SOLITAIRE_TITLE(R.string.solitaire_title)
}