package com.nls.game.solitaire2.ui.dsl.props

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.ButtonColors
import androidx.compose.runtime.Composable
import com.nls.game.solitaire2.ui.dsl.core.base.StyleProps

/**
 * Configuration properties for a styled button.
 *
 * @property style Optional style and layout properties (e.g., padding, background, shadow).
 * Applied to the button's modifier using [Modifier.withStyle].
 *
 * @property enabled Whether the button is enabled. Default is `true`.
 *
 * @property onClick Lambda called when the button is clicked.
 *
 * @property content Composable content displayed inside the button.
 *
 * @property colors Optional [ButtonColors] to customize the button’s appearance
 * (e.g., background color, content color, disabled colors). If `null`, the default
 * [ButtonDefaults.buttonColors] are used based on the current theme.
 *
 * You can use the [buttonColors] helper to override only specific colors.
 *
 * ### Example:
 * ```
 * StyledButton {
 *     content = { StyledText("Click me") }
 *     onClick = { /* your logic */ }
 *     colors = buttonColors(
 *         containerColor = Color.Green,
 *         contentColor = Color.White
 *     )
 * }
 * ```
 */
class ButtonProps {
    var style: StyleProps? = null
    var enabled: Boolean = true
    var onClick: () -> Unit = {}
    var content: @Composable RowScope.() -> Unit = {}
    var colors: ButtonColors? = null
}