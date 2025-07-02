package com.nls.game.solitaire2.ui.dsl.core.base

import androidx.compose.ui.graphics.Color
/**
 * Encapsulates the full visual styling of a UI component,
 * including padding, margin, background, border, corner radius, and shadow.
 *
 * @property padding Inner spacing around the content. See [SpacingStyle].
 * @property margin Outer spacing from surrounding components. See [SpacingStyle].
 * @property backgroundColor The background color of the component.
 * @property border Border styling (width and color). See [BorderStyle].
 * @property cornerRadius Corner radius in pixels. See [CornerRadius].
 * @property shadow Shadow styling (elevation and color). See [ShadowStyle].
 */
data class StyleProps(
    val padding: SpacingStyle? = null,
    val margin: SpacingStyle? = null,
    val backgroundColor: Color? = null,
    val border: BorderStyle? = null,
    val cornerRadius: CornerRadius? = null,
    val shadow: ShadowStyle? = null
)