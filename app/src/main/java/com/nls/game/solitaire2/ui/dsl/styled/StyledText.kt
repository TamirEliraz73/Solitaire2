package com.nls.game.solitaire2.ui.dsl.styled

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.nls.game.solitaire2.ui.dsl.core.interfaces.IRString
import com.nls.game.solitaire2.ui.dsl.extensions.baseModifier
import com.nls.game.solitaire2.ui.dsl.extensions.withStyle
import com.nls.game.solitaire2.ui.dsl.props.TextProps

/**
 * Renders text using default [TextProps].
 *
 * @param text The text string to display.
 */
@Composable
fun StyledText(text: String) = StyledText(text) {}

/**
 * Renders text with customized [TextProps], configured via a builder DSL.
 *
 * Example:
 * ```
 * StyledText("Hello") {
 *     fontSize = 18
 *     fontWeight = FontWeight.Bold
 *     style = StyleProps(padding = SpacingStyle(all = 8))
 * }
 * ```
 *
 * @param text The text string to display.
 * @param build DSL to configure [TextProps].
 */
@Composable
fun StyledText(text: String, build: TextProps.() -> Unit) =
    StyledText(text, props = TextProps().apply(build))

/**
 * Renders text using the given [TextProps].
 *
 * @param text The text string to display.
 * @param props Configuration for typography and layout. See [TextProps].
 */
@Composable
fun StyledText(text: String, props: TextProps) {
    Text(
        text = text,
        fontSize = props.fontSize?.sp ?: TextUnit.Unspecified,
        color = props.color,
        fontWeight = props.fontWeight,
        textAlign = props.textAlign,
        maxLines = props.maxLines,
        overflow = props.overflow,
        modifier = Modifier.baseModifier(props).withStyle(props.style)
    )
}
/**
 * Renders a localized string resource using default [TextProps].
 *
 * @param text The [IRString] instance. The displayed string is obtained via [IRString.getString].
 */
@Composable
fun StyledText(text: IRString) = StyledText(text) {}

/**
 * Renders a localized string resource with customized [TextProps] via DSL.
 *
 * @param text The [IRString] instance. The displayed string is obtained via [IRString.getString].
 * @param build DSL block for configuring [TextProps].
 */
@Composable
fun StyledText(text: IRString, build: TextProps.() -> Unit) =
    StyledText(text, props = TextProps().apply(build))

/**
 * Renders a localized string resource using explicit [TextProps].
 *
 * @param text The [IRString] instance. The displayed string is obtained via [IRString.getString].
 * @param props Styling configuration. See [TextProps].
 */
@Composable
fun StyledText(text: IRString, props: TextProps) {
    StyledText(text = text.getString(), props = props)
}