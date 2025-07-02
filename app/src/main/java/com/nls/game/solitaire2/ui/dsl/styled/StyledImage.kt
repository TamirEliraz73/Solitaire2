package com.nls.game.solitaire2.ui.dsl.styled

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.nls.game.solitaire2.ui.dsl.extensions.withStyle
import com.nls.game.solitaire2.ui.dsl.props.ImageProps


//@Composable
//fun StyledImage(build: ImageProps.() -> Unit) {
//    val props = ImageProps(
//        painter = painterResource(id = R.drawable.ic_menu_gallery)
//    ).apply(build) // painter חייב להיות מאותחל כלשהו — תחליף לפי הצורך
//    StyledImage(props)
//}

@Composable
fun StyledImage(props: ImageProps) {
    Image(
        painter = props.painter,
        contentDescription = props.contentDescription,
        contentScale = props.contentScale,
        modifier = Modifier.withStyle(props.style)
    )
}