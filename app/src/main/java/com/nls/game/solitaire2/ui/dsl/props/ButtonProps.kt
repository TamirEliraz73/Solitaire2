package com.nls.game.solitaire2.ui.dsl.props

import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import com.nls.game.solitaire2.ui.dsl.core.base.StyleProps
/**
 * Configuration properties for a styled button.
 *
 * @property style Optional style and layout properties (padding, background, etc.).
 * @property enabled Whether the button is enabled. Default is `true`.
 * @property onClick Lambda called when the button is clicked.
 * @property content Composable content displayed inside the button.
 */
class ButtonProps {
    var style: StyleProps? = null
    var enabled: Boolean = true
    var onClick: () -> Unit = {}
    var content: @Composable RowScope.() -> Unit = {}
}