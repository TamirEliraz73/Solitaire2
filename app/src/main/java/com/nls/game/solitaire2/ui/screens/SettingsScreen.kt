package com.nls.game.solitaire2.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.nls.game.solitaire2.ui.dsl.styled.StyledText

@Composable
fun SettingsScreen(navController: NavHostController) {
    Column {
        StyledText(text = "Hello from Settings") {

        }
    }
}

