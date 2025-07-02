package com.nls.game.solitaire2.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = AppRoute.HOME.route) {
        AppRoute.entries.forEach { route ->
            composable(route.route) {
                route.content(navController)
            }
        }
    }
}
