package com.nls.game.solitaire2.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.nls.game.solitaire2.ui.data.strings.StringApp
import com.nls.game.solitaire2.ui.dsl.core.base.SpacingStyle
import com.nls.game.solitaire2.ui.dsl.core.base.StyleProps
import com.nls.game.solitaire2.ui.dsl.styled.StyledText
import com.nls.game.solitaire2.ui.dsl.styled.special.StyledButtonMenu
import com.nls.game.solitaire2.ui.dsl.styled.special.StyledSpacer20
import com.nls.game.solitaire2.ui.navigation.AppRoute

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        StyledText(text = StringApp.APP_NAME) {
            style = StyleProps(
                padding = SpacingStyle(
                    vertical = 40
                )
            )
            fontSize = 80
            textAlign = TextAlign.Center
        }
        StyledSpacer20()
        StyledButtonMenu(navController = navController, appRoute = AppRoute.NEW_GAME)
        StyledSpacer20()
        StyledButtonMenu(navController = navController, appRoute = AppRoute.SETTINGS)
        StyledSpacer20()
        StyledButtonMenu(navController, AppRoute.QUIT)
    }
}