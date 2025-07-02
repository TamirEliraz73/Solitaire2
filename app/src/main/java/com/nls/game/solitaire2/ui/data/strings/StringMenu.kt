package com.nls.game.solitaire2.ui.data.strings

import androidx.annotation.StringRes
import com.nls.game.solitaire2.R
import com.nls.game.solitaire2.ui.dsl.core.interfaces.IRString

enum class StringMenu(@StringRes override val stringResId: Int) : IRString {
    NEW_GAME(R.string.new_game),
    SETTINGS(R.string.settings),
    QUIT(R.string.quit)
}
