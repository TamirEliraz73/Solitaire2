package com.nls.game.solitaire2.ui.dsl.core.base
/**
 * Defines flexible spacing configuration, used for padding or margin.
 * Supports both general and directional values.
 *
 * Priority: specific overrides general (e.g., [top] overrides [vertical]).
 *
 * @property all Applies to all directions if no specific values are set.
 * @property horizontal Applies to both start and end.
 * @property vertical Applies to both top and bottom.
 * @property start Spacing from the logical start (e.g., left in LTR).
 * @property end Spacing from the logical end (e.g., right in LTR).
 * @property top Spacing from the top.
 * @property bottom Spacing from the bottom.
 */
data class SpacingStyle(
    val all: Int? = null,
    val horizontal: Int? = null,
    val vertical: Int? = null,
    val start: Int? = null,
    val end: Int? = null,
    val top: Int? = null,
    val bottom: Int? = null
)
