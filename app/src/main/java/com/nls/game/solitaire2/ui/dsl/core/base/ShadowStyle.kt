package com.nls.game.solitaire2.ui.dsl.core.base
import androidx.compose.ui.graphics.Color
/**
 * Defines a shadow effect around a component.
 * Inspired by Material Design's elevation model.
 *
 * @property elevation The visual height or depth of the shadow.
 * @property color The shadow color (default is [Color.Black]).
 */
data class ShadowStyle(
    val elevation: Int,
    val color: Color = Color.Black
)
