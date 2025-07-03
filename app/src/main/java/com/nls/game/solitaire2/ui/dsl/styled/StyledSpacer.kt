package com.nls.game.solitaire2.ui.dsl.styled

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * A styled spacer composable that reserves vertical space.
 *
 * The name `StyledSpacer` is chosen to maintain consistency with the rest of
 * the UI DSL components and to provide future flexibility to extend functionality
 * without breaking the API:
 *
 * - Allows adding extra features later (such as color, conditions, margins, etc.)
 * - Clearly represents that this component is part of a unified styling DSL
 * - Ensures readability and maintainability over time in the codebase
 *
 * By default, the height is 0 dp, which means no space is reserved unless
 * a positive height is provided.
 *
 * @param height The height of the spacer in dp. Defaults to 0, meaning no space.
 *
 * @sample
 * StyledSpacer(16)
 */
@Composable
fun StyledSpacer(height: Int = 0) {
    Spacer(modifier = Modifier.height(height.dp))
}