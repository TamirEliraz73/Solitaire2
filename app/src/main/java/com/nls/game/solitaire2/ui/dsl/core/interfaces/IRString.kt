package com.nls.game.solitaire2.ui.dsl.core.interfaces

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

/**
 * Represents a localized string resource wrapper.
 *
 * @property stringResId The resource ID of the string.
 */
interface IRString {
    val stringResId: Int

    /**
     * Returns the localized string from resources.
     *
     * This function is a composable because it internally calls
     * [stringResource], which reads the string based on the current configuration.
     *
     * Example usage inside a composable:
     * ```
     * @Composable
     * fun Greeting(text: IRString) {
     *     Text(text = text.getString())
     * }
     * ```
     *
     * @return The localized string.
     */
    @Composable
    fun getString(): String = stringResource(stringResId)
}