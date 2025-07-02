package com.nls.game.solitaire2.ui.dsl.extensions

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.nls.game.solitaire2.ui.dsl.core.interfaces.IRString
import com.nls.game.solitaire2.ui.dsl.props.ButtonProps

/**
 * Adds a Toast message to be shown automatically when the button is clicked.
 *
 * This function wraps the existing [onClick] handler and shows a Toast with the
 * given [message] before executing the original click logic.
 *
 * Must be called from within a [@Composable] context since it uses [LocalContext.current].
 *
 * Example usage:
 * ```
 * StyledButton {
 *     withToast("Button clicked!")
 *     onClick = { /* your logic */ }
 *     content = { Text("Click me") }
 * }
 * ```
 *
 * @param message The text message to show in the Toast.
 */
@Suppress("ComposableNaming")
@Composable
fun ButtonProps.withToast(message: String) {
    val context = LocalContext.current
    val originalOnClick = onClick
    onClick = {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        originalOnClick()
    }
}

/**
 * Adds a Toast message from an [IRString] resource to be shown when the button is clicked.
 *
 * Delegates to [withToast] by resolving the string resource.
 *
 * Must be called from within a [@Composable] context.
 *
 * @param message The [IRString] to resolve the message text from.
 */
@Suppress("ComposableNaming")
@Composable
fun ButtonProps.withToast(message: IRString) {
    withToast(message.getString())
}
