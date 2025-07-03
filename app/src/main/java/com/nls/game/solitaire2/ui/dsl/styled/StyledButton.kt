package com.nls.game.solitaire2.ui.dsl.styled

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.nls.game.solitaire2.ui.dsl.extensions.withStyle
import com.nls.game.solitaire2.ui.dsl.props.ButtonProps

/**
 * Renders a styled button using a builder-style DSL to configure [ButtonProps].
 *
 * Example:
 * ```
 * StyledButton {
 *     onClick = { /* do something */ }
 *     enabled = true
 *     content = { StyledText("Click Me") }
 *     style = StyleProps(
 *         padding = SpacingStyle(all = 8),
 *         backgroundColor = Color.Blue
 *     )
 * }
 * ```
 *
 * @param build DSL block to configure [ButtonProps].
 */
@Composable
fun StyledButton(build: @Composable ButtonProps.() -> Unit) {
    val props = ButtonProps()
    props.build()
    StyledButton(props)
}

/**
 * Renders a styled button using an explicit [ButtonProps] configuration.
 *
 * @param props The [ButtonProps] containing configuration for behavior and style.
 */
@Composable
fun StyledButton(props: ButtonProps) {
    Button(
        onClick = props.onClick,
        enabled = props.enabled,
        modifier = Modifier.withStyle(props.style),
        content = props.content,
        colors = props.colors?: ButtonDefaults.buttonColors()
    )
}