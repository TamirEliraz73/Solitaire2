package com.nls.game.solitaire2.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

interface AppAction {
    fun run(navController: NavHostController) {}

    @Composable
    fun RunDialog(navController: NavHostController, onDismiss: () -> Unit) {
    }
}

data class NavigateAction(val route: String) : AppAction {
    override fun run(navController: NavHostController) {
        navController.navigate(route)
    }
}

data class ExecuteAction(val handler: (NavHostController) -> Unit) : AppAction {
    override fun run(navController: NavHostController) = handler(navController)
}

data class ShowDialogAction(
    val content: @Composable (NavHostController, onDismiss: () -> Unit) -> Unit
) : AppAction {
    @Composable
    override fun RunDialog(navController: NavHostController, onDismiss: () -> Unit) {
        content(navController, onDismiss)
    }
}