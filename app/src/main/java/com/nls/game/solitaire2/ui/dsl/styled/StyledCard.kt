package com.nls.game.solitaire2.ui.dsl.styled

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nls.game.solitaire2.ui.dsl.core.base.StyleProps
import com.nls.game.solitaire2.ui.dsl.extensions.withStyle


@Composable
fun StyledCard(style: StyleProps? = null, content: @Composable () -> Unit) {
    Card(
        modifier = Modifier.withStyle(style),
        shape = RoundedCornerShape(style?.cornerRadius?.dp ?: 0.dp)
    ) {
        content()
    }
}