package com.nls.game.solitaire2.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController
import com.nls.game.solitaire2.ui.data.strings.StringMenu
import com.nls.game.solitaire2.ui.dsl.core.base.SpacingStyle
import com.nls.game.solitaire2.ui.dsl.core.base.StyleProps
import com.nls.game.solitaire2.ui.dsl.styled.StyledButton
import com.nls.game.solitaire2.ui.dsl.styled.StyledText

@Composable
fun HomeScreen(navController: NavHostController) {
    Column {
        StyledText(text = "Hello from Home") {
            style = StyleProps(
                padding = SpacingStyle(
                    top = 20
                )
            )
            textAlign = TextAlign.Center
        }
        StyledButton {
            content = { StyledText(text = StringMenu.SETTINGS) { fillMaxWidth = false } }
            onClick = { navController.navigate("settings") }
        }
    }
}