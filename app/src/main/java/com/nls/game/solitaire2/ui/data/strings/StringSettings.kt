package com.nls.game.solitaire2.ui.data.strings

import androidx.annotation.StringRes
import com.nls.game.solitaire2.R
import com.nls.game.solitaire2.ui.dsl.core.interfaces.IRString

enum class StringSettings(@StringRes override val stringResId: Int) : IRString {
    SETTINGS_BACKGROUND_COLOR(R.string.settings_background_color),
    SETTINGS_CARD_SYMBOL(R.string.settings_card_symbol),
    SETTINGS_DRAW_COUNT(R.string.settings_draw_count),
    SETTINGS_SOUND(R.string.settings_sound)
}