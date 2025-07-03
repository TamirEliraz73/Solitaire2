package com.nls.game.solitaire2.ui.dsl.extensions

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.nls.game.solitaire2.ui.dsl.core.base.SpacingStyle
import com.nls.game.solitaire2.ui.dsl.core.base.StyleProps
import com.nls.game.solitaire2.ui.dsl.props.TextProps

fun Modifier.baseModifier(props: TextProps): Modifier =
    if (props.fillMaxWidth) {
        this.fillMaxWidth()
    } else {
        this
    }


// 🔹 מרכיב Padding
fun Modifier.withSpacing(padding: SpacingStyle?): Modifier {
    padding ?: return this

    fun pick(specific: Int?, fallback: Int?): Dp =
        specific?.dp ?: fallback?.dp ?: padding.all?.dp ?: 0.dp

    return this.then(
        Modifier.padding(
            start = pick(padding.start, padding.horizontal),
            top = pick(padding.top, padding.vertical),
            end = pick(padding.end, padding.horizontal),
            bottom = pick(padding.bottom, padding.vertical)
        )
    )
}

// 🔹 סגנון כללי
fun Modifier.withStyle(style: StyleProps?): Modifier {
    var result: Modifier = this
    result = result.width(style?.width?.dp ?: 150.dp)

    style?.let {
        val shape = RoundedCornerShape(it.cornerRadius?.dp ?: 0.dp)
        result = result.withSpacing(it.padding)

        it.cornerRadius?.let {
            result = result.clip(shape)
        }

        it.backgroundColor?.let { bgColor ->
            result = result.background(bgColor)
        }

        it.border?.let { border ->
            result = result.border(
                width = border.width.dp,
                color = border.color,
                shape = shape
            )
        }

        // הצללה? בהמשך
        // if (it.shadow != null) { ... }
    }
    return result
}