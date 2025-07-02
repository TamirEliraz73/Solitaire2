package com.nls.game.solitaire2.ui.dsl.props

import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import com.nls.game.solitaire2.ui.dsl.core.base.StyleProps

data class ImageProps(
    val painter: Painter,
    val contentDescription: String? = null,
    val style: StyleProps? = null,
    val contentScale: ContentScale = ContentScale.Fit
)