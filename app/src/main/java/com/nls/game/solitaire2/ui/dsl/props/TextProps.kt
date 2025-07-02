package com.nls.game.solitaire2.ui.dsl.props

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import com.nls.game.solitaire2.ui.dsl.core.base.StyleProps

/**
 * Defines text styling options for composables that render text.
 *
 * Includes visual appearance such as size, weight, alignment,
 * and layout behavior such as line limits and overflow handling.
 *
 * @property fontSize Font size in `sp` (scale-independent pixels). Optional.
 * @property color Text color. Defaults to [Color.Unspecified], allowing the theme to decide.
 * @property fontWeight Font weight (e.g. Bold, Light, Normal). Optional.
 * @property textAlign Text alignment within its container (e.g. Center, Start, End). Optional.
 * @property maxLines Maximum number of lines to display. Default is unlimited ([Int.MAX_VALUE]).
 * @property overflow Overflow behavior when the text exceeds [maxLines]. Defaults to [TextOverflow.Clip].
 * @property style Optional [StyleProps] for additional layout styling (e.g., padding, margin, background).
 */
class TextProps {
    /** Font size in scale-independent pixels (sp). */
    var fontSize: Int? = null

    /** Color of the text. Defaults to [Color.Unspecified], letting the theme determine it. */
    var color: Color = Color.Unspecified

    /** Thickness or boldness of the font. Optional. */
    var fontWeight: FontWeight? = null

    /** Horizontal alignment of the text inside its container. Optional. */
    var textAlign: TextAlign? = null

    /** Max number of lines the text can occupy. Unlimited by default. */
    var maxLines: Int = Int.MAX_VALUE

    /** How to handle overflowed text beyond [maxLines]. */
    var overflow: TextOverflow = TextOverflow.Clip

    /** Optional container style (e.g. padding, background, shadow). See [StyleProps]. */
    var style: StyleProps? = null

    /** Whether the text should take up the full width of its container. */
    var fillMaxWidth: Boolean = true
}
